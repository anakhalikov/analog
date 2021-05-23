Feature: As a Sender I able pickup and send messages


  @sender
  Scenario: Sender pickup message and send
    Given Sender pickups generates messages
    When Sender generated
    Then Sender check if message was sent

