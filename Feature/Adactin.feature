Feature: Hotel Booking in Adactin Application
@Ad1
Scenario Outline: Login Page
Given user Launch The Application
When user Enter The "<Username>" In Username Filed
And user Enter The "<Password>" In Password Filed
Then user Click The Login Button And Its Navigate To "https://adactinhotelapp.com/SearchHotel.php"
Examples:
|Username|Password|
|Bath|hetd|
|BarathBarath|Barath@12|

@Ad1
Scenario: Search Hotel
When user Select The Location In Location Filed
And user Select The Hotels In Hotels Filed
And user Select The Room Type In Room Type Filed
And user Select The Number Of Rooms In Number Of Rooms Filed
And user Enter The Check In Date In Check In Date Filed "09/11/2022"
And user Enter The Check Out Date In Check Out Date Filed "14/11/2022"
And user Select The Adults Per Room In Adult Per Room Filed
And user Select The Child Per Room In Child Per Room Filed
Then user Click The Search Button And Its Navigate To "https://adactinhotelapp.com/SelectHotel.php"

@Ad2
Scenario: Select Hotel
When user Select The Hotel In Select Hotel Filed
Then user Click The Continue Button And Its Navigate To "https://adactinhotelapp.com/BookHotel.php"

@Ad2
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

@Ad3
Scenario: Booking Confirmation
When user Click The My Itinerary Button

@Ad3
Scenario: Booking Itinerary
When User Click The Logout Button In Logout Filed