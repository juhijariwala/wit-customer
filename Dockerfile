FROM java:8-alpine

WORKDIR /app

COPY target/wit-customer.jar .

EXPOSE 8080

CMD java -jar wit-customer.jar