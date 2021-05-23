Feature: As a Producer I want to be able to create messages

  Background:
    Given Producer generates messages

  @producer
  Scenario: Generates configurable number of messages
    When Producer check numbers of generated messages
    Then Producer see results numbers

  @producer
  Scenario: Each message contains up to 100 chars
    When Producer check number of characters in message
    Then Producer see result of message

  @producer
  Scenario: Check if each message is random
    When check if message are unique
    And Producer see result if messages are unique






