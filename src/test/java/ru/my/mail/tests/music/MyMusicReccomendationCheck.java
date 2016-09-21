package ru.my.mail.tests.music;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyMusicReccomendationCheck extends TestBase {

    @Test

    public void testMyMusicReccomendationCheck(){
        app.getNavigationHelper().goToMyMusicPage();
        app.getNavigationHelper().goToMyMusicMyReccomendationPage();
    }
}
