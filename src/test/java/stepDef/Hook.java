package stepDef;


import base.setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends setup {
    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void startTest(){
        driver = setupBrowser(driverType);
        switch (envType){
            case "qa":
                url = "https://cs.beta.carsaver.com/";
                break;
            case "stg":
                url = "https://cs.beta.carsaver.com/";
                break;
            case "prod":
                url = "https://cs.beta.carsaver.com/";
                break;
        }
        driver.get(url);
    }

//    @After
//    public void endTest(Scenario scenario){
//        try {
//            if (scenario.isFailed()){
//                final byte[] screenshot = ((TakesScreenshot)) driver).getScreenshotAs(OutputType.BYTES);
//                // Screenshot will display in report
//                scenario.attach(screenshot, "image/png", scenario.getName());
//            }
//        } finally {
//        //driver.close();
//        driver.quit();
//        }
//    }
}
