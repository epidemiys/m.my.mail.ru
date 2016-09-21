package ru.my.mail.tests;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyProfileTest extends TestBase {

    @Test

    public void testMyProfilePage() {
        app.getNavigationHelper().goToMyProfilePage();

    }
}
