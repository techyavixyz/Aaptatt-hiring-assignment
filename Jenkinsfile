pipeline {
    agent any
    
    tools {
        jdk 'jdk11'
        maven 'maven'
    }

    stages {
        stage('Git Checkout') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/techyavixyz/Aaptatt-hiring-assignment.git'
            }
        }
        
        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }
        
        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Build WAR') {
            steps {
                sh 'mvn clean package'
            }
}
        stage('Build Docker Images') {
            steps {
                script {
                    // Build Docker images
                    sh 'sudo docker-compose build'

                    // Clean up existing Docker containers
                    sh 'sudo docker-compose down'
                }
            }
        }
        stage('Run Docker Containers') {
            steps {
                script {
                    // Stop existing Docker containers
                    sh 'sudo docker-compose down'

                    // Start Docker containers in detached mode
                    sh 'sudo docker-compose up -d'
                }
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials-id', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                        sh "docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}"

                        sh 'sudo docker-compose push'
                       
                   }
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
