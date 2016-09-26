package ru.my.mail.tests.myprofile;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyProfileCheck extends TestBase {

    @Test

    public void testMyProfilePage() {
        app.getNavigationHelper().goToMyProfilePage();
        Assert.assertTrue(app.getProfileHelper().checkProfileAvatar());
        Assert.assertTrue(app.getProfileHelper().checkProfilePhotoList());
        Assert.assertTrue(app.getProfileHelper().checkProfileFriendsList());
        Assert.assertTrue(app.getProfileHelper().checkProfileGroupsList());
        Assert.assertTrue(app.getProfileHelper().checkProfilePresentsList());
        Assert.assertTrue(app.getProfileHelper().checkProfileVideoList());
        Assert.assertTrue(app.getProfileHelper().checkProfileName());
    }
}

