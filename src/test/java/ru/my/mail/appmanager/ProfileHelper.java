package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class ProfileHelper extends HelperBase {

    public ProfileHelper(WebDriver wd) {
        super(wd);
    }

    public void openProfileFriends() {
        click(By.xpath("//*[@class='profile-menu__tile m-friends']"));
    }

    public void openProfileGroups() {
        click(By.xpath("//*[@class='profile-menu__tile m-groups']"));
    }

    public void openProfilePhoto() {
        click(By.xpath("//*[@class='profile-menu__tile m-photo']"));
    }

    public void openProfilePresents() {
        click(By.xpath("//*[@class='profile-menu__tile m-gift']"));
    }

    public void openMyProfileVideo() {
        click(By.xpath("//*[@class='profile-menu__tile m-video']"));
    }

    public boolean checkProfileAvatar() {
        return isElementPresent(By.xpath("//*[@class='profile-head__avatar']"));
    }

    public boolean checkProfilePhotoList() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-photo']"));
    }

    public boolean checkProfileFriendsList() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-friends']"));

    }

    public boolean checkProfileGroupsList() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-groups']"));
    }

    public boolean checkProfilePresentsList() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-gift']"));

    }

    public boolean checkProfileVideoList() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-video']"));

    }
}
