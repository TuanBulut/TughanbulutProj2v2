# Product Management REST API
[![Ask DeepWiki](https://devin.ai/assets/askdeepwiki.png)](https://deepwiki.com/TuanBulut/TughanbulutProj2v2)

This repository contains a Spring Boot application that provides a RESTful API for managing product information. It demonstrates a simple implementation of CRUD (Create, Read, Update, Delete) operations using Spring Web, Spring Data JPA, and an in-memory H2 database.

## Features

*   **Create** a new product.
*   **Retrieve** a specific product by its ID.
*   **Retrieve** a list of all products.
*   **Update** an existing product's details.
*   **Delete** a product by its ID.
*   **API Documentation** with Swagger UI.
*   **Centralized Exception Handling**.

## Technologies Used

*   Java 17
*   Spring Boot 3
*   Spring Data JPA
*   Maven
*   H2 In-memory Database
*   Springdoc OpenAPI (Swagger UI)

## Getting Started

Follow these instructions to get the project up and running on your local machine.

### Prerequisites

*   JDK 17 or later
*   Apache Maven

### Installation & Running

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/TuanBulut/TughanbulutProj2v2.git
    cd tughanbulutproj2v2
    ```

2.  **Run the application using Maven:**
    ```sh
    mvn spring-boot:run
    ```
    The application will start on `http://localhost:8080`.

## API Documentation

This project uses Springdoc OpenAPI to generate interactive API documentation. Once the application is running, you can access the Swagger UI at:

*   **Swagger UI:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

This interface allows you to explore, test, and view the details of all available API endpoints.

## API Endpoints

The base path for the API is `/api/v1/product`.

| Method | Endpoint                    | Description              | Request Body Example              | Success Response (Status Code) |
|--------|-----------------------------|--------------------------|-----------------------------------|--------------------------------|
| `POST` | `/`                         | Creates a new product    | `{"name": "New Awesome Gadget"}`   | `201 CREATED`                  |
| `GET`  | `/{id}`                     | Finds a product by ID    | N/A                               | `302 FOUND`                    |
| `GET`  | `/`                         | Gets all products        | N/A                               | `200 OK`                       |
| `PUT`  | `/{id}`                     | Updates a product by ID  | `{"name": "Updated Gadget Name"}` | `200 OK`                       |
| `DELETE`| `/{id}`                     | Deletes a product by ID  | N/A                               | `204 NO CONTENT`               |

### Error Response

If a product is not found for a given ID, the API will return a `404 NOT FOUND` status with the following response body:

```json
{
  "message": "Product not found with id {id}"
}
```

## Database

The application uses an in-memory H2 database. The data is volatile and will be reset every time the application restarts.

The H2 database console is enabled and can be accessed to view the database schema and data.

*   **H2 Console URL:** [http://localhost:8080/console/](http://localhost:8080/console/)
