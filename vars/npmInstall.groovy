

def call() {
    node {
        stage('NPM Install') {
            sh 'npm install'
        }
    }
}
