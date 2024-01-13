def call() {
    sh 'trivy image hammed/youtube:latest > trivyimage.txt'
}
