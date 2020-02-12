package automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

class CaseTest1{
	 
	public String email = "luamlap27.9@gmail.com";
	
	public AndroidDriver driver;
	
	 @BeforeTest
	 public void SetupTest() throws MalformedURLException{
			
			//Setando o Appium
			AppiumDriver<MobileElement> driver;
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			//Iniciando o dispositivo
			cap.setCapability("deviceName", "emulator-5554");
			cap.setCapability("platformName", "Android");
			
			//Caminho da aplicação
			cap.setCapability("appPackage", "com.google.android.calculator");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");
			
			driver = new AppiumDriver<MobileElement>(new URL ("http://127.0.0.1:4723/wd/hub"), cap);
			
			System.out.println("Teste Rodando...");
	 
	 }
	 
	@Test (priority = 1)
	 public void LogandoNoSpotify() {
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.calculator:id/digit_3")));
		 
		 //WebDriverWait wait = new WebDriverWait(driver,10);
		 //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button")));
		 
		 driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
		 //com.hecorat.screenrecorder.free:id/btn_turn_on_overlay_permission
	
		 System.out.println("Loging feito com sucesso!!");

	 }
}