/*
 * adt_counter.h
 *
 *  Created on: Oct 8, 2010
 *      Author: garganti
 */

#ifndef ADT_COUNTER_H_
#define ADT_COUNTER_H_

/* Type: handle to a counter instance (an opaque pointer to an opaque record). */
typedef struct counter *counterRef;

/* Create new counter instance, initially null. */
counterRef make_counter(void);

/** return counter value */
int getValue(counterRef c);

void inc(counterRef r);

void reset(counterRef r);

#endif /* ADT_COUNTER_H_ */
