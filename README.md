# PolitseiApplication

This is a simple REST API for managing arithmetic operations.

## Installation

1. Clone the repository.
2. Open the project in your preferred IDE with Spring support.
3. Build and run the project.

## Endpoints

### Add Numbers

**Endpoint:** `/add`

- **Method:** `GET`
- **Parameters:**
    - `number1` (required): The first number.
    - `number2` (required): The second number.
- **Response:** A JSON object representing the arithmetic operation, which includes the numbers involved and the result.

**Example:**

Request: `GET /add?number1=5&number2=3`

Response: `{"number1":5, "number2":3, "result":8}`

### Query Operations

**Endpoint:** `/query`

- **Method:** `GET`
- **Parameters:**
    - `number` (optional)
    - `ascending` (required): boolean
  
**Example:**

Request: `GET /query?number=8&ascending=true`

Response: `[{"number1":5, "number2":3, "result":8}, {"number1":2, "number2":6, "result":8}]`

## Usage

To test the endpoints, you can use tools like [Postman](https://www.postman.com/) 
