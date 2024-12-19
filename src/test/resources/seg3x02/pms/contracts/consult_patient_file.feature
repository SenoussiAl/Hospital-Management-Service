# UC5 Consult Patient Files, not needed for livable 1 I believe

Feature: Consult Patient File
  Scenario: Staff Member views a Patient file
    Given the HMS-PMS is ON
    And the Staff Member is logged in
    And Staff Member selects to view Patient registrion
    And HMS-PMS asks for Patient identification number
    And Medical staff member enters Patient identification number
    When the application command consultPatientFile is invoked
    Then HMS shows the Patient registration information

  Scenario: Incorrect Patient Identification Number
    Given the HMS-PMS is ON
    And the Staff Member is logged in
    And Staff Member selects to view Patient registrion
    And HMS-PMS asks for Patient identification number
    And Medical staff member enters an incorrect Patient identification number
    When the application command consultPatientFile is invoked
    And HMS displays a Patient not found error message
