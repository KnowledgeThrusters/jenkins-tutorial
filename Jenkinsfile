pipeline {
    agent {
        docker {
            image 'php:8.2'
        }
    }

    stages {
        stage('Syntax Check') {
            steps {
                sh '''
                mkdir -p logs
                find . -name "*.php" | xargs -n1 php -l > logs/lint.log || true
                '''
            }
        }

        stage('Archive Lint Logs') {
            steps {
                archiveArtifacts artifacts: 'logs/lint.log'
            }
        }
    }
}
