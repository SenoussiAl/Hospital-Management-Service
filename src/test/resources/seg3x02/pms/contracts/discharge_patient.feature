# UC11 Discharge Patient
Feature: Discharge Patient

  Scenario: Charge Nurse discharges a Patient
    Given the HMS-PMS is On 
    And the Charge Nurse is logged in 
    And the Charge Nurse consults the patient files
    And the Charge Nurse selects to discharge the Patient
    When the application command dischargePatient is invoked
    Then the Patient is no longer admitted
    And the Patient bed added to the division availabilities
    And the Patient discharge information issued
    And the Patient copies slated to be sent to Patient external doctor
    And the HMS-PMS displays an acknowledgement message

