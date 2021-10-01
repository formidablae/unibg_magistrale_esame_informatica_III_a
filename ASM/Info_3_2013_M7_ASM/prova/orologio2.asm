asm orologio2

import StandardLibrary

signature:

domain Secondi subsetof Integer
domain Minuti subsetof Integer
domain Ore subsetof Integer

controlled minutes: Minuti
monitored signal: Boolean
controlled hours: Ore
controlled seconds: Secondi

static  max2 : Prod(Integer,Integer) -> Integer

controlled voto : Integer -> Integer

definitions:
// DOMAIN DEFINITIONS

domain Secondi = {0..59}
domain Minuti = {0..59}
domain Ore = {0..23}

function max2($x in Integer, $y in Integer) =
if $x > $y then $x else $y endif

rule r_2 = voto(1110056) := 30

main rule r_1 = 
par
	hours := 10
	hours := 3
endpar
