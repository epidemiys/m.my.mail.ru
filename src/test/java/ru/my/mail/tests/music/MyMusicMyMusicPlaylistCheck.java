package ru.my.mail.tests.music;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyMusicMyMusicPlaylistCheck extends TestBase{

    @Test

    public void testMyMusicMyMusicPlaylistCheck(){
        app.getNavigationHelper().goToMyMusicPage();
        app.getNavigationHelper().goToMyMusicMyMusicPage();
        app.getNavigationHelper().goToMyMusicMyMusicPlaylist();
        Assert.assertTrue(app.getMusicHelper().checkFirstPlaylist());
        Assert.assertTrue(app.getMusicHelper().checkPlaylistInfo());

    }
}
