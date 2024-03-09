Feature: Create Course Scenario

  Scenario Outline: Create a new course
    Given  user navigate to the WinjiGo website
    When user login with username "<username>" and password "<password>"
    And  navigate to the courses page
    And  click on the add course button
    And  enter course name "<courseName>" and select grade "<grade>"
    And  select course teacher and course criteria
    And click on create button
    Then course title "<courseName>" should be displayed in the courses list page

    Examples:
      | username | password | courseName | grade |
      | username | password | x course   | 4     |