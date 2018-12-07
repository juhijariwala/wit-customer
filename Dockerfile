FROM java:8-alpine

WORKDIR /app

COPY target/wit-customer.jar .

CMD java -jar wit-customer.jar

