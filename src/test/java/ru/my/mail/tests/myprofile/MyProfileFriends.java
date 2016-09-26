package ru.my.mail.tests.myprofile;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyProfileFriends extends TestBase{

    @Test

    public void testMyProfileFriends(){
        app.getNavigationHelper().goToMyProfilePage();
        app.getProfileHelper().openProfileFriends();
        Assert.assertTrue(app.getProfileHelper().checkSearchFormByMyFriends());
        Assert.assertTrue(app.getProfileHelper().checkMyFriendsAvatar());
    }
}
