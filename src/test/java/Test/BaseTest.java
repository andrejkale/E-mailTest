package Test;

import Helpers.App;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Andre on 16.09.2017.
 */
public abstract class BaseTest {
   App app  = new App();

    @BeforeSuite
    public void setSuite() throws Exception {

    }

    @AfterSuite
    public void tearDown() throws Exception {
        app.common.appOut();

    }
}
