package idv.hung.test;

public class FloatOprand extends Oprand<Float> {
	
	public FloatOprand(Float d) {
		this.content = d;
	}
	
	public Oprand<Float> multiply(Oprand<Float> o2) {
		return new FloatOprand(this.content*((float) o2.getContent()));
	}
}
