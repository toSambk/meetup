# meetup

`meetup` is a small multi-module Java project prepared for a meetup about `REST vs SOAP vs GraphQL`.

## Modules

- `meetup-graphql-impl` - a Spring Boot application that exposes a GraphQL API for vehicles and wheels
- `meetup-soap-impl` - a Spring Boot SOAP application with a sample country web service

## Tech Stack

- Maven multi-module build
- Spring Boot
- Spring Data JPA
- H2 database
- GraphQL Java tools
- Spring Web Services
- Lombok

## Project Layout

- `pom.xml` - parent build and shared dependency management
- `meetup-graphql-impl` - GraphQL demo implementation
- `meetup-soap-impl` - SOAP demo implementation

## Build

Run the full multi-module build from the repository root:

```bash
mvn clean package
```

## Run The Demos

Start the GraphQL module:

```bash
mvn -pl meetup-graphql-impl spring-boot:run
```

Start the SOAP module:

```bash
mvn -pl meetup-soap-impl spring-boot:run
```

## Notes

- the GraphQL module includes sample schema files and request examples under `meetup-graphql-impl/requests`
- the SOAP module includes WSDL and XSD files under `meetup-soap-impl/src/main/resources`
- generated SOAP client classes are already committed to the repository

## Verification

The repository can be verified with:

```bash
mvn test
```

This project currently does not include meaningful automated test coverage, so the command mainly validates compilation and module wiring.
