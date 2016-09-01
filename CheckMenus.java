package edureka.Assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMenus {
	
	public void click_menus(WebDriver seld,String el_text) //to click menus with the given text 
	{
		WebElement el=seld.findElement(By.linkText(el_text));
		if (el.getText().contains(el_text))
		{
			System.out.println("Menu Present"+el.toString());
			seld.findElement(By.linkText(el_text)).click();
		}
		else
			System.out.println("No Home LInk");
		
	}
	
	public void getScreenShot(WebDriver seld,String file_name) throws IOException // to take snapshots with given file name
	{
		File scrFile=((TakesScreenshot)seld).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("/Users/swethaneeli/Praveen/Codes/Snapshots/"+file_name) );
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver sel=new ChromeDriver();
		sel.get("http://www.opensourcecms.com/");
		CheckMenus cm=new CheckMenus();
		
		cm.click_menus(sel,"Home");
		cm.getScreenShot(sel,"home");
		sel.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cm.click_menus(sel, "CMS Ratings");
		cm.getScreenShot(sel,"CMS_Ratings");
		sel.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cm.click_menus(sel,"CMS Market Share");
		cm.getScreenShot(sel,"CMS_Market_share");
		sel.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cm.click_menus(sel,"CMS Web Hosting");
		cm.getScreenShot(sel,"CMS_Web_Hosting");
		sel.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cm.click_menus(sel,"List Your CMS");
		cm.getScreenShot(sel,"List_CMS");
		sel.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cm.click_menus(sel,"Hall Of Fame");
		cm.getScreenShot(sel,"Hall_Fame");
		sel.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cm.click_menus(sel,"Contact Us");
		cm.getScreenShot(sel,"Contact_US");
		sel.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		sel.close();
		sel.quit();
	}

}
