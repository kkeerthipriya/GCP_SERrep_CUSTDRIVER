

Feature: Home Page Login
User should login to forever new

@Regression1 @Regression2
Scenario Outline: Login
Given I am registered user
When I open Forever login page and enter login details '<UserName>' and '<Passwd>'
Then I should login to the forever new
Examples:
|UserName                 | Passwd   |
|k.keerthipriya@gmail.com | kiran143 |
@Regression2
Scenario Outline: GiftCard
Given I open the Forever New home page '<Uname>' and '<Pwd>'
When I open buy gift cards page
And give all the details '<GiftCardValue>' and '<QTY>' and '<SenName>' and '<SenEmail>' and '<RcvName>' and '<RcvEmail>' and '<Msg>' and '<CreditCardNo>' and '<ExpMonth>' and '<ExpYear>' and '<CVV>'
Then I should login to the forever new website
Examples:
|Uname                    | Pwd      | GiftCardValue        | QTY |SenName |SenEmail                    | RcvName | RcvEmail                 | Msg              | CreditCardNo     | ExpMonth | ExpYear | CVV |
|k.keerthipriya@gmail.com | kiran143 | Gift Card CA +$50.00 | 1   |Keerthi | k.keerthipriya@gmail.com   | Kiran | kiroooos@gmail.com         | Happy weekend    | 4444333322221111 | 11       | 20      | 123 |
|k.keerthipriya@gmail.com | kiran143 | Gift Card CA +$75.00 | 1   |Keerthi | k.keerthipriya@gmail.com   | Kiran | kiroooos@gmail.com         | Happy birthday   | 4444333322221111 | 11       | 20      | 123 |
@Regression3
Scenario Outline: GiftCard in
Given I open the Forever New page '<Uname>' and '<Pwd>'
When I open gift cards page
And give all the details with invalid email id '<GiftCardValue>' and '<QTY>' and '<SenName>' and '<SenEmail>'
Then I should not be able to go ahead with purchasing and should throw an error message
Examples:
|Uname                    | Pwd      | GiftCardValue        | QTY |SenName |SenEmail                    |
|k.keerthipriya@gmail.com | kiran143 | Gift Card CA +$50.00 | 1   |Keerthi | k.keerthipriya@gmail       |
