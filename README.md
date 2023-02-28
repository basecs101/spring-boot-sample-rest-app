# spring-boot-sample-rest-app
A sample spring boot rest application and demo rest methods


> http://localhost:8080/greeting?name=Vikram

* http -> protocol
* localhost -> domain name
* 8080 -> http port
* /greeting -> path or endpoint
* name -> request parameter key
* Vikram -> request parameter value

### Spring Boot Annotations:
1. SpringBootApplication
2. SpringBootTest
3. RestController : The Spring boot `@RestController` annotation, which marks the class 
as a controller where every method returns a domain object instead of a view. 
It is shorthand for including both `@Controller` and `@ResponseBody`.
4. GetMapping
5. RequestParam

### Reference [Tutorial](https://spring.io/guides/gs/rest-service/)