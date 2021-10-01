asm compterms

import STDL/StandardLibrary

signature:

	domain Primi100 subsetof Integer

	domain Primi100Doppi subsetof Integer

	domain Pari100 subsetof Integer

	static listapari: Seq(Integer)
	
	static setPari : Powerset(Integer)

	static list24 : Seq(Integer)

definitions:

	domain Primi100 = {1..100}

	domain Primi100Doppi = {$x in {1..100} : 2 * $x}

	domain Pari100 = {$x in {1..100} | mod($x,2) = 0 : $x}

	function listapari = [$x in [0..100] : $x]
	
	function lista24 = [2,4]

default init s0:

