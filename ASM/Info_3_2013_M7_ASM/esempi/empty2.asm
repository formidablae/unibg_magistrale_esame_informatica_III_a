/** at every step increments the seconds 
*/
asm empty2 

import STDL/StandardLibrary

signature:

   abstract domain Person
   
   enum domain Light = {ON | OFF}

   domain NumeriLotto subsetof Integer
   
   dynamic domain StudentiInfo3 subsetof Person
   
   static pigreco : Real
   
   dynamic controlled g: Integer
   
   dynamic out voto : StudentiInfo3 -> Natural
   
definitions:    

  domain NumeriLotto = {5,6}

default init s0:
