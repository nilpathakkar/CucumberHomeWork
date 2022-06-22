@cat
Feature: category

  Scenario Outline: user should be able to nevigate to desire category page from top header menu
    Given user is on home page
    When user click on "<category_name>" link from top menu header
    Then user should able tonavigated successfully to related "<category_url>" category page successfully
    Examples:
      | category_name     | category_url                                   |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |
      | Books             | https://demo.nopcommerce.com/books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        |