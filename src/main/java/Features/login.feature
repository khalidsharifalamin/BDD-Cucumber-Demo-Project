Feature: Free OSA Login Feature

Scenario: Free OSA Login Test Scenario

Given User is already on osa login page
When Title of login page is osa login
#~~parameterized~~#
#Then User enter "moutushislam@gmail.com" and "Asad1234"

#~~Testdata method~~#
#Then User enter username and passord
#|       moutushi     |   1234 |

#~~map object~~#
Then User enter username and passord
|         username        | password |
|         moutushi        |    1234  |
#|         alamin         |    a123  |

Then User clicks on login button
Then User is on Student page
Then close browser

#Scenario Outline: Free OSA Login Test Scenario
#Given User is already on osa login page
#When Title of login page is osa login
#Then User enter "<username>" and "<password>"
#Then User clicks on login button
#Then User is on Student page
#Then close browser
#Examples:
#   |       username         | password |
#   |       moutushi         |    123   |
#   |       alamin           |   1234   | 
