package sistecredito.retofalabella.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import sistecredito.retofalabella.interactions.OpenBrowser;
import sistecredito.retofalabella.models.DataProduct;
import sistecredito.retofalabella.models.FalabellaPage;
import sistecredito.retofalabella.questions.*;
import sistecredito.retofalabella.tasks.*;
import sistecredito.retofalabella.utils.Constants;

import java.util.List;

public class ProductShoppingStepDefinitions {
    FalabellaPage page;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(Constants.ACTOR);
    }
    @Given("^the user is in the falabella application$")
    public void theUserIsInTheFalabellaApplication() {
       OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(page));
    }

    @Then("^the user should see the button (.*)$")
    public void theUserShouldSeeTheButtonCategorias(String data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateOptionCategoria.isVisible(data)));
    }

    @When("^the user searches for a product$")
    public void theUserSearchesForAProduct(List<DataProduct> dataProducts) {
        DataProduct data = dataProducts.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(SearchProduct.searchProduct(data));
    }

    @When("^the user selects a product$")
    public void theUserSelectsAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectPoduct.selectPoduct());
    }

    @When("^the user chooses the dispatch options$")
    public void theUserChoosesTheDispatchOptions(List<DataProduct> dataProducts) {
        DataProduct data = dataProducts.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(OptionsDispatch.optionsDispatch(data));
    }

    @Then("^the user should see that the price corresponds to the product selected plus the shipping price$")
    public void theUserShouldSeeThatThePriceCorrespondsToTheProductSelectedPlusTheShippingPrice() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePrice.isCorrect()));
    }

    @When("^user enters multiple products$")
    public void userEntersMultipleProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectMultipleProductsWithMessage.selectMultipleProducts());
    }

    @Then("^the user should see an informative message(.*)$")
    public void theUserShouldSeeAnInformativeMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateText.isEquals(message)));
    }

    @When("^user enters (\\d+) products$")
    public void userEntersProducts(int cantProducts) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectMultipleProducts.multipleProducts(cantProducts));
    }

    @Then("^the user should see that the price corresponds to the number of products selected plus the shipping price$")
    public void theUserShouldSeeThatThePriceCorrespondsToTheNumberOfProductsSelectedPlusTheShippingPrice() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePriceProductMultiple.isCorrect()));
    }

    @When("^the user searches for a product random$")
    public void theUserSearchesForAProductRandom(List<DataProduct> dataProducts) {
        DataProduct data = dataProducts.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(SearchProductRandom.random(data));
    }


    @Then("^the user should see an informative result message(.*)$")
    public void theUserShouldSeeAnInformativeResultMessage(String messageResult) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTextResult.isCorrect(messageResult)));
    }
}
