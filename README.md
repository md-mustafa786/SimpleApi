# SimpleApi
### Requirments
 * IntelliJIDEA
 * Serverport: 8080 (use: localhost:8080)
 * Java version: 17
 * Everything is present in the pom.xml (no need to download any library)
### Steps to run Application
 * Download the source code and import in intellijIDEA.
 * Go to localhost:8080/
 * Type endpoints 
 * If need then provide RequestBody in json format and Path-variable or path-param.
 
 User will perform following operations - 
 ##### 1) - Add User Info -
 In AddUser functionality we Post User info through Postman and it gets added to the User list - 
 ##### -> Add User EndPoints:
       * Home - localhost:8080/
       * Endpoint - /save

 
 ##### 2) - Get a User Info by UserId -
 In this functionality we provide a perticular User info by sending the userid in url through @Pathvariable - 
  ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - /by-id/{id}
 
 
 
 ##### 3) - Get all User Info -
 This functionality provides all User info list - 
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - /get-all
 
 
 ##### 4) - Update User Info by UserId-
 This functionality Updates a perticular User info through Postman by sending userid in url - 
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - /update/{id}
 
 

 ##### 5) - Delete User Info by UserId-
 This functionality deletes particular User info through Postman using the Delete method by sending the user-id in URL-
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - /delete
 


### Note
* You can change server port by setting properties in application.properties file i.e.

        server.port=8081
 
