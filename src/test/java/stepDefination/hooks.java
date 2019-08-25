package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
    @Before("@@test")
    public void beforeValidation(){
        System.out.println("before test hook");
    }
    @After("@aftertests")
    public void afterValidation(){
        System.out.println("after test hook");
    }
}
