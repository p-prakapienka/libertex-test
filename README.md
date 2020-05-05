# libertex-test

## Build

mvn clean package

## Build Docker Image

docker build -t libertex-test .

## Run Docker Container

docker ru libertex-test

## Run with Docker Compose

docker-compose up

## API

GET  /api/user - get all users  
POST /api/user - create new user  
PUT  /api/user - update existing user  
