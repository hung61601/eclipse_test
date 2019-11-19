package idv.hung.test;

public class SwordsmanFactory extends Factory {
	private String name = "Swordsman";
	private int str = 0;
	
	public void setName(String n) {
		name = n;
	}
	public void setStrength(int s) {
		if(s < 0) s = 0;
		str = s;
	}
	public Swordsman produce() {
		Swordsman product = new Swordsman();
		product.setName(name);
		product.setStr(str);
		System.out.printf(cache.getProduced(), name);
		return product;
	}
}
