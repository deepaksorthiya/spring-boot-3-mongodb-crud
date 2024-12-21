[![Java Maven Build Test](https://github.com/deepaksorthiya/spring-boot-3-mongodb-crud/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/spring-boot-3-mongodb-crud/actions/workflows/maven-build.yml)

# Getting Started

## Requirements:

```
Git: 2.47.1
Spring Boot: 3.4.1
Maven: 3.9+
Java: 17
Docker Engine: 25.0.2
MongoDB: 8.0.3
```

### Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/spring-boot-3-mongodb-crud.git
```

```bash
cd spring-boot-3-mongodb-crud
```

### Start MongoDB In Docker:

```bash
docker compose up
```

### Run Spring Boot Application Using

```bash
./mvnw spring-boot:run
```  

### Example API Calls

```bash
curl -X POST -H "Content-Type: application/json" -d '{
  "saleDate": "2013-10-14T20:05:16.962Z",
  "items": [
    {
      "name": "notepad",
      "tags": [ "office", "writing", "school" ],
      "price": "35.02",
      "quantity": 3
    },
    {
      "name": "notepad",
      "tags": [ "office", "writing", "school" ],
      "price": "22.7",
      "quantity": 2
    }
  ],
  "storeLocation": "London",
  "customer": { "gender": "M", "age": 32, "email": "erro@finhu.gn", "satisfaction": 4 },
  "couponUsed": true,
  "purchaseMethod": "In store"
}' 'http://localhost:8080/api/sales/sale'
```

```bash
curl --location 'http://localhost:8080/api/sales'
```

```bash
curl -X 'GET' 'curl http://localhost:8080/api/sales/673daa018355002af47f6672' -H 'accept: */*'
```

```bash
curl -X PUT -H "Content-Type: application/json" -d '{
  "id": "673daa018355002af47f6672",
  "saleDate": "2013-10-14T20:05:16.962Z",
  "items": [
    {
      "name": "notepad",
      "tags": [ "office", "writing", "school" ],
      "price": "35.02",
      "quantity": 3
    },
    {
      "name": "notepad",
      "tags": [ "office", "writing", "school" ],
      "price": "22.7",
      "quantity": 2
    }
  ],
  "storeLocation": "London",
  "customer": { "gender": "M", "age": 32, "email": "erro@finhu.gn", "satisfaction": 4 },
  "couponUsed": true,
  "purchaseMethod": "In store"
}' 'http://localhost:8080/api/sales/updateUser'
```

```bash
curl --location 'http://localhost:8080/api/sales/673daa018355002af47f6672'
```

```bash
curl --location 'http://localhost:8080/api/sales/aggregation/London'
```

```bash
curl --location 'http://localhost:8080/api/sales/aggregation/groupStage/Denver'
```

```bash
curl --location 'http://localhost:8080/api/sales/aggregation/TotalSales'
```

```bash
curl --location 'http://localhost:8080/api/sales/aggregation/PopularItem'
```

```bash
curl --location 'http://localhost:8080/api/sales/aggregation/buckets'
```

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/maven-plugin/build-image.html)
* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/reference/testing/testcontainers.html#testing.testcontainers)
* [Testcontainers MongoDB Module Reference Guide](https://java.testcontainers.org/modules/databases/mongodb/)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/reference/data/nosql.html#data.nosql.mongodb)
* [Testcontainers](https://java.testcontainers.org/)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

### Testcontainers support

This project
uses [Testcontainers at development time](https://docs.spring.io/spring-boot/3.3.5/reference/features/dev-services.html#features.dev-services.testcontainers).

Testcontainers has been configured to use the following Docker images:

* [`mongo:8.0.3`](https://hub.docker.com/_/mongo)

Please review the tags of the used images and set them to the same as you're running in production.

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

