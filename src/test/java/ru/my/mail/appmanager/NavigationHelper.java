package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void goToPublisherPage() {
        click(By.cssSelector("a.menu__item.m-publish"));
    }

    public void goToFriendPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-friends']"));

    }

    public void goToMyProfilePage() {
        click(By.xpath("//*[@class='leftmenu__pic m-avatar']"));
    }

    public void goToGroupPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-friends']"));
    }

    public void goToMyProfileFriends() {
        click(By.xpath("//*[@class='profile-menu__tile m-friends']"));
    }

    public void goToMyProfileGroups() {
        click(By.xpath("//*[@class='profile-menu__tile m-groups']"));
    }

    public void goToMyProfilePhoto() {
        click(By.xpath("//*[@class='profile-menu__tile m-photo']"));
    }

    public void goToMyProfilePresents() {
        click(By.xpath("//*[@class='profile-menu__tile m-gift']"));
    }

    public void goToMyProfileVideo() {
        click(By.xpath("//*[@class='profile-menu__tile m-video']"));
    }
}
