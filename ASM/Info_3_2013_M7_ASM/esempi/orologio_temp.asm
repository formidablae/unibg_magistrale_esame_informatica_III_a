asm orologio_temp

import STDL/StandardLibrary

signature:

 domain Seconds subsetof Integer 
 
 abstract domain Person

 monitored  eta : Person -> Natural

 static maxSec : Integer
 
 dynamic monitored signal : Boolean
 
 dynamic controlled seconds : Seconds
 
 dynamic controlled minute: Integer
 dynamic controlled hour: Integer

  static angelo : Person

definitions:

  domain Seconds = {0 .. 59}

  function maxSec = 59
  
  rule r_inc_min =      minute := minute +1
  
  
  rule r_inc_sec = 
  if seconds < 59 then seconds := seconds + 1
  else par 
       seconds := 0
       r_inc_min[]
       endpar
  endif
  
  
  
  main rule r_clock = 
  if signal then r_inc_sec[]
  else skip
  endif
  

default init s0: 
 function seconds = 0
 function minute = 0
