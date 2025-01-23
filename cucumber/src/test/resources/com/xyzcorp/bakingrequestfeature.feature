Feature: Matching customer request to a local baker
    Scenario: A customer requires french dinner rolls one day before Thanksgiving and there are two bakers that excel at that
        Given a customer
        When the customer search for local chefs specializing in "french dinner rolls"
        And the date requested is 11/5/2024
        And the required delivery is 11/27/2024
        Then a list of available chefs should be displayed
    Scenario: A customer requires french dinner rolls one day before Thanksgiving and but not enough leeway time
        Given a customer
        When the customer search for local chefs specializing in "french dinner rolls"
        And the date requested is 11/22/2024
        And the required delivery is 11/27/2024
        Then no chefs should be displayed
        And the customer should be told that we cannot fulfill that order
    Scenario: A customer requires french dinner rolls on Thanksgiving but we are closed that day
        Given a customer
        When the customer search for local chefs specializing in "french dinner rolls"
        And the date requested is 11/8/2024
        And the required delivery is 11/28/2024
        Then no chefs should be displayed
        And the customer should be told no deliveries will be made on a holiday
    Scenario: A customer requires obi-non for a family reunion and no chefs are available
        Given a customer
        When the customer search for local chefs specializing in "obi-non"
        And the date requested is 12/1/2024
        And the required delivery is 12/10/2024
        Then no chefs should be displayed
        And the customer should be told no chefs will specialize in that.
