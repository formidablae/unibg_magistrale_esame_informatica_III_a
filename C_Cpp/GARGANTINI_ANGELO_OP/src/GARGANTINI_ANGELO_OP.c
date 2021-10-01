/*
 ============================================================================
 Name        : GARGANTINI_ANGELO_OP.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

#include "Cane.h"

void creaeabbaia(){
	Cane fido= creaCane("fido");
	abbaia(fido);
	distruggiCane(fido);
}

int main() {
	creaeabbaia();
	creaeabbaia();
	return 0;
}

