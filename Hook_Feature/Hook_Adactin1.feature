Feature: Hotel Booking The Adactin Application
@Ad2
Scenario: Hotel Booking
When user Enter The First Name "Barath"
And user Enter The Last Name "Sharmi"
And user Enter The Billng Address "9/12, Kart Road, Uk-89021"
And user Enter The Credit Card Number "1328222292128212"
And user Select The Credit Card Type
And user Select The Expiry Month
And user Select The Expiry Year
And user Select The Cvv Number
Then user Click Book Button And Its Navigate To "https://adactinhotelapp.com/BookingConfirm.php"
