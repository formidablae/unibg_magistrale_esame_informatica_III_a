
asm studenti

import STDL/StandardLibrary

//declare universes and functions
		
signature:

// domains 
		
    abstract domain Studenti
	
// functions 

	dynamic controlled voto : Studenti -> Integer

    static pippo : Studenti
    static giovanni: Studenti
    
// definitions 

definitions:
	
	macro rule r_updateVoto($s in Studenti) =
	  voto($s):= 30
   
	
	
//Main Rule

	main rule r_Voto =  
	par r_updateVoto[pippo] r_updateVoto[giovanni]
	endpar
      
//define the initial states 

default init initial_state:
	
//	function count  = 0

		
