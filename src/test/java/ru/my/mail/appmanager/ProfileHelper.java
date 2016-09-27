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

    public boolean checkProfilePhotoButtom() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-photo']"));
    }

    public boolean checkProfileFriendsButtom() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-friends']"));

    }

    public boolean checkProfileGroupsButtom() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-groups']"));
    }

    public boolean checkProfilePresentsButton() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-gift']"));

    }

    public boolean checkProfileVideoButton() {
        return isElementPresent(By.xpath("//*[@class='profile-menu__tile m-video']"));

    }

    public boolean checkProfileName() {
        return isElementPresent(By.className("profile-head__user"))
                    && wd.findElement(By.className("profile-head__user")).getText().equals("Testika Grepman");
        }

    public boolean checkProfileInfo() {
        return isElementPresent(By.className("profile-head__info"))
                && wd.findElement(By.className("profile-head__info")).getText().equals("10 лет | Севастополь, Россия");
    }

    public boolean checkFirstEvent() {
        return isElementPresent(By.cssSelector(".eventHead__avatar.mm-clickable.mm-goToUser"));
    }

    public boolean checkSearchFormByMyFriends() {
        return isElementPresent(By.name("common"));
    }

    public boolean checkMyFriendsAvatar() {
        return isElementPresent(By.cssSelector(".list-item__avatar"));
    }

    public boolean checkSearchFormByMyGroups() {
        return isElementPresent(By.name("q"));

    }

    public boolean checkMyGroupsAvatar() {
        return isElementPresent(By.cssSelector(".list-item__avatar"));

    }

    public boolean checkMyPhotoCatalog() {
        return isElementPresent(By.cssSelector(".list-item"));
    }

    public boolean checkMyPhotoButtomAll() {
        return isElementPresent(By.cssSelector(".b-link.photo_catalog__heading__all_items_link"));
    }

    public boolean checkMyPhotoButtomShowMorePhoto() {
        return isElementPresent(By.cssSelector(".show-more.b-link.mm-clickable.mm-showMore"));
    }

    public boolean checkMyPhotoButtomShowMoreAlbum() {
        return isElementPresent(By.cssSelector(".show-more.b-link.mm-clickable.mm-goToEvent"));

    }

    public boolean checkMyPhotoOnPage() {
        return isElementPresent(By.cssSelector(".photo__photos_list__item.mm-clickable.mm-dispatchPhotoItem"));
    }

    public boolean checkMyPresentButtomSendPresent() {
        return isElementPresent(By.cssSelector(".button.button_wide"));

    }

    public boolean checkMyPresentItem() {
        return isElementPresent(By.cssSelector(".list-item__pic"));

    }

    public boolean checkMyVideoAlbum() {
        return isElementPresent(By.cssSelector(".list-item"));
    }

    public boolean checkMoreNews() {
        return isElementPresent(By.cssSelector(".b-link.show-more.showEarlier.mm-clickable.mm-showMore.mm-count"));
    }
}
