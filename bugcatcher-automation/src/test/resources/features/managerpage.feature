Feature: Manager should be able to create defects in their homepage

    Scenario: As a manager, I want to create defects so that I can get them addressed

        Given  The manager is on their homepage.
        When   The manager creates defects.
        When   The manager assigns a tester to defects.   
        Then   The manager should click submit defects button when finished.

# Feature: Manager should be able to assign defects in their home page.

#     Scenario: As a manager, I want to assign defects so they can be worked on.

#         Given  The manager is on their homepage.
#         When   The manager assigns a tester to defects.
#         Then   The manager should click submit defects button when finished.