package runners;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"json:target/RunCuke/cucumber.json", "pretty", "html:target/RunCuke/cucumber.html"},
        features = "src/test/resources/feature/SearchCar.feature",
        glue = "steps",
        tags = "@Search-Cars"
             )
public class RunCuke extends AbstractTestNGCucumberTests {
	@BeforeClass
    public static void setup() {
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\" + strDate+".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		//static report name
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

        // User can add the system information as follows
//        ExtentCucumberFormatter.addSystemInfo("Browser Name", "chrome");
//        ExtentCucumberFormatter.addSystemInfo("Browser version", "v57.0");
//        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.9.1");
//
//        // Also you can add system information using a hash map
//        Map systemInfo = new HashMap();
//        systemInfo.put("Cucumber version", "v1.2.3");
//        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
//        ExtentCucumberFormatter.addSystemInfo(systemInfo);
    }

}
