pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hi, it\'s build"'
            }
        }
        stage('Test') {
            steps {
               sh 'echo "Hi, it\'s test"'
            }
        }
        stage('Deliver') {
            steps {
                sh 'echo "Hi, it\'s deliver"'
            }
        }
    }
}