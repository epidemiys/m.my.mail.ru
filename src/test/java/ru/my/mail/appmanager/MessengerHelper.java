package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by aleksandr.petrov on 27.09.16.
 */
public class MessengerHelper extends HelperBase {

    public MessengerHelper(WebDriver wd) {
        super(wd);
    }

    public boolean checkSearchInputForm() {
        return isElementPresent(By.cssSelector(".search-form__input"));
    }

    public boolean checkFirstMassegeDialog() {
        return isElementPresent(By.cssSelector(".list-item.list-item_pr"));
    }

    public boolean checkShowMoreButtom() {
        return isElementPresent(By.cssSelector(".show-more.mm-clickable.mm-showMore"));
    }

    public boolean checkDataInfo() {
        return isElementPresent(By.cssSelector(".list-item__date"));
    }
}