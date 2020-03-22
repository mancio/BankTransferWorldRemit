# Welcome to the WorldRemit Full-stack Developer Hiring Task!

## Initial notes
 
Please be advised that:

the task should take you up to 5 hours of work
you may use the HackerRank's IDE or clone the git repository to your machine and complete the task using your favorite IDE. Just remember to push the code back before the deadline


## Requirements
 
You need to work with legacy money transfer system described as below.

Money can be transferred from source account to destination. After successful transaction accounts should be updated with proper amounts of money. Account balance cannot be negative number. Please also remember to collect transfer fees depending on transfer type.
There is business requirement to support 3 transfer types:

* domestic - standard one
* priority - should be processed first, additional fee is charged, fixed amount
* international - additional fee is charged, percentage value 

Transfers are related with accounts. There are two account types - Standard and Loyalty. 
Loyalty account holds information about loyalty card and points, this feature will be developed in the future. 

## Task Evaluation Criteria
 
* Fix any code smell and bug you find
* Add new feature: transfers should be processed from the oldest to the newest one, priority transfers should be processed first
* Add new feature: priority transfers can be combined with international transfer type
* Code is production ready

Additionally, the solution will be evaluated, taken into account the following:

* simplicity and readability of the code
* usage of SOLID and similar principles
* design of modules, classes, methods etc.
* problem solving approach
* creativity
 

Good luck and enjoy!
The WorldRemit Engineering Team
