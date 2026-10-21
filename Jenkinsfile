pipeline {
    agent any

    environment {
        MVN = '"C:\\Tools\\apache-maven-3.9.16-bin\\apache-maven-3.9.16\\bin\\mvn.cmd"'
    }

    options {
        timestamps()
        timeout(time: 15, unit: 'MINUTES')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run API Tests') {
            steps {
                bat "${env.MVN} -B clean test"
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/surefire-reports/**', allowEmptyArchive: true
        }
        success {
            echo 'All API tests passed.'
        }
        failure {
            echo 'Build failed. Check the console output.'
        }
    }
}
