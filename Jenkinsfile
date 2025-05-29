pipeline {
    agent any

    stages {
        stage('Prepare Output') {
            steps {
                sh '''
                mkdir -p output
                echo "Hello from Jenkins!" > output/hello.txt
                echo "Current build number is $BUILD_NUMBER" > output/build-info.txt
                '''
            }
        }
    }
}
