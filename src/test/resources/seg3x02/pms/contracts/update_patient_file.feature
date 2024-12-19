#UC6 Update Patient Files
Feature: Medical Staff Member attempts to update a patients file

    Scenario: Medical Staff Member attempts to update a registered patients file
        Given the HMS-PMS system is On
        And Medical Staff Member is logged in
        And patient is registered
        And the patient's file is open
        When the application command updatePatientFile is invoked
        Then the system updates the patients file
        And the system displays a message that the file has been updated
        And the system displays the updated file

    Scenario: Medical Staff Member updates a patients file with invalid information
        Given the HMS-PMS system is running
        And Medical Staff Member is logged in
        And patient is registered
        And the patient's file is open
        And the updated patient's details are invalid
        When the application command updatePatientFile is invoked
        Then the system does not update the patients file
        And the patient's file is not updated
        And the system displays an error message


    #3. a. Medical Staff Member do not have enough privilege to modify
    #3. a. 1. HMS displays modification not allowed error message

    Scenario: Medical Staff Member attempts to update a patients file with insufficient privilege
        Given the HMS-PMS system is running
        And Medical Staff Member is logged in
        And patient is registered
        And the patient's file is open
        And the Medical Staff Member does not have enough privilege to modify
        When the application command updatePatientFile is invoked
        Then the system does not update the patients file
        And the displays modification not allowed error message