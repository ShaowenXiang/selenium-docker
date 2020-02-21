package com.profiling;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilingPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public static String userid = "//*[@name='userid']";
    public static String psw = "//*[@name='psw']";
    public static String radio = "//*[@name='radio']";
    public static String checkbox = "//*[@name='checkbox']";
    public static String favcolor = "//*[@name='favcolor']";
    public static String bday = "//*[@name='bday']";
    public static String bdaymonth = "//*[@name='bdaymonth']";
    public static String bdaytime = "//*[@name='bdaytime']";
    public static String email = "//*[@name='email']";
    public static String quantity = "//*[@name='quantity']";
    public static String googlesearch = "//*[@name='googlesearch']";

    public ProfilingPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void goTo(){
        this.driver.get("https://demo.tmxcyber.com/qabuilder/fp-qa1-MouseKeyboard.php?pageid=24&env=qa1&fp=https://profiling1.tmxcyber.com/fp&org_id=4fn24qpn&session_id=227315202532740");
    }

    public void populateFieldRandomWait(){
        driver.findElement(By.xpath(userid)).sendKeys("User");
        Random random = new Random();
        long time = (long) (random.nextGaussian()*1000);
        if (time < 0) {
            time = time *-1;
        } else if(time >99999) {
            time = 99999;
        }

        System.out.println("Wait for time in ms: " + time);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath(userid)).sendKeys(" id " +time);
    }





}
