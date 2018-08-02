package mobi.riemer;

import io.reactivex.Single;

import javax.inject.Singleton;

@Singleton
class GreetingService {

    Single<String> message(String name) {
        return Single.just("Hello, " + name);
    }
}