// 

asm orologio

import StandardLibrary

signature:
// DOMAINS

domain Secondi subsetof Integer
domain Minuti subsetof Integer
domain Ore subsetof Integer

// FUNCTIONS
dynamic controlled secondi : Secondi
dynamic controlled minuti : Minuti
dynamic controlled ore : Ore

definitions:
// DOMAIN DEFINITIONS
domain Secondi = {0..59}
domain Minuti = {0..59}
domain Ore = {0..23}
// FUNCTION DEFINITIONS
// RULE DEFINITIONS
rule r_incsec = 
	if secondi <59 then 
			secondi := secondi +1
	else secondi := 0
	endif
// INVARIANTS
// MAIN RULE
main rule r_Main =  r_incsec[]
// INITIAL STATE
default init s0:
function secondi = 0