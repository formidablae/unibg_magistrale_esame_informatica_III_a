asm orologio3

import StandardLibrary

signature:

domain Secondi subsetof Integer
domain Minuti subsetof Integer
domain Ore subsetof Integer

controlled minutes: Minuti
monitored signal: Boolean
controlled hours: Ore
controlled seconds: Secondi

definitions:
// DOMAIN DEFINITIONS

domain Secondi = {0..59}
domain Minuti = {0..59}
domain Ore = {0..23}

rule r_incmin =  
       par
         seconds := 0
         minutes := minutes +1
       endpar


main rule r_1 = 

choose $s in Boolean with true do 
if $s then 
   if seconds = 59 then
   		r_incmin[]
   else
   	   seconds := seconds +1
   endif
endif

// INITIAL STATE
default init s0:
function seconds = 0
function minutes = 0