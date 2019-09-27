package idv.hung.test;

public class Multiplier {
	public int multiplier(int a, int b) {
		return a*b;
	}

	public <T> Oprand<T> multiply(Oprand<T> a, Oprand<T> b) {
		return  a.multiply(b);
	}
}
