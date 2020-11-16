package starter.login;

import io.appium.java_client.touch.ActionOptions;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class doLogin implements Task {

    private final  String username;
    private final  String password;

    public doLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable whitCredentials(String username,String password){
        return instrumented(doLogin.class,username,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Login.SINGIN),
                Enter.theValue(username).into(Login.EMAILADDRESS),
                Enter.theValue(password).into(Login.PASSWORD),
                Click.on(Login.BUTTON_SINGIN)
        );
    }
}
