Feature: Add product to wishList and Remove it
 
Scenario: User Add product to WishList and Remove
 
Given User in the HomePage
When User login to Account
And User adds product to wishlist
And user remove from wihslist
Then User see empty wishList message after removing it