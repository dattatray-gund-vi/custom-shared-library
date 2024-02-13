package io.sdlc.jenkins.pipeline.stages

static def build() {
//    stage('Build') {
//        sh "echo 'Building the project'"
//    }
    sh "echo 'Building the project'"
}

def test() {
    stage('Test') {
        sh "echo 'Testing the project'"
    }
}

def sonarScan() {
    stage('Sonar Scan') {
        sh "echo 'Running SonarQube scan'"
    }
}

def deploy() {
    stage('Deploy') {
        // Your deployment steps here
        sh "echo 'Deploying the project'"
    }
}
