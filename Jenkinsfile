pipeline {
agent any

stages {

    stage('Build') {
        steps {
            sh 'javac CrudOperation.java'
        }
    }

    stage('Run') {
        steps {
            sh 'echo 5 | java CrudOperation'
        }
    }
}

}
