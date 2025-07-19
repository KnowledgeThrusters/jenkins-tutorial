def call(Map args = [:]) {
    def branch = args.branch ?: 'main'
    def service = args.service ?: 'default-service'

    stage('Prepare Output') {
             echo "Branch: ${branch}"
             echo "Service: ${service}"
            sh '''
            mkdir -p output
            echo "Hello from Jenkins!" > output/hello.txt
            '''
    }
}
