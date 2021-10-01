/*
 * auto_struct_o.h
 *
 *  Created on: 19/ott/2010
 *      Author: garganti
 */

#ifndef AUTO_STRUCT_O_H_
#define AUTO_STRUCT_O_H_

// si può anche non mettere
// typedef struct autoopaca;

typedef struct autoopaca * autoRef;

// construttore
autoRef newAuto();

// metodo per fermare un'auto
void stopSO(autoRef a);


#endif /* AUTO_STRUCT_O_H_ */
