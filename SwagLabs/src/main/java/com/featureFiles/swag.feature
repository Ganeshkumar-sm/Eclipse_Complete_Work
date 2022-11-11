Feature: Verifying the Login, Add to cart and Checkout Functionality of the Swag website

Scenario: Verifying the Login Functionality
Given User Launch the URl of the website
Then User Enter the <username> and <password>
|standard_user||secret_sauce|
When User Click the Login button
Then User Verifies the HomePage

Scenario: Verifying the Add to cart Functionality
Given User Click the Image of the Product
Then User Click the Add to cart icon

