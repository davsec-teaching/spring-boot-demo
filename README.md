1. `mvn spring-boot:run`
2. For the Post request `curl -X POST http://localhost:30000/myservice/sayhello   -H "Content-Type: application/json"   -d '{"postContent": "Hello, duck Spring Boot!"}'`
3. For the GET request just visit `http://localhost:30000/myservice/greeting?name=YourName`

