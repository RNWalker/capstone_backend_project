# capstone_backend_project
The backend for a functional warehouse management system for the fictional company, Rainforest Retail

## Description

This project is a backend for a functional warehouse management system for the fictional company, Rainforest Retail. 

Below is a description of all models available, along with the Class Diagram and Entity Relationship Diagram.

### Employee
An Employee contains a unique id, a name, a username, a password, a list of orders and their position. An employee has a one-to-many relationship with the orders.

### Order
Orders have an id, a date they were placed, a truck, a status, a list of products and whether they are a priority or non-priority order. 

### Product
Products have an id, a name, a stock level, notes, a category, a size, a location, an image and whether it is flammable, heavy or fragile. 

### Truck
Trucks have an id and a maximum capacity. 
 
### Class Diagram
![UML_Models](https://github.com/RNWalker/BackEndProjectGroup4/assets/135848217/59c38de7-945f-46ca-bf43-5d300b067fbe)

![UML_Services_Repositories](https://github.com/RNWalker/BackEndProjectGroup4/assets/135848217/ab512ea4-bd0a-4c9f-a88d-84c02cfd2849)

![UML_Controllers](https://github.com/RNWalker/BackEndProjectGroup4/assets/135848217/ada6e0c2-0cda-478d-ab64-8db74df45613)

### Entity Relationship Diagram
![FinalERD](https://github.com/RNWalker/BackEndProjectGroup4/assets/78052216/04b5ea68-b412-44f4-a916-5c7d0a822108)


-------------

## Tech Stack

The technologies used for this project are:
- Intellij IDEA, running JDK 17
- Spring Boot
- H2 Server
- Postman


-------------


## How to use the API

### RESTful route endpoints

##### To access the endpoints of the program, use `https://localhost:{port}/{endpoint}` - the default port is 8080 but any can be used

- INDEX
  - `GET https://localhost:8080/orders` returns all orders in JSON format.
  - `GET https://localhost:8080/trucks` returns all trucks in JSON format.

- SHOW
  - `GET https://localhost:8080/trucks/{id}` returns a particular truck in JSON format.
  - `GET https://localhost:8080/orders/{id}` returns a particular order in JSON format.
  - `GET https://localhost:8080/employees/{id}` returns a particular employee in JSON format.

- UPDATE
  - `PATCH https://localhost:8080/orders/updateOrderStatus?orderId={orderId}&employeeId={employeeId}&truckId={truckId}&status={newStatus}` updates an order by assigning an employee and a truck to the order, and updating the status of the order to 'ONGOING'.
  -  `PATCH https://localhost:8080/products/decreaseStockLevel?orderId={orderId}` decreases the stock level of the products contained in a particular order, updating the 'stockLevel' property of the products.

----------------

## Dependancies
- Spring Web
- SpringBoot Devtools
- Spring Data JPA
- H2 Database
- JUnit Jupiter
- AssertJ Core

----------------

## Collaborators
- Charlotte Gould -addLink
- Sandra Martinez addLink
- Sarah O'Connor addLink
- Rebecca Walker
- 
