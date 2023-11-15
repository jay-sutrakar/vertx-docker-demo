package docker;

import io.vertx.core.AbstractVerticle;

public class HelloVerticle extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(request -> {
            System.out.println("server is started");
            request.response().end("Hello java world");
        }).listen(8080);
    }
}
