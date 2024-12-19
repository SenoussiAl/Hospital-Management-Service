# UC10 Admit patient from request list
Feature: Admit patient from request list
  Scenario: Charge Nurse admits a patient from the request list
    Given the HMS-PMS is On
    And the Charge Nurse is logged in 
    And the Patient is in the request list
    And Charge Nurse selects a patient
    When the application command admitPatientFromRequestList is invoked
    Then HMS-PMS displays the selected Patient registration
    And the patient in request list is admited

  Scenario: Patient cannot be admitted
    Given the HMS-PMS is On
    And the Charge Nurse is logged in
    And the Patient is in the request list
    And the Patient cannot be admitted
    When the application command admitPatientFromRequestList is invoked
    Then Charge Nurse denies Patient admission
    And HMS-PMS sends a notification to the Charge Nurse who requested admission
