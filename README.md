# Visit counter

This project, created for demonstration purposes, contains a simple Javalin web application that communicates with a Redis database (via Jedis) to persistently store data.

## How to start Portainer
To start the Portainer, navigate, run docker compose and check:
```bash
cd portainer
docker compose up -d
docker compose ps
docker compose logs portainer
```

## Ports and Access
The Portainer interface will be available on port 9443.  

Quick access via the link:   
https://localhost:9443


## How to start Web application
First, create a configuration file `.env` by copying the provided template:
```bash
cd ../project
cp .env.example .env
```

After that, build and run the code:
```bash
docker compose up -d --build
```

## Ports and Access
After a successful start, the web application will be available on port 8080.  

Quick access via the link:   
http://localhost:8080

The database runs on port 6379 (default for Redis); however, this port is not exposed to the outside network, as per the assignment conditions.
