package fajlestik_null;

import io.javalin.Javalin;
import redis.clients.jedis.Jedis;

public class Main {
    static void main() {
        String redisHost = System.getenv().getOrDefault("REDIS_HOST", "redis");
        int redisPort = Integer.parseInt(System.getenv().getOrDefault("REDIS_PORT", "6379"));

        Jedis jedis = new Jedis(redisHost, redisPort);

        Javalin.create(config -> {
                config.routes.get("/", ctx -> {
                    long visits = jedis.incr("visits");
                    ctx.result("This page has been visited " + visits + " times.");
                });
        }).start(8080);

    }
}
