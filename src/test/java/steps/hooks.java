package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;


public class hooks {

    @Before
    public void tearUp(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<Browser Launch>>>>>>>>>>>>");
    }

    @After
    public void tearDown(){
        System.out.println("<<<<<<<<<<<<<<<<<Browser ShuttingDown>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}
