/** advanced clock con signal - da demo pisa*/

asm example_monitored

import STDL/StandardLibrary

signature:

monitored m:Integer  
controlled x:Integer    

definitions:    

main rule r_main = 
    if m > 0  then
		x := 1 
     endif

default init s1:    
  function x = 0