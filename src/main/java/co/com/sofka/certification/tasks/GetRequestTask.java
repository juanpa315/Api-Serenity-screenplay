package co.com.sofka.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GetRequestTask implements Task {

    private final String url;

    public GetRequestTask(String url) {
        this.url = url;
    }

    public static GetRequestTask service(String url){
        return new GetRequestTask(url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
