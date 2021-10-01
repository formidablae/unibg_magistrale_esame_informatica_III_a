/** at every step increments the seconds 
*/
asm somefunctions

import STDL/StandardLibrary

signature:     

     abstract domain Student

     domain Voto subsetof Natural

     enum domain Color = {RED | GREEN | BLUE}
     
     static due : Natural

     static angelo: Student
   
     dynamic controlled studentePiuBravo : Student
     
     static opposto: Integer -> Integer
     
     // 
     dynamic controlled peso: Persona -> Integer
     
     
     static mymax: Prod(Integer,Integer) -> Integer
     
definitions:    

    function due = 2n

    function mymax = ...

default init s0:
