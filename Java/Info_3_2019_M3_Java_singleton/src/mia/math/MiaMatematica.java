package mia.math;

public class MiaMatematica {

	private MiaMatematica() {
	}

	private static MiaMatematica instance;

	public double getPI() {
		return Math.PI;
	}

	public static MiaMatematica getInstance() {
		if (instance == null)
			instance = new MiaMatematica();
		return instance;
	}

}
