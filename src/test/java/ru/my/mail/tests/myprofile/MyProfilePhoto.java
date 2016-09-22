package ru.my.mail.tests.myprofile;

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
    }
}
