// 

asm counter

import StandardLibrary

signature:
// DOMAINS
enum domain Colori = { RED | WHITE | YELLOW }

abstract domain Persona

domain Matricole subsetof Integer


enum domain Azioni = { INC | RESET | NONE}

// FUNCTIONS

dynamic controlled counter : Integer
dynamic monitored azione : Azioni

definitions:
// DOMAIN DEFINITIONS
// FUNCTION DEFINITIONS
// RULE DEFINITIONS
rule r_inc = /*if azione = INC then*/  
              counter := counter +1 //endif
rule r_res = /*if azione = RESET then*/  
              counter := 1 //endif
 
// INVARIANTS
invariant inv_1 = counter >= 0
// MAIN RULE
main rule r_Main = par r_inc[] r_res[] endpar
// INITIAL STATE
default init s0:
function counter = 0