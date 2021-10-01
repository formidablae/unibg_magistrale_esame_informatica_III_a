/* example of ASM specification */

asm counter

import STDL/StandardLibrary

//declare universes and functions
		
signature:

// domains 
		
    domain CounterValue subsetof Integer
	
// functions 

	dynamic controlled count : CounterValue

    dynamic monitored delta : Integer

// definitions 

definitions:
	
	domain CounterValue = {0..100}

    rule r_updateCount($x in Integer) =
      par
         if count > 0  then count := 9 endif
         count := count +9
      endpar

    rule r_upRnd =
       choose $x in {1..20} with true do count := count + $x
//Main Rule

	main rule r_Count =  if true then r_updateCount[4] endif
     
//define the initial states 

default init initial_state:
	
	function count  = 0

		
