package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class loginstepsdef{
    @Given("user navigate to homepage")
    public void userNavigateToHomepage() {
        System.out.println("We are on HomePage");
    }

    @When("^user enters (.+) and (.+)$")
    public void user_enters_and(String uname, String password)  {
        System.out.println("type uname>>>"+uname+" type password>>>"+password);

    }

    @And("clicks login")
    public void clicksLogin() {
        System.out.println("clicks login");
    }

    @Then("user navigate to logged in home")
    public void userNavigateToLoggedInHome() {
        System.out.println("on welcome homepage");
    }


}
