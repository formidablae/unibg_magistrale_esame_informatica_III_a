/*
 * adt_string.h
 *
 *  Created on: Oct 11, 2011
 *      Author: garganti
 */

#ifndef ADT_STRING_H_
#define ADT_STRING_H_

// pointer opaque
typedef struct StringStruct * string;

string mkString(char * s);

char* asChars(string s);

#endif /* ADT_STRING_H_ */
