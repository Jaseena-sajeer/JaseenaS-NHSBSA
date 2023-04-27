Feature: As a citizen of the UK
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Background: 
    Given I want to open NHS cost checker site
    Then I am on the 'Check what help you could get to pay for NHS costs - NHSBSA' page

  Scenario: As a citizen of England I want to check help from NHS cost
    When I am starting cost checker
    Then I am on the 'Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA' page
    And I select option 'England' and click next
    Then I am on the 'Is your GP practice in Scotland or Wales? - Check what help you could get to pay for NHS costs - NHSBSA' page
    And I select option 'No' and click next
    Then I am on the 'Which country is your dental practice in? - Check what help you could get to pay for NHS costs - NHSBSA' page
    And I select option 'England' and click next
    Then I am on the 'What is your date of birth? - Check what help you could get to pay for NHS costs - NHSBSA' page
    And I enter my date of birth '25' '12' '1990' and click next
    Then I am on the 'Do you live with a partner? - Check what help you could get to pay for NHS costs - NHSBSA' page
    And I select option 'Yes' and click next
    Then I am on the 'Do you or your partner claim any benefits or tax credits? - Check what help you could get to pay for NHS costs - NHSBSA' page
    And I select option 'Yes' and click next
    Then I am on the 'Do you or your partner get paid Universal Credit? - Check what help you could get to pay for NHS costs - NHSBSA' page
    And I select option 'Yes, we receive Universal Credit payments' and click next
    Then I am on the 'As part of your joint Universal Credit, do you have any of these? - Check what help you could get to pay for NHS costs - NHSBSA' page
    And I select option 'No' and click next
    Then I am on the 'Did you and your partner have a combined take-home pay of £435 or less in your last Universal Credit period? - Check what help you could get to pay for NHS costs - NHSBSA' page
     And I select option 'No' and click next
     Then I am on the 'Are you pregnant or have you given birth in the last 12 months? - Check what help you could get to pay for NHS costs - NHSBSA' page
     And I select option 'No' and click next
     Then I am on the 'Do you have an injury or illness caused by serving in the armed forces? - Check what help you could get to pay for NHS costs - NHSBSA' page
     And I select option 'No' and click next
     Then I am on the 'Do you have diabetes? - Check what help you could get to pay for NHS costs - NHSBSA' page
     And I select option 'No' and click next
     Then I am on the 'To check what help you can get with NHS charges, we need to know if you're affected by any of these conditions - Check what help you could get to pay for NHS costs - NHSBSA' page
     And I select option 'No' and click next
     Then I am on the 'Do you have glaucoma? - Check what help you could get to pay for NHS costs - NHSBSA' page
     And I select option 'No' and click next
     Then I am on the 'Do you or your partner live permanently in a care home? - Check what help you could get to pay for NHS costs - NHSBSA' page
     And I select option 'No' and click next
    Then I am on the 'Do you and your partner have more than £16,000 in savings, investments or property? - Check what help you could get to pay for NHS costs - NHSBSA' page
     And I select option 'No' and click next
    Then I confirm 'You could get help to pay for your NHS costs' 
    
    
