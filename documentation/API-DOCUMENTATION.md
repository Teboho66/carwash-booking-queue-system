# API Documentation

## Swagger UI

Run the application:

```bash
mvn spring-boot:run
```

or:

```powershell
.\mvnw.cmd spring-boot:run
```

Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI JSON:

```text
http://localhost:8080/v3/api-docs
```

## Documented API Areas

- Users
- Vehicles
- Services
- Bookings
- Queue Entries

## Export OpenAPI JSON

```bash
curl http://localhost:8080/v3/api-docs -o docs/openapi.json
```

or:

```powershell
Invoke-WebRequest -Uri "http://localhost:8080/v3/api-docs" -OutFile "docs/openapi.json"
```

## Screenshot Evidence

Swagger UI screenshot:
