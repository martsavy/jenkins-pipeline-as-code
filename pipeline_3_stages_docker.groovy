pipeline {
    agent {
        docker { image 'python:latest' }
    }

    environment {
        PROJECT_NAME = "MyProject1"
        OWNER_NAME   = "Aliaksandr"
    }

    stages {
        stage('1-Build') {
            steps {
                echo "Start of stage Build"
                echo "Building..."
                sh '''
                    echo "Line1"
                    echo "Line2"
                '''
                echo "End of stage Build"
            }
        }
        stage('2-Test') {
            steps {
                echo "Start of stage Test"
                echo "Testing..."
                echo "Hello ${OWNER_NAME}"
                echo "Project name is: ${PROJECT_NAME}"
                echo "End of stage Test"
            }
        }
        stage('3-Deploy') {
            steps {
                echo "Start of stage Deploy"
                echo "Deploying..."
                sh "python --cersion"
                echo "End of stage Deploy"
            }
        }
    }
}