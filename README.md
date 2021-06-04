# automobile_rest

This is a sample project generated by Spring Boot 2.3.0, using spring initializr,  managing just one domain class, Automobile. It exposes a rest API listening on localhost:8080/automobile_rest/api/automobile.
Dependicies used are Devtools, Spring Data, Web and H2 because the project just use the embedded version of the H2 database.

**I should also emphasise certain particularly important issues, such as refresh token and invalidation token. None of these are managed by this backend application at the moment. The responsability to invalidate a token is given to clients app (i.e. removing token from their own local storage).**

On startup two users are created, one *admin* and one *common user* in order to test authorization. The user can do anything, common user just HTTP GET Operations.
I did some test by the help of Postman. If you try to access Automobile resources you get a 401. To authenticate you have to invoke localhost:8080/public/login using json body:

```
{
	"username":"admin",
	"password":"admin"
}
```

or

```
{
    "username":"commonUser",
    "password":"commonUser"
}
```


## Getting Started

After cloning execute the following command from the project root folder:

```
mvnw spring-boot:run
```

### Prerequisites

You need a Java Development Kit (JDK) installed.


## Author

* **Alberto Multari** - *Software Engineer and coding lover* 


