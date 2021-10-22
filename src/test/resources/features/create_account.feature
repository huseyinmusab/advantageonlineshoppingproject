@create_account_1
  Feature: User creates a new account
    Background:User navigates to app
                 Given user goes to the url
                 And   user clicks on the login icon



    Scenario:User should create a new account to log in to website

      And   user click on CreateNewAccount button
      And   user enters Username
      And   user enters Email
      And   user enters Password
      And   user confirms Confirm Password
      And   user enters Country
      And   user enters City
      And   user clicks agreement checkbox
      And   user clicks Register button

