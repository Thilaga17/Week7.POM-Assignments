package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class BaseClass
{
	public ChromeDriver driver;
	
	public String excelName;
	
	public String capturedId;
	
	public static String Name; //DuplicateLead
	
	public static String LeadsId; // DeleteId
	
	public static List<String> listHandle;
	
	public static List<String> listHandle1;
	
	public static Properties prop;
	
	@Parameters({"language"})
	
	//To load the Property file
	@BeforeTest
	public void propLoad(String lang) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties");
		//FileInputStream fis = new FileInputStream("./src/main/resources/english.properties");
		prop = new Properties();
		prop.load(fis);
	}
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	@DataProvider(name = "fetchdata")
	public String[][] sendData() throws IOException
	{
		// Calling ReadExcel program by passing file(excelName) to read and get the values from excel file.
		String[][] array = ReadExcel.excelData(excelName); 
		return array;
	}
	
	
}
