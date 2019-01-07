pipeline {
	agent any
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
				sh './gradlew clean'
				sh './gradlew assemble'
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
}

