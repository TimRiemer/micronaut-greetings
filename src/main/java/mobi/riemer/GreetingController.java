package mobi.riemer;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.reactivex.Single;

import javax.inject.Inject;

@Controller("/greeting")
public class GreetingController {

    @Inject
    GreetingService greetingService;

    @Get("/{name}")
    public Single<String> greeting(String name) {
        return greetingService.message(name);
    }
}