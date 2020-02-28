# sales-taxes
Coding Problem: Sales Taxes

## About this Project

The idea behind this project is to create a back-end Restful Java API, that will process and serve data in a JSON format to a front-end React application. The React app will be a simple application that contains a select drop-down list with all items available to purchase, and a component that will show the receipt with taxes applied at each item and the total price.

This project still have pending features to implement and improve. Due to the deadline approach I tried to priorized the back-end and the front-end with Mocked data to show interaction between the two applications. 

### Database

To create a Docker container with Postgres database, run:

```
docker run --name database -e POSTGRES_PASSWORD=docker -p 5432:5432 -d postgres
```

You can use a PostgreSQL GUI client (such as Postbird for example) to connect with Postgres that is running on Docker.
1. Create a database called sales_taxes
2. Import the sql file with the schema and data from database folder (still in progress)

#### Pending
- I still need to create some tables and necessary relationships
- Future Improvement: Create migrations and seeds to populate tables (instead of import sql files)

### Back-end
The back-end for solving this coding problem is a Restful Java API created with Spring boot, that exposes 2 endpoints:

1. GET http://localhost:8080/items

that lists all the items avaliable for purchase in a JSON format, to be consumed by the front-end and fill a select drop-down, such as 

```
  {
    "id": 1,
	"name": "chocolate bar",
	"imported": false,
	"price": 0.85,
	"category": "FOOD"
  },
  {
    "id": 2,
	"name": "Book",
	"imported": false,
	"price": 12.49,
	"category": "BOOK"
  }
]
```

2. GET http://localhost:8080/cart

that lists all purchased items with respective grossPrices (prices + taxes), totalAmmount and totalTaxes, such as 

```
{
  "items": [
    {
      "name": "Book",
      "imported": false,
      "price": 12.49,
      "grossPrice": 12.49,
      "category": "BOOK"
    },
    {
      "name": "music CD",
      "imported": false,
      "price": 14.99,
      "grossPrice": 16.49,
      "category": "OTHER"
    },
    {
      "name": "chocolate bar",
      "imported": false,
      "price": 0.85,
      "grossPrice": 0.85,
      "category": "FOOD"
    }
  ],
  "totalAmmount": 29.83,
  "totalTaxes": 1.5
}
```

3. POST http://localhost:8080/cart

that will be called every time an item is purchased in the front-end. For now it can be tested using Postman.

```
POST body example 1
{
	"id": 1,
	"name": "chocolate bar",
	"imported": false,
	"price": 0.85,
	"category": "FOOD"
}

POST body example 2
{
	"id": 2,
	"name": "Book",
	"imported": false,
	"price": 12.49,
	"category": "BOOK"
}

POST body example 3
{
	"id": 3,
	"name": "music CD",
	"imported": false,
	"price": 14.99,
	"category": "OTHER"
}
```

#### Pending
- Annotate models that represent tables with @Entity
- Turn Repository into Interfaces and extends CrudReposository
- Add the quantity atrribute for purchased item to multiply 
- Tests for almost all the classes are still peding due to deadline approach

### Front-end
The front-end still have some pending features, due to deadline approach there wasn't possible to finish them.
When started, front-end will be running on http://localhost:3000/.

#### Pending
- Finish the html form to POST purchased items to localhost:8080/cart
- Create Component to show Receipt (but Java is already providing it in JSON format)

