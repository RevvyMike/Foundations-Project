Feature: Manager should be able to create defects in their homepage

    Scenario: As a manager, I want to create defects so that I can get them addressed

        Given  The manager is on their homepage.
        When   The manager creates defects.
        When   The manager assigns a tester to defects.   
        When   The manager clicks the submit defects button when finished.
        Then   The manager should receive alert to confirm defect. 

