Feature:  Etsy Title Verification


  Scenario: Etsy Title Verification
  When User is on https://www.etsy.com
  Then User sees title is as expected.

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
  Given User is on https://www.etsy.com
  When User types "Wooden Spoon" in the search box
  And User clicks search button
  Then User sees "Wooden Spoon" is in the title


  #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
  #everyone

  #Note: Follow POM