package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by aleksandr.petrov on 28.09.16.
 */
public class NotificationHelper extends HelperBase {

    public NotificationHelper(WebDriver wd) {
        super(wd);
    }

    public boolean checkFirstGuest() {
        return isElementPresent(By.cssSelector(".list-item"));
    }

    public boolean checkGuestDataInfo() {
        return isElementPresent(By.cssSelector(".list-item__date"));
    }
}