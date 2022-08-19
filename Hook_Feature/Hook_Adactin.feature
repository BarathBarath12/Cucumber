Feature: Hotel Booking Adactin Application
@Ad1
Scenario: Book A Hotel
When user Enter The First Name In First Name Filed "Barath"
And user Enter The Last Name In Last Name Filed "K"
And user Enter The Billng Address In Billing Address Filed "8/9, Kart Road, Uk-89021"
And user Enter The Credit Card Number In Credit Card Number Filed "1272828292128212"
And user Select The Credit Card Type In Credit Card Type Filed
And user Select The Expiry Month In Expiry Month Filed
And user Select The Expiry Year In Expiry Year Filed
And user Select The Cvv Number In Cvv Number Filed
Then user Click The Book Button And Its Navigate To "https://adactinhotelapp.com/BookingConfirm.php"
