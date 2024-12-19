# UC9 Request Patient Admission
Feature: Charge Nurse request patient admission to another division

    Scenario: Charge Nurse request patient admission to another division
        Given the HMS-PMS system is On
        And Charge Nurse is logged in
        And patient is registered
        And patient is not admitted to any division
        And the patient registration is being displayed
        And HMS asks for the division for which request is to be made
        And the HMS-PMS asks for additional information
        And the Charge Nurse provides the requested information
        When the application command requestPatientAdmission
        Then the patient is added to the request list for admission at the requested division
        And HMS-PMS sends notification to requested ward Charge Nurse
        And the PMS system displays a message that patient is request for admission to another division


    Scenario: Charge Nurse provides incorrect information when requesting patient admission to another division
        Given the HMS-PMS system is On
        And Charge Nurse is logged in
        And patient is registered
        And patient is not admitted to any division
        And the patient registration is being displayed
        And HMS asks for the division for which request is to be made
        And the HMS-PMS asks for additional information
        And the Charge Nurse provides incorrect information
        When the application command requestPatientAdmission
        Then the patient is not added to the request list for admission at the requested division
        And HMS-PMS displays an information error message


    Scenario: Charge Nurse request patient admission to another division when patient is already admitted to a division
        Given the HMS-PMS system is On
        And Charge Nurse is logged in
        And patient is registered
        And patient is admitted to a division
        And the patient registration is being displayed
        And HMS asks for the division for which request is to be made
        And the HMS-PMS asks for additional information
        And the Charge Nurse provides the requested information
        When the application command requestPatientAdmission
        Then the patient is not added to the request list for admission at the requested division
        And HMS-PMS displays patient already in ward error message