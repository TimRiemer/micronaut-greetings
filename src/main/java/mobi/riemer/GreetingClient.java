package mobi.riemer;

import io.micronaut.http.client.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.reactivex.Single;

@Client("greeting")
public interface GreetingClient {

    @Get("/{name}")
    Single<String> greeting(String name);
}