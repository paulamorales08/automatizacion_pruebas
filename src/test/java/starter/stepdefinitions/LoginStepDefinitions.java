package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.Login;
import starter.login.doLogin;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitions {

    String name;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given(":Un formulario de inicio de sesion")
    public void un_formulario_de_inicio_de_sesion() {
        this.name = "Paula";

    }

    @When(": ingreso credenciales validas")
    public void ingreso_credenciales_validas() {
        theActorCalled(name).attemptsTo(
                doLogin.whitCredentials("paulaandreamorales1102@gmail.com","Paula123")
        );
    }

    @Then(": me da acceso a mi cuenta")
    public void me_da_acceso_a_mi_cuenta() {

    }

}