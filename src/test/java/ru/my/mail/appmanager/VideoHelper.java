package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by aleksandr.petrov on 27.09.16.
 */
public class VideoHelper extends HelperBase {

    public VideoHelper(WebDriver wd) {
        super(wd);
    }

    public boolean checkFindForm() {
        return isElementPresent(By.name("q"));
    }

    public boolean checkFerstVideo() {
        return isElementPresent(By.cssSelector(".list-item__link"));
    }

    public boolean checkMoreVideoButtom() {
        return isElementPresent(By.cssSelector(".show-more.mm-clickable.mm-showMore"));
    }
}