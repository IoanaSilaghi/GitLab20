package testCases;

import org.testng.annotations.BeforeClass;
import pages.BasePage;
import pages.CheckboxDemoPage;


    package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePage;
import pages.CheckboxDemoPage;

public class CheckboxDemoTestCases {

        private CheckboxDemoPage checkboxDemoPage;

        @BeforeClass
        public void setUp() {
            super.setUp();

            checkboxDemoPage = new CheckboxDemoPage(driver);
        }

        @Test
        public void clickOnTheSingleCheckboxCheckMark() throws InterruptedException {
            checkboxDemoPage.ClickOnTheCheckBoxDemo();
            checkboxDemoPage.ClickOnSingleCheckbox();
            checkboxDemoPage.clickOnFirstCheckBoxOption();
            checkboxDemoPage.clickOnCheckAllOption();
            Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");
        }
    }
}
