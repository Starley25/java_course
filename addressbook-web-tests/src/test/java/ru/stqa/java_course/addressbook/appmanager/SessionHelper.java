package ru.stqa.java_course.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{
    public SessionHelper(WebDriver driver) {
        super(driver);
    }
    public void login(String admin, String secret) {
        type(By.name("user"), admin);
        type(By.name("pass"), secret);
        click(By.cssSelector("input:nth-child(7)"));
    }
}
