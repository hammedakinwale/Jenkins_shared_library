def call() {
    withSonarQubeEnv('sonarqube') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Youtube -Dsonar.projectKey=Youtube '''
    }
}