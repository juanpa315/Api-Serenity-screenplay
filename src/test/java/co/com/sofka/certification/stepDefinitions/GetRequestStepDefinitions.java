package co.com.sofka.certification.stepDefinitions;

import co.com.sofka.certification.tasks.GetRequestTask;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;


import static net.serenitybdd.rest.SerenityRest.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetRequestStepDefinitions {

    /*@ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }*/

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }


    @When("The user makes a GET request")
    public void heMakesAGETRequest() {
       theActorInTheSpotlight().attemptsTo(
               GetRequestTask.service(
                       "https://rickandmortyapi.com/api/character"
               )
       );
    }

    @Then("Get the expected status code")
    public void heGetTheExpectedStatusCode() {

    }
}
