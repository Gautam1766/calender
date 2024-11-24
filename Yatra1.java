package com.Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Yatra1 {

	public static void main(String[] args) throws InterruptedException {
		
		String ExpectedMY="December 2024";
		String ExpDay="20";
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/flights");
		Thread.sleep(3000);
	WebElement 	Depature=driver.findElement(By.xpath("(//div[@class='css-rd021u'])[1]"));
			    Depature.click();
			    
			String Act_month_years=driver.findElement(By.xpath("(//span[@class='react-datepicker__current-month'])[1]")).getText();
			//System.out.println(Act_month_years);
			
//			if(Act_month_years.equals(ExpectedMY)) 
//			{
//				List <WebElement> l1=driver.findElements(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--007 react-datepicker__day--selected']"));
//				
//				for(WebElement l2:l1) 
//				{
//					String Actday=l2.getText();
//					if(Actday.equals(ExpDay)) 
//					{
//						l2.click();
//						break;
//					}
//				}
//				break;
//			}
//			else 
//			{
				driver.findElement(By.xpath("(//button[@aria-label='Next Month'])[2]")).click();
				
				List <WebElement> selectdate=driver.findElements(By.xpath("(//span[text()='20'])[1]"));
				for(WebElement selectdate1:selectdate) 
				{
					String ExpDate=selectdate1.getText();
					selectdate1.click();
					System.out.println(ExpDate);
					break;
				}
				
				
				
			}
			
		}
			    
	


