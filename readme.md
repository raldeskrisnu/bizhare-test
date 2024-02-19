# Bizhare-Test

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