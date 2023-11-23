#!/usr/bin/env groovy

def gv

pipeline {
    agent any
    
    stages {

        stage("init") {
            steps {
                script{
                    gv = load "script.groovy"
                }
            }
        }

        stage('BuildJar') {
            steps {
                script {
                    gv.BuildJar()
                }
            }
        }

        stage('Testing') {
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
