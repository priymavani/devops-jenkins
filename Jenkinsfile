pipeline {
agent any

stages {

    stage('Checkout') {
        steps {
            git url: 'https://github.com/priymavani/devops-jenkins/', branch: 'main'
        }
    }

    stage('Build') {
        steps {
            bat 'javac CrudOperation.java'
        }
    }

    stage('Run') {
        steps {
            bat 'echo 5 | java CrudOperation'
        }
    }
}

}
