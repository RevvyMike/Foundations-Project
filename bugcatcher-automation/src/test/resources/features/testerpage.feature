Feature: Testers should be able to view and update defects to monitor progress on their home page.

    Scenario: As a tester, I want to select defects assigned so I can begin working on them.

        Given  Tester is on Tester homepage.
        When   Tester selects accept defect.
        When   Tester selects declines defect.
        Then   Tester should click submit update defects.


    Scenario: Update from pending to Accepted
    Scenario: Update from pending to Declined
    Scenario: Update from Accepted to Rejected
    Scenario: Update from Accepted to Fixed
    Scenario: Update from Accepted to Shelved

        Given  Tester is in defense against the dark arts table on their homepage
        When   Tester rejects the defect.
        When   Tester fixes the bug.
        When   Tester shelves the bug.
        Then   Tester should click submit update defects.   