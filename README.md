# sales-taxes
Coding Problem: Sales Taxes

## About this Project

## Setup

### Database

To create a Docker container with Postgres database, run:

```
docker run --name database -e POSTGRES_PASSWORD=docker -p 5432:5432 -d postgres
```

You can use a PostgreSQL GUI client (such as Postbird for example) to connect with Postgres that is running on Docker.
1. Create a database called sales_taxes
2. Import the sql file with the schema and data (still in progress)


### Back-end
The back-end for solving this coding problem is a Restful Java Api created with Spring boot, that exposes 2 endpoints:

1 - http://localhost/items

that lists all the items avaliable for purchase in a JSON format, to be consumed by the front-end and fill a dropbox, such as 

```
  {
    "name": "Book",
    "imported": false,
    "price": 12.49,
    "category": "BOOK"
  },
  {
    "name": "CD",
    "imported": false,
    "price": 14.99,
    "category": "OTHER"
  }
]
```

2- http://localhost/cart

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


#### Pending
- Annotate models that represent tables with @Entity
- Turn Repository into Interfaces and extends CrudReposository
- 

### Front-end

### Running
