
asm example_parallel

import STDL/StandardLibrary

signature:

monitored m:Integer
controlled x:Integer    
controlled y:Integer    

definitions:    

main rule r_main = 
    if m > 0  then
    par 
        x := x + 1
		y := x	  
     endpar
    endif
    
default init s1:    
  function x = 0