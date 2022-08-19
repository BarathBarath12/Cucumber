Feature: Purchase Dresses In Automation Practice
Background:
Given user Launch The Application
When user Click The Login Button and It Navigate To Login Page
And user Enter The Email Address In Email Address Filed "stylezzbarath992@gmail.com"
And User Enter The Password In Password Filed "Barath@998"
And user Click The Signin Button And Its Navigate The Dresses

@Dresses
Scenario: Womens Dresses Purchase
When user Click The Dresses Along With Blouses And Its Navigate To Blouses Product
And user Select The Size And Color And Compositions And Stylez And Properties And Availability And Manufaturer And Condition
And user Click The Quick View Images And Its Navigate To Add To Card
And user Enter The Quantity And Color And Then Click The Add To Card Button And Its Navigate To Proceed To CheckOut Product Page "2" 
And user Click The Proceed To Checkout Button and Its Navigate To Summary Page
And user Confirm The Summary Page Click Then Click Proceed To Checkout Button And Its Navigate To Address Details
And user Confirm The Address And Then Click The Proceed To Checkout Button And Its Navigate Shipping Details 
And user Click The Proceed To Checkout In Shipping Details And Its Navigate To Payment details
And user Click The Payment Option In Payment Details And Its Navigate To Payment Details
Then user Click Confirm My Order And Then Click The Signout Button

@CasualDresses
Scenario: Casual Dresses  Purchase
When user Click The Dresses Along With Casual Dresses And Its Navigate To Casual Dresses Product
And user Select The Size And Color And The Compositions And The Stylez And The Properties And The Availability And The Manufaturer And The Condition
And user Click The Quick View Images And Its Navigate To The Add To Card
And user Enter The Quantity And The Color And Then Click The Add To Card Button And Its Navigate To Proceed To CheckOut Product Page "2" 
And user Click The Proceed To Checkout Button and Its Navigate To The Summary Page
And user Confirm The Summary Page And Then Click Proceed To Checkout Button And Its Navigate To Address Details
And user Confirm The Address Then Click The Proceed To Checkout Button And Its Navigate To Shipping Details 
And user Click The Proceed To Checkout In Shipping Details And Its Navigate To The Payment details
And user Click The Payment Options In Payment Details And Its Navigate To The Paymenet Details
Then user Click Confirm My Order And Then Click Signout Button 

@Tshirts
Scenario: T-Shirts Purchase
When user Click The T-Shirts Along And Its Navigate To The T-Shirts Products
And user Select The Size And The Color And The Compositions And The Stylez And The Properties And The Availability And The Manufaturer And The Condition
And user Click The Quick View Images
And user Enter The Quantity And The Color And Theen Click The Add To Card Button "2" 
And user Click The Proceed To Checkout Button
And user Confirm The Summary Page And Then Click Proceed To Checkout Button
And user Confirm The Address Then Click The Proceed To Checkout Button
And user Click The Proceed To Checkout In Shipping Details
And user Click The Payment Options In Payment Details
Then user Click The Confirm My Order And Then Click The Signout Button 