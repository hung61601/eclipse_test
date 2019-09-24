package idv.hung.test;

public class IntegerOprand extends Oprand{
	
	
	public IntegerOprand(int a){
		this.content = a ;
	}
	
	public Oprand multiply(Oprand o2) {
		return new IntegerOprand(this.content*((int) o2.getContent()));
	}
}
