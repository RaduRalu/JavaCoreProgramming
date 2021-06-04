# JavaCoreProgramming
  Karel’s world is defined by streets running horizontally (east-west) and avenues running
vertically (north-south). The intersection of a street and an avenue is called a corner.
Karel can only be positioned on corners and must be facing one of the four standard
compass directions (north, south, east, west).
What can Karel do?
When Karel is shipped from the factory, it responds to a very small set of commands:
- move() Asks Karel to move forward one block. Karel cannot respond to a move() command if there is a wall blocking its way.
 - turnLeft() Asks Karel to rotate 90 degrees to the left (counterclockwise).
 - pickBeeper() Asks Karel to pick up one beeper from a corner and stores the beeper in its beeper bag, which can hold an infinite number of beepers. Karel cannot respond to a pickBeeper() command unless there is a beeper
on the current corner.
 - putBeeper() Asks Karel to take a beeper from its beeper bag and put it down on the current corner. Karel cannot respond to a putBeeper() command unless there are beepers in its beeper bag.

You must do before running the programm:
- download jdk1.6  and  karel.jar 
- class extends Karel and other method is @override
- add configuration/main class Robo & use path Robo2 (our project)
New functions:
- you can load more maps for your robot (https://goo.gl/VWnQMK).
-in case you repeat some functions - select them/right mouse click/refactor/extract method/one new method will be available as private and it can be inserted instead of the repetition.
