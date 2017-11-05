package Test;

import Helpers.App;
import org.junit.Before;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by Andre on 16.09.2017.
 */
public abstract class BaseTest {
   App app  = new App();

    @BeforeSuite
    public void setSuite() throws Exception {


    }

    @BeforeTest
    public void setTest() throws Exception {
            app.common.appBefore();

    }

    @AfterSuite
    public void tearDown() throws Exception {
        app.common.appOut();

    }
}
