package ru.my.mail.tests.music;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyMusicCatalogCheck extends TestBase {

    @Test

    public void testMyMusicCatalogCheck() {
        app.getNavigationHelper().goToMyMusicPage();
        app.getNavigationHelper().goToMyMusicCatalog();
        Assert.assertTrue(app.getMusicHelper().checkFirstPlaylist());
        Assert.assertTrue(app.getMusicHelper().checkShowMore());
    }
}
