package idv.hung.test;

public class EnchanterFactory extends Factory {
	private String name = "Enchanter";
	private int Int = 0;
	
	public void setName(String n) {
		name = n;
	}
	public void setIntelligence(int i) {
		if(i < 0) i = 0;
		Int = i;
	}
	public Enchanter produce() {
		Enchanter product = new Enchanter();
		product.setName(name);
		product.setInt(Int);
		System.out.printf(cache.getProduced(), name);
		return product;
	}
}
