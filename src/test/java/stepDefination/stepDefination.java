package stepDefination;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class stepDefination {

    @Given("^Validate the browser$")
    public void validate_the_browser()  {

    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() {

    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started()  {

    }




    @Given("^User is on landing page$")
    public void user_is_on_landing_page()  {
        System.out.println("user is on landing page");
    }

    @When("^User login with username and password with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_with_username_and_password_with_and(String arg1, String arg2) {
        System.out.println("user login with username and password" + "\t" + arg1+ "\t" + arg2);

    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed()  {
        System.out.println("home page is displayed");

    }

    @Then("^Cart displayed are \"([^\"]*)\"$")
    public void cart_are_displaying_on_the_page(String arg1) {
        System.out.println("cart are displayed on the page"+ "\t" + arg1);
    }
    @When("^User login with below details$")
    public void user_login_with_details(DataTable data)  {
       // System.out.println(data.raw());
        List<List<String>> obj=data.raw();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }
}
