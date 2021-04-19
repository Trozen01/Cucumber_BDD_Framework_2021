Feature: Login Feature

  Scenario Outline: Login with different combination
    Given User should be on application login page
    Then User should enter "<Username>" and "<Password>"
    Then User should press login button.

    Examples: 
      | Username  | Password | 
      | Jitu      |    5     | 
      | Jituyone  |    7     |

      
## if want use Data driven Testing then you need to use Scenario outline with example keyword.
