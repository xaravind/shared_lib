def call() {
    stage('Check CPU Info') {
        sh 'cat /proc/cpuinfo'
    }

    stage('Check Java Version') {
        sh 'java -version'
    }
}
