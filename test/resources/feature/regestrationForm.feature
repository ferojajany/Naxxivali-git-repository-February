Feature: Student Regestration Form
  Scenario: Student will fill regestration form
    Given Student is on the regestration form
    When Student enters name email
    And Student choice gender
    And Student give phonenumber
    Then Student give date of birth
    When Student provide subject
    And Student choice hobbies
    And Student provide current address
    And Student will select state and city
