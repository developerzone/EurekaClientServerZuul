# EurekaClientServerZuul
This consists of an Eureka Server,a client and the Zuul API gateway.

Open all the applications (myeurekaserver, catalog, zuul) separately in Intellij Idea. 

Start all the applications. Hit http://localhost:8761/ and see how the client is registering itself to Eureka Server and we do not need to register Zuul as it is not a client.

Run the client separately at port 8081 by hitting http://localhost:8081/product/list 

The client in this example also contains the H2 database with Spring JPA for database Manipulation. 

Try accessing the same application through the API gateway i.e. http://localhost:8085/catalog/product/list

Here catalog refers to the service name and /product is the path to the restcontroller in our client.

Please check the details in application.properties of zuul application.

Play with the properties and do add more features to understand the concept better.
