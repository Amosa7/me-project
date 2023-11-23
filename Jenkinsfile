#!/usr/bin/env groovy

def gv

pipeline {
    agent any

    parameters {
        choice(name: 'ENV', choices: ['dev', 'staging', 'prod'], description: 'Select the environment')
        booleanParam(name: 'ENABLE_TESTS', defaultValue: false, description: 'Enable testing')
        choice(name: 'ENV', choices: ['1.2.3', '2.1.0', '2.1.1'], description: 'Select the environment')
    }
    
    stages {

        stage("init") {
            steps {
                script{
                    gv = load "script.groovy"
                }
            }
        }

        stage('BuildJar') {

            when {
                expression { params.ENV }
            }
            steps {
                script {
                    gv.BuildJar()
                }
            }
        }

        stage('Testing') {

            when {
                expression { params.ENABLE_TESTS }
            }
            steps {
                script {
                    gv.Testing()
                }
            }
        }

        stage('DeployJar') {
            input {
                message "Kindly inout the version of the Application"
                parameters {
                    choice(name: 'VERSION', choices: ['1.2.3', '2.1.0', '2.1.1'], description: 'Select the App Version')
                }
                ok "Done"


            }
            steps {
                script {
                    gv.DeployJAr()
                }
            }
        }
    }
}
