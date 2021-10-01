/** at every step increments the seconds 
*/
asm empty3

import STDL/StandardLibrary

signature:
// dichiarazioni
    enum domain  Switch = {ON | OFF}
    
    abstract domain Libri
    
    domain Secondi subsetof Integer
    
    dynamic controlled secondi : Secondi
    
    dynamic controlled minuti : Natural
    dynamic controlled ore : Natural
    dynamic monitored segnale : Boolean
    
    static oraPranzo : Integer
    
    // static n aria
    //static max : Prod(Integer,Integer) -> Integer
    
definitions:    
// definizioni
    domain Secondi = {0..59}

    function oraPranzo = 12

  rule r_incMin = 
       if minuti < 59 then
    		minuti := minuti +1n
       else 
          par 
            r_incHour[]
            minuti := 0n
          endpar endif
      
    main rule r_incSec = 
    if segnale then 
    	if secondi = 59 then 
    		par
    		secondi := 0
    		r_incMin[]
    		endpar
    	else secondi := secondi +1
    	endif
    endif
    
    
default init s0:
    function ore = 0n
    function minuti = 0n
    function secondi = 0
    