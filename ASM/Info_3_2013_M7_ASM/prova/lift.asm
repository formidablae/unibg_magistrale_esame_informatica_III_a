/* example of ASM specification */

asm lift

import StandardLibrary

//declare universes and functions
		
signature:

// domains 

    abstract domain Lift
		
    enum domain Direction = {UP | DOWN }  

    enum domain State = {MOVING | HALTED }  
	
// functions 

	dynamic controlled direction : Lift -> Direction
	dynamic controlled state : Lift -> State
	
	dynamic controlled floor:  Lift -> Floor 

// static functions 

	static odd : Natural -> Boolean

// definitions 

definitions:
	
	function odd ($x in Natural) = true

//Rules

	rule r_One = skip
	
	
//Main Rule

	main rule r_Spec = r_One[]
 
//define the initial states 

default init initial_state:
	
//	function prova  = true

		
