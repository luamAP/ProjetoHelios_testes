package automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

class CaseTest1{
	 
	 public static void main (String[] args) throws MalformedURLException{
			
			//Setando o Appium
			AppiumDriver<MobileElement> driver;
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			//Iniciando o dispositivo
			cap.setCapability("deviceName", "");
			cap.setCapability("platformName", "Android");
			
			//Caminho da aplicação
			cap.setCapability("appPackage", "");
			cap.setCapability("appActivity", "");
			
			driver = new AppiumDriver<MobileElement>(new URL ("http://127.0.0.1:4723/wd/hub"), cap);
	 
	 }
}