package com.cucumber.practice;

import com.bean.LoginInfo;
import cucumber.api.java.en.*;
import org.junit.jupiter.api.Assertions;

public class LoginServiceTest {

    LoginService loginService ;
    LoginInfo loginInfo ;
    String loginServResponse ;

    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        loginService = new LoginService();
        loginInfo = new LoginInfo();
    }

    @When("^user enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_username_as_and_password_as(String username, String password) throws Throwable {
        loginInfo.setUserName(username);
        loginInfo.setPassword(password);
        loginServResponse = loginService.verifyCredential(loginInfo);
    }

    @Then("^user get \"([^\"]*)\" response$")
    public void user_get_response(String response) throws Throwable {
        Assertions.assertEquals(response , loginServResponse);
    }
}
