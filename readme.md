# Bizhare-Test
This project propose for technical test

##Tech Stack
- Spring Cloud Gateway
  This is spring boot gateway technology, its easy to routing and forwarding to diffrent microservices. it supports various predicates and filters for flexible routing based
- Spring Security
  it easy to integration with spring ecosystem
- Eureka
  Eureka is including health monitoring, and also do dynamic service registration and discovery as long as we config very well.
- RestTemplate
  AFAIK, Rest template is syncronous by nature. it works in a blocking manner, which means it sends a request and waits for a response before continuing with next task. in this case it supposed to be okey to use this.
- Jwt
  its stateless authentication, jwt can be used for stateless authentication. since the token contains necessary information about the user, the server doesnt need to store the users session state. this is especially benefical for microservices.
- Swagger
  Api documentation

## Architecture
![Architecture](/image/bizshare-test.jpg "Architecture")

## Database schema

```
create schema identity-service;

create table if not exists t_user_credential
(
    id       int auto_increment
        primary key,
    email    text null,
    password text null,
    name     text null
);
```

## Run Services
```
mvn spring-boot:run
```

## Swagger
```
http://localhost:8082/swagger-ui/index.html
http://localhost:8989/swagger-ui/index.html

```
![Swagger-1](/image/swagger-1.png "Swagger-1")
![Swagger-2](/image/swagger-2.png "Swagger-2")