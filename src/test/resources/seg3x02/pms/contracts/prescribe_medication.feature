# UC12 Prescribe Medication
Feature: Doctor prescribes medication to a patient

    Scenario: Doctor prescribes medication to a patient that is registered
        Given the HMS-PMS is On
        And the Doctor is logged in
        And patient is registered
        And the HMS-PMS asks for the patient's nas
        And the Doctor enters the patient's nas
        And the medication is in the system
        When the application command prescribeMedication is invoked
        Then the HMS-PMS prescribes the medication to the patient
        And the medication is added to the patient's medication list
        And the system displays a success message

    Scenario: Doctor prescribes medication to a patient with invalid patient nas
        Given the HMS-PMS is running
        And the Doctor is logged in
        And patient is registered
        And the HMS-PMS asks for the patient's nas
        And the Doctor enters an invalid patient nas
        And the medication is in the system
        When the application command prescribeMedication is invoked
        Then the HMS-PMS doesn't prescribe the medication to the patient
        And the medication isn't added to the patient's medication list
        And the system displays incorrect information entered


    Scenario: Doctor prescribes medication to a patient that is not hers
        Given the HMS-PMS is running
        And the Doctor is logged in
        And patient is registered registered
        And the HMS-PMS asks for the patient's nas
        And the Doctor enters the patient's nas
        And the patient is not assigned to the doctor
        When the application command prescribeMedication is invoked
        Then the HMS-PMS doesn't prescribe the medication to the patient
        And the medication isn't added to the patient's medication list
        And the HMS-PMS notifies Doctor that Patient is not hers


    Scenario: Doctor prescribes medication to a patient that is registered but the medication is not in the system
        Given the HMS-PMS is running
        And the Doctor is logged in
        And the patient is registered
        And the HMS-PMS asks for the patient's nas
        And the Doctor enters the patient's nas
        And the medication is not in the system
        When the application command prescribeMedication is invoked
        Then the patient is not prescribed the medication
        And the medication isn't added to the patient's medication list
        And the system displays an error message
