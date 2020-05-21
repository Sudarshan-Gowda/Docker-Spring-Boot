# Docker-Spring-Boot
Deploying Docker Spring Boot Project

## Topics Covered
* Repo mainly covers deploying spring boot application to the docker.

## Running Spring rest locally
`mvn spring-boot:run`

## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/Docker-Spring-Boot/issues

## Working with Rest in Eclipse

### prerequisites
The following items should be installed in your system:
* Tool - STS(Spring Toot Suite) or Eclipse
* Postman - Optional (Can use client API)
* Docker

### Steps:

1) Download this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/Docker-Spring-Boot.git
```
2) To Import the Praject Using STS or Eclipse.
```
File -> Import -> Maven -> Existing Maven project
```


## Looking for something in particular?

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|The Docker File| [DockerFile](https://github.com/Sudarshan-Gowda/Docker-Spring-Boot/blob/master/Dockerfile) |


## Steps to test the application:

### Docker
1) Download and install the docker in your machine
2) Go to your project directory and build the jar file from the command line `mvn clean install`, if your using maven plugin means.
3) Then to build the docker image use the below command,
    `docker build -t docker-spring-boot .`
3) Then you can list out the images to check the docker images has been build successfully or not,
   `docker image`
4) Not we need to run the docker images and need to link it to the mysql running images right, lets  do it by using below command,
  `docker run -p 7070:7070 -d docker-spring-boot`
5) To check the container is running or not use the command `docker ps` which will list out all the runing containers.  
5) Thats all now we can access the deployed application from the port 7070.

Find the below exposed urls to test the application.
	```	
		
		a. To fetch all the course details
		http://localhost:7070/hello/welcome
		

# Contributing

The [issue tracker](https://github.com/Sudarshan-Gowda/Docker-Spring-Boot/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

