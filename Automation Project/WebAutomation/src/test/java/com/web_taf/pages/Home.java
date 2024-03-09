package com.web_taf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends BasePage {

    public Home (WebDriver driver){
        super(driver);
    }

    private final By coursesPageButton = By.id("btnMyCoursesList");

    public Courses clickOnCoursesPageButton(){
        waitUntilElementIsClickable(coursesPageButton).click();
        return new Courses(driver);
    }

}
