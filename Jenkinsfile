pipeline {
	agent { label 'any' }
	environment { 
        AUTHOR_NAME = bat (
			  script: "git show -s --format='%%an' HEAD",
			  returnStdout: true
		).split('\r\n')[2].trim()
		
		AUTHOR_EMAIL = bat (
			  script: "git show -s --format=%%ae HEAD",
			  returnStdout: true
		).split('\r\n')[2].trim()
    }
	triggers { pollSCM('H/3 * * * *') }
    stages {
		stage ('Checkout'){
			steps {
				echo 'Starting checkout....'
				checkout scm
			}
		}
		stage ('Build'){
			steps {
				echo 'Building..'
			}
		}
		stage ('Parallel Stage'){
			parallel{
				stage ('Test'){
					steps {
						echo 'Testing..'
					}
				}
				stage ('Analysis'){
					steps {
						echo 'Analysis using SonarQube..'
					}
				}
			}
		}
	}
	post {
		always {
			echo "The last commit was written by ${AUTHOR_NAME}, ${AUTHOR_EMAIL}."
		}
		success {
			mail to:"${AUTHOR_EMAIL}", subject:"SUCCESS: ${currentBuild.fullDisplayName}", body: "Yay, we passed :) \n\n Check the console output at ${env.BUILD_URL}"//mail to:"sascha.beier@macio.de"
		}
		failure {
			mail to:"${AUTHOR_EMAIL}", subject:"FAILURE: ${currentBuild.fullDisplayName}", body: "Something went wrong with ${env.JOB_NAME} [${env.BUILD_NUMBER}]: \n\n Check the console output at ${env.BUILD_URL}"
		}
	}
}

