package com.ait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainScreentests extends TestBase {
@Test
    public void appLaunchTest(){
    Assert.assertTrue(app.getMainScreen().isNoReminderTextPresent());
    }
}
