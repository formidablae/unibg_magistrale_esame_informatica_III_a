/*
 * mcomputer.h
 *
 *  Created on: 12/nov/2014
 *      Author: garganti
 */

#ifndef MODULE_MCOMPUTER_H_
#define MODULE_MCOMPUTER_H_

// uso interi pe rindirizzare i computer
typedef  int  computerid;

// using modules
// int denotes the computer
// computer name
void setComputerData(char*,computerid);
char* getComputerName(computerid);

// print data
void printComputer(computerid);


#endif /* MODULE_MCOMPUTER_H_ */
