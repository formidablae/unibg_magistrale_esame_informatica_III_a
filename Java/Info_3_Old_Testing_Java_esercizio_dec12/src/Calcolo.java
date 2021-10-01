public class Calcolo {

	static void m(int x, int y, boolean proceed) {
		int h = x * y;
		if ((h>100 &&  proceed) || x == 0){
			y++;
		}
	}

}
//         ( h>100 &&  proceed) || x == 0
//1. h>100 T:    T          T           F 
//2. h>100 F:    F          T           F
//3. proceed T:  T          T           F  c'è già 1   
//4. proceed F:  T          F           F
//5. x==0    T:  F          T           T
//6. x==0    F:  F          T           F  c'è già 2