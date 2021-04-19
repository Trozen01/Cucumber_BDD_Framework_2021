#Feature: Billing calculater
  #Scenario Outline: Calculation
    #Given User is on billing page
    #Then User enter billing amount <Billingamount>
    #Then User enter tax amount <Taxamount>
    #Then System will give final amount <Finalamount>
#
    #Examples: 
      #| Billingamount  | Taxamount | Finalamount  |
      #|      100       |     50    |     150      |
      #|      150       |     70    |     220      |
      #|      200       |     8.5   |     208.5    |
#
#

      
## Hear we have one Interger value and One Double value so cucumber will use method overloading feature cucumber will create one method for int and one for double
## same method name with different parameter(one is integer and one double). 
## After create step difination and method overloading system will give you --> AmbiguousStepDefinitionsException (System not understand which value provide which method because we have two method with same name)
## this issue will solve if we used cucumber 4.8.1 version or need to convert int to string.

 