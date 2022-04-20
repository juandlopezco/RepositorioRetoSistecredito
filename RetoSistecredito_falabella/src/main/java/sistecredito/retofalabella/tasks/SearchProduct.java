package sistecredito.retofalabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import sistecredito.retofalabella.models.DataProduct;
import sistecredito.retofalabella.userinterfaces.HomePage;

public class SearchProduct implements Task {
    DataProduct data;

    public SearchProduct(DataProduct data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getProduct()).into(HomePage.SEARCH_PRODUCT).thenHit(Keys.ENTER));
    }

    public static SearchProduct searchProduct(DataProduct data){
        return Tasks.instrumented(SearchProduct.class,data);
    }

}
