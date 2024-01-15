def call() {
    sh 'trivy image hammedakinwale/youtube:latest > trivyimage.txt'
}
