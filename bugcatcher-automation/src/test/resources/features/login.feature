Feature: Users of my bug catcher application should be able to login to their respective homepages

    Scenario: As a manager I want to sign in so I can view my custom homepages

        Given  The employee is on the login page
        When   The manager enters his correct username
        When   The manager enters his correct password
        When   The employee clicks the login button
        Then   The manager should be logged into the manager home page.

    Scenario: As a tester I want to sign in so I can view my custom homepages

        Given  The employee is on the login page
        When   The tester enters his correct username
        When   The tester enters his correct password
        When   The employee clicks the login button
        Then   The tester should be logged into the tester home page
