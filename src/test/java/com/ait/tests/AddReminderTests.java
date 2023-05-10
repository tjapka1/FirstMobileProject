package com.ait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddReminderTests extends TestBase{

    @Test
    public void addReminderWithTitleTest() {
        int quantityBeforeAdd;
        int quantityAfterAdd;
        quantityBeforeAdd = app.getMainScreen().getTotalReminders();

        app.getMainScreen().tapOnAddReminder();

        app.getReminder().enterTitle("Test");

        app.getReminder().saveReminder();

        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd,quantityBeforeAdd + 1);
    }

    @Test
    public void addReminderWithRandomSwipeTest() {
        int quantityBeforeAdd;
        int quantityAfterAdd;
        quantityBeforeAdd = app.getMainScreen().getTotalReminders();

        app.getMainScreen().tapOnAddReminder();

        app.getReminder().enterTitle("Test");

        app.getReminder().tapOnDate();
        app.getReminder().selectMonth("future");

        app.getReminder().saveReminder();

        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd,quantityBeforeAdd + 1);
    }

}
