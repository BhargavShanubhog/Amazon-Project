

Feature: Login function with different credentials

  
  

  
  Scenario Outline: Login account
    Given open url
    Given sign out from current account
    When type email id <email> 
    When press continue button
    Then type password <password> 
    Then press sign in button

    Examples: 
      | email  | password | 
      |  |      | 
      | bhargavshanubhog |      | 
      |65231478|      |
      |bhargavshanubhog@gmail.com|  |
      |  |jklou|
      |  |S@123|
