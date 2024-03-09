package com.web_taf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Courses extends BasePage {

    public Courses (WebDriver driver){
        super(driver);
    }

    private final By addButton = By.id("btnListAddCourse");
    private final By sortByMenu = By.id("CoursesOrderBy");
    private final By courseNameField = By.id("txtCourseName");
    private final By gradeMenu = By.id("courseGrade");
    private final By courseTeacherMenu = By.id("teacherOnBehalf");
    private final By selectedTeacher = By.id("ui-select-choices-row-0-1");
    private final By criteriaButton = By.xpath("//*[@id='divCompletionCriteria']/div[3]/label/span[1]");
    private final By createButton = By.id("btnSaveAsDraftCourse");
    private final By courseIcon = By.id("lnkListCourseSelcted");

    //*[@id="divCompletionCriteria"]/div[3]/label/span[1]
    //*[@id="divCompletionCriteria"]/div[2]/div/label/span[1]
    public void enterCourseName(String courseName){
        waitUntilElementIsPresence(courseNameField).sendKeys(courseName);
    }

    public void clickCreateButton(){
        waitUntilElementIsClickable(createButton).click();
    }
    public void clickCriteriaButton(){
            waitUntilElementIsClickable(criteriaButton).click();
    }

    public void clickAddButton(){
        waitUntilElementIsClickable(addButton).click();
    }

    public void selectDateDescending(){
        Select dropMenu = new Select(waitUntilElementIsPresence(sortByMenu));
        dropMenu.selectByIndex(3);
    }

    public void selectCourseGrade(String courseGrade){
        Select dropMenu = new Select(waitUntilElementIsPresence(gradeMenu));
        dropMenu.selectByVisibleText(courseGrade);
    }

    public void selectTeacher(){
        waitUntilElementIsClickable(courseTeacherMenu).click();
        waitUntilElementIsClickable(selectedTeacher).click();
    }

    public WebElement getCourseIcon() {
        return waitUntilElementIsPresence(courseIcon);
    }

}
