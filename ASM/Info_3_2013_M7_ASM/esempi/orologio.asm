/* example of ASM specification */

asm orologio

import STDL/StandardLibrary

//declare universes and functions
		
signature:

// domains 
	
// functions 

	dynamic controlled seconds : Integer
	dynamic controlled hours : Integer
	dynamic controlled minutes : Integer
    monitored signal : Boolean

// static functions 

// definitions 

definitions:
	
//Rules

    //rule r_inc_sec($x in Integer) = ...

	rule r_One = skip
	
// axioms
invariant inv_1 over seconds : seconds < 60
//Main Rule

	main rule r_Spec = 
	if signal then 
	par 
	seconds := seconds +1
	if (seconds = 60) then 
		
		//seconds := 0 
		minutes:= minutes +1
		 
	endif
	if (minutes = 60) then hours:= hours +1	 endif
	endpar
	endif
 
//define the initial states 

default init initial_state:
	
	function seconds  = 0
    function minutes  = 0
		
