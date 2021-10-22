@login
  Feature: user logs in to app
    Background:User navigates to app
      Given user goes to the url
      And   user clicks on the login icon

    Scenario:User logs in to app
      Given  user enters Username for login
      And    user enters Password for login
      And    user clicks on SignIn button
      And    user clicks on Headphones image
      And    user clicks on Logitech Usb Headset
      And    user clicks black color
      And    user choose the quantity of black color
      And    user clicks on Add to Cart button
      And    user choose the yellow color
      And    user choose the quantity of yellow color
      And    user clicks on Add to Cart button
      #And   user hoover over to the shoppingCartIcon
      And    user clicks on the shoppingCartIcon
      And    user clicks on Checkout button
      And    user clicks on Next button to payment method
      And    user clicks on SafePay button
      And    user does not click on savechanges checkbox button
      And    user enters SafePay username
      And    user enters SafePay password

      And    user clicks on PayNow button
      Then   user verify the richtige Preis
      Then   user verify the gesamte Preis

