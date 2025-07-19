def call(Map args = [:]) {
    def branch = args.branch ?: 'main'
    def version = args.version ?: 'default-version'

    stage('Prepare Output') {
             echo "Branch: ${branch}"
             echo "version: ${version}"
            sh '''
            mkdir -p output
            echo "Hello from Jenkins!" > output/hello.txt
            '''
    }
}
