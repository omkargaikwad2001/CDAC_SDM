package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		
		//*[@id="login_credentials"]
		
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.saucedemo.com/");

        WebElement usernameBlock = driver.findElement(By.xpath("//*[@id='login_credentials']"));

        String allUsernames = usernameBlock.getText();
        

        String username = allUsernames.split("\n")[1];

        WebElement passwordBlock = driver.findElement(By.className("login_password"));
        String allPasswords = passwordBlock.getText();

        String password = allPasswords.split("\n")[1];

        System.out.println("Using Username: " + username);
        System.out.println("Using Password: " + password);

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();

    }
}