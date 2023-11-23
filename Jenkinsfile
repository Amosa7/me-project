#!/usr/bin/env groovy

pipeline {
    agent any
    
    stages {
        stage('BuildJar') {
            steps {
                script {
                    echo "Building Jar of the Application"
                }
            }
        }

        stage('Testing') {
            steps {
                script {
                    echo "Testing the Application"
                }
            }
        }

        stage('DeployJar') {
            steps {
                script {
                    echo "Deploying the application"
                }
            }
        }
    }
}
