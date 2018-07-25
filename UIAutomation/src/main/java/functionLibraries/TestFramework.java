package functionLibraries;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class TestFramework {

    CommonFunctions commonFunctionsObj = new CommonFunctions();

    @Before
    public void beforeTest() throws Exception {
        commonFunctionsObj.openBrowser();

    }

    @After
    public void afterTest() {

        commonFunctionsObj.closeBrowser();
    }
}
