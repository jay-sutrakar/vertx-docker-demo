package docker;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

public class HelloVerticle extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);
        router.get("/")
                .handler(rc -> {
                    rc.response().setStatusCode(200)
                            .end("Hello from vertx docker demo.");
                });
        vertx.createHttpServer()
                .requestHandler(router)
                .listen(8080)
                .onSuccess(rs -> System.out.println("Vertx server started."))
                .onFailure(Throwable::printStackTrace);
    }
}
