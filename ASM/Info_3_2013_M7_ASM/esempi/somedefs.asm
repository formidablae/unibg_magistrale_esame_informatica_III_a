/** at every step increments the seconds 
*/
asm somedefs

import STDL/StandardLibrary

signature:     

     static mymax: Prod(Integer,Integer) -> Integer
     
     static contains0: Seq(Integer) -> Boolean
     
definitions:    

    function mymax($x in Integer, $y in Integer) = 
    if $x < $y then $y else $x endif

    function contains0($l in Seq(Integer)) = 
       // se $ l è vuota allora falso
       if isEmpty($l) then false
       // altrimenti 
       else if first($l) = 0 then true
            else let ($resto = tail($l)) in
                 contains0($resto) endlet
            endif
       endif

default init s0:
