Microprofile REST Example
==================

This example shows a simple REST-API with intern H2 Database access running on Payara Micro.

Technologies
------------

- Payara Micro
- Eclipse MicroProfile
- Hibernate
- H2 Database

Preparation
----------

Download the current Payara Micro Server from [https://www.payara.fish/products/downloads/all-downloads/]()

Build
----------

Run `./mvnw clean package` or `mvnw.cmd clean package` (Windows) to build this project.

Run
----------

`java -jar payara-micro-{VERSION}.jar target/microprofile-rest-example-1.0.war`