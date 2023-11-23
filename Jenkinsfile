#!/usr/bin/env groovy

def gv

pipeline {
    agent any

    parameters {
        choice(name: 'ENV', choices: ['dev', 'staging', 'prod'], description: 'Select the environment')
        booleanParam(name: 'ENABLE_TESTS', defaultValue: false, description: 'Enable testing')
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
            steps {
                script {
                    gv.DeployJAr()
                }
            }
        }
    }
}
