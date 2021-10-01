package extenedJava5;

import java.util.ArrayList;
import java.util.List;

import static  java.lang.Math.PI;

public class Constracuts {

	public static void main(String[] args) {
		// autoboxing unboxing
		Integer i;
		int x = 3;
		// boxing
		i = new Integer(3);
		// autoboxing
		i = x;
		// unboxing
		x = i;
		List<Integer> ll = new  ArrayList<>();
		ll.add(3);
		
		// varagrgs
		printf("%d",3);
		printf("%d %d",3,4);	
		
		double y = PI;
	}
	
	static void printf(String s, int ... args){
		System.out.println(args.length);
		System.out.println(args[0]);
		
	}
	// NOOO
	//static void printf(String s, int ... args, int n){
	
	// static void printf(String s, int ... args, int ... n){
}

@Note("tipo unico")
class Studente{
	
}
