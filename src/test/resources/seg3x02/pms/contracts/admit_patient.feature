# UC8 Admit Patient
Feature: Admit patient
  Scenario: Charge Nurse admits a patient
    Given the HMS-PMS is On 
    And the Charge Nurse is logged in 
    And the Charge Nurse is consulting the patient files
    And Charge Nurse chooses to admit a Patient
    And HMS-PMS asks for room number
    And HMS-PMS asks for the bed number
    And Charge Nurse enters room 
    And the Charge Nurse enters the bed number 
    And Charge Nurse enters remaining admission information
    When the application command admitPatient is invoke
    Then HMS admits the patient to the division

  Scenario: Charge Nurse admits a patient
    Given the HMS-PMS is On 
    And the Charge Nurse is logged in 
    And the Charge Nurse is consulting the patient files
    And Charge Nurse chooses to admit a Patient
    And HMS-PMS asks for room number
    And HMS-PMS asks for the bed number
    And the Charge nurse selects a rooms from the list of available rooms
    And a beds is in the ward
    And Charge Nurse enters remaining admission information
    When the application command admitPatient is invoke
    Then HMS admits the patient

  Scenario: Division is complete
    Given the HMS-PMS is On 
    And the Charge Nurse is logged in
    And the Charge Nurse is consulting the patient files
    And Charge Nurse chooses to admit a Patient
    And the division is complete
    When the application command admitPatient is invoke
    Then HMS notifies Charge Nurse that her division is complete
    And HMS gives the possibility to request an admission for the Patient
