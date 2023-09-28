# capstone_backend_project
The backend for a functional warehouse management system for the fictional company, Rainforest Retail

## Description

This project is a backend for a functional warehouse management system for the fictional company, Rainforest Retail. 


Below is a description of all models available, along with the Class Diagram and Entity Relationship Diagram.

### Employee
An Employee contains a unique id, a name, a username, a password, a list of orders and their position. An employee has a one-to-many relationship with the orders.

### Order
Orders have an id, a date they were placed, a truck, a status, a list of products and whether they are priority. 

### Product
Products have an id, a name, a stock level, notes, a category, a size, a location, an image and whether it is flammable, heavy or fragile. 

### Truck
Trucks have an id and a max capacity. 
 
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

For every model, User, Pet, Food and Toy they each have REST controllers that provide basic CRUD functionality, with all models having Ind

- INDEX
  - `GET https://localhost:8080/pets` returns all pets in JSON format.
  - The pet model specifically also has a filter to look for happiness and energy level less than a integer value.

- SHOW
  - `GET https://localhost:8080/pets/{id}` returns the pet with unique id = {id}.

- CREATE
  - `POST https://localhost:8080/pets` creates a pet with a unique id, and returns all pets, including the new created pet. Attributes of this new pet must be sent in JSON format in the request body in Postman.
  - Attributes that must be sent to create a new pet include; name, species and userId.

- UPDATE
  - `PATCH https://localhost:8080/pets/{id}` updates the pet with unique id = {id}, and returns the updated pet. All attributes of the pet that is being updated, changed or not, should be sent in JSON format in the request body in Postman. 
  - Attributes that must be sent to update a pet include; name, species, userId,happinessLevel, energyLevel, toyIds and foodIds. With toyIds and foodIds both being lists.

- DELETE
  - `DELETE https://localhost:8080/pets/{id}` deletes the pet with unique id = {id}.Once the pet has been deleted, all remaining pets are returned.
  
- PLAY
  - `PATCH https://localhost:8080/pets/{id}/play?toyId={toyId}` Will play with the pet that has the unique id = {id}.
  - Returns the pet, with the toy that has just been played with removed.
  - Specifically for Pet model.

- FEED
  - `PATCH https://localhost:8080/pets/{id}/feed?foodId={foodId}` Will feed the pet that has the unique id = {id}.
  - Returns the pet, with the food that it has just been fed with removed.
  - Specifically for Pet model.     
    
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
