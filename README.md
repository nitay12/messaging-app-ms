# Messaging App

## _Home assignment for Hapoalim Bank_

### Architecture

The app has two service - consumer and producer

#### Producer

- Receiving a message via Rest API
- Sends the message to a RabbitMQ server
- Return status 200 and "success" message to the client

#### Consumer

- Receiving messages from the RabbitMQ server and prints them to the console

### Run

#### Via command line

After building the services:

```sh
messaging-app-ms\producer\target> java -jar producer.java
messaging-app-ms\consumer\target> java -jar consumer.java
```

#### Via Docker

```sh
messaging-app-ms> docker-compose up
```

### Usage
To send a message to the producer, make a POST request to `localhost:8080/messages`.

Request body example:
```json
{
  "message": "YOUR MESSAGE"
}
```