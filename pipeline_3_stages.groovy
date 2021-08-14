pipeline {
    agent any

    stages {
        stage('1-Build') {
            steps {
                echo "Start of stage Build"
                echo "Building..."
                echo "End of stage Build"
            }
        }
        stage('2-Test') {
            steps {
                echo "Start of stage Test"
                echo "Testing..."
                echo "End of stage Test"
            }
        }
        stage('3-Deploy') {
            steps {
                echo "Start of stage Deploy"
                echo "Deploying..."
                echo "End of stage Deploy"
            }
        }
    }
}