# UC4 Register Patient
Feature: Staff member attempts to register a patient to the HMS-PMS system

    Scenario: Staff member registers a new patient
        Given the HMS-PMS system is running
        And the staff member registered
        And staff member is logged in
        And the patient is not registered
        And the patient's details are valid
        When the application command registerPatient is invoked
        Then the patient is registered
        And the patient's details are stored in the HMS-PMS system
        And the HMS-PMS system displays an acknowledgement message

    Scenario: Staff member registers a patient that is already registered
        Given the HMS-PMS system is running
        And the staff member is logged in
        And the patient is registered
        And the patient's details are valid
        When the application command registerPatient is invoked
        Then the patient is not registered
        And the HMS-PMS system displays an error message

    Scenario: Staff member registers a patient with invalid details
        Given the HMS-PMS system is running
        And the staff member is logged in
        And the patient is not registered
        And the patient's details are invalid
        When the application command registerPatient is invoked
        Then the patient is not registered
        And the HMS-PMS system displays an error message that patient's details are invalid
