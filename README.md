# REST API for Bazazr E-Commerce Website

* I developed this REST API for one of my capstone projects. This API performs all the fundamental CRUD operations of any e-commerce platform with user validation at every step.
* This project was developed and continuosly developing as one of my final projects @SEMICOLON AFRICA. 

## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* Postgres
*Javamail Sender
*Twillio

## Modules

* User
* Email
* Notification 
* Product 
* Cart 
* Order 

## Features

* Customer authentication & validation 
* Customer Features:
    * Registering themselves with application, and logging in to get the valid session token
    * Viewing different products and adding them to cart and placing orders
    * Only logged in user can access his orders, cart and other features.


## Installation & Run

* Before running the API server, you should update the database config inside the [application.properties](E-Commerce-Backend\src\main\resources\application.properties) file. 
* Update the port number, Javamail sender setup.

```
spring.mail.host=localhost
spring.mail.port=1025
spring.mail.username=hello
spring.mail.password=hello
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.ssl.trust="*"
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.connectiontimeout=5000
spring.mail.properties.mail.smtp.timeout=3000
spring.mail.properties.mail.smtp.writetime=5000
 

```
       Install MailDev
       npm install -g maildev
       
       Run maildev
       
       maildev
``````````````````       
       

## API Root Endpoint

`https://localhost:8080/


## API  Endpoints

### Login & Logout 

* `POST /register/customer` : Register a new user
* `POST /login/customer` : Logging in customer with valid email address & password
* `POST /logout/customer` : Logging out user
* `POST /register/seller` : Register a new seller
* `POST /login/seller` : Logging in Seller
* `POST /logout/seller` : Logging out Seller based on session token


### User

* `GET /customer/current` : Getting currently logged in user
* `GET /customer/orders` : Getting order history of logged in user
* `GET /customers` : Getting All user
* `PUT /customer` : Updates logged in user
* `PUT /customer/update/password` : Updates user password
* `PUT /customer/update/card` : Updates credit card details
* `PUT /customer/update/address?type=home` : Updates user's home address
* `PUT /customer/update/credentials` : Updates email address
* `DELETE /customer` : Deletes registered user
* `DELETE /customer/delete/address?type=home` : Deletes user's home address


### Product 

* `GET /product/{id}` : Gets product with given product id
* `GET /products` : Gets all products
* `GET /products/{category}` : Gets product with given category
* `GET /products/seller/{id}` : Gets product of given seller id
* `POST /products` : Adds a new product to database
* `PUT /products` : Updates the product with given product id
* `PUT /products/{id}` : Updates product quantity
* `DELETE /product/{id}` : Deletes product with given id


### Cart 

* `GET /cart` : Get all items in Customer Cart
* `POST /cart/add` : Add item to Cart
* `DELETE /cart` : Remove item from Cart
* `DELETE /cart/clear` : Clear entire cart


### Order 

* `GET /orders/{id}` : Gets order details with given order id
* `GET /orders` : Gets all orders
* `GET /orders/by/date` : Gets orders placed on given date (DD-MM-YYYY)
* `POST /order/place` : Places a new order based on cart items
* `PUT /orders/{id}` : Updates a pending order
* `DELETE /orders/{id}` : Cancels an order
