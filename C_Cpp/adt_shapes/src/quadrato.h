/*
 * quadrato.h
 *
 *  Created on: 12/ott/2010
 *      Author: garganti
 */

#ifndef QUADRATO_H_
#define QUADRATO_H_

typedef struct quadrato *quadratoRef;

quadratoRef makeQuadrato(int lato);


void printQuad(quadratoRef r);

// altre operazioni

#endif /* QUADRATO_H_ */
