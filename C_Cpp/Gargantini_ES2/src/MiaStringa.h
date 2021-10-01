
#ifndef MIASTRINGA_H_
#define MIASTRINGA_H_

typedef struct MiaStringa *MiaStringaRef;

MiaStringaRef makeMiaStringa(char* st);
void add(MiaStringaRef ms, char c);
char* toString(MiaStringaRef ms);

#endif /* MIASTRINGA_H_ */
