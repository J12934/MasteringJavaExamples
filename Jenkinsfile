pipeline {
	agent any
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
}

