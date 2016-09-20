package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class SessionHelper {

    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void login(String username, String password) {
        wd.findElement(By.name("Login")).click();
        wd.findElement(By.name("Login")).clear();
        wd.findElement(By.name("Login")).sendKeys(username);
        wd.findElement(By.name("Password")).click();
        wd.findElement(By.name("Password")).clear();
        wd.findElement(By.name("Password")).sendKeys(password);
        wd.findElement(By.xpath("//div[@class='heightContent']/form/div[3]/input")).click();
    }
}
