package ru.my.mail.tests.myprofile;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyProfilePhoto extends TestBase {

    @Test

    public void testMyProfilePhoto(){
        app.getNavigationHelper().goToMyProfilePage();
        app.getProfileHelper().openProfilePhoto();
        Assert.assertTrue(app.getProfileHelper().checkMyPhotoCatalog());
        Assert.assertTrue(app.getProfileHelper().checkMyPhotoButtomAll());
        Assert.assertTrue(app.getProfileHelper().checkMyPhotoButtomShowMorePhoto());
        Assert.assertTrue(app.getProfileHelper().checkMyPhotoButtomShowMoreAlbum());
        Assert.assertTrue(app.getProfileHelper().checkMyPhotoOnPage());
    }
}
