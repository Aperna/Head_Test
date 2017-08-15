import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

@Given("^user is on ASOS registration page$")
public void user_is_on_ASOS_registration_page() {

}

    @When("^user should enter\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void user_should_enter(String emailaddress, String firstname, String lastname, String password, String dateofbirth, String gender) {


    }

    @When("^user clicks join ASOS button$")
    public void user_clicks_join_ASOS_button()  {

    }

    @Then("^user can  should navigate to home page and with logged in state\\.$")
    public void user_should_navigate_to_home_page_and_with_logged_in_state()  {

    }}






