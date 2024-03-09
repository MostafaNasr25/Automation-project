package com.web_taf.tests;

import com.web_taf.pages.Courses;
import com.web_taf.pages.Home;
import com.web_taf.pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CourseStepdefs extends BaseTest {

    private Login login = new Login(edgeDriver);
    private Home home = new Home(edgeDriver);
    private Courses courses = new Courses(edgeDriver);

    @Given("user navigate to the WinjiGo website")
    public void userNavigateToTheWinjiGoWebsite() {
        edgeDriver.navigate().to(properties.getProperty("WinjigoLink"));
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String username, String password) {
        home = login.login(properties.getProperty(username), properties.getProperty(password));
    }

    @And("navigate to the courses page")
    public void navigateToTheCoursesPage() {
        home.clickOnCoursesPageButton();

    }

    @And("click on the add course button")
    public void clickOnTheAddCourseButton() {
        courses.clickAddButton();
    }

    @And("enter course name {string} and select grade {string}")
    public void enterCourseNameAndSelectGrade(String courseName, String grade) {
        courses.enterCourseName(courseName);
        courses.selectCourseGrade(grade);
    }

    @And("select course teacher and course criteria")
    public void selectCourseTeacherAndCourseCriteria() {
        courses.selectTeacher();
        courses.clickCriteriaButton();
    }

    @And("click on create button")
    public void clickOnCreateButton() {
        courses.clickCreateButton();
    }


    @Then("course title {string} should be displayed in the courses list page")
    public void courseTitleShouldBeDisplayedInTheCoursesListPage(String courseName) {
        home.clickOnCoursesPageButton();
        courses.selectDateDescending();
        Assert.assertEquals(courses.getCourseIcon().getAttribute("title"),courseName);

    }
}
