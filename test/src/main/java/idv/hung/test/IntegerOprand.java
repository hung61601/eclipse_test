package idv.hung.test;

public class IntegerOprand extends Oprand<Integer>{
	
	public IntegerOprand(int a){
		this.content = a ;
	}
	
	public Oprand<Integer> multiply(Oprand<Integer> o2) {
		return new IntegerOprand(this.content*((int) o2.getContent()));
	}
}
