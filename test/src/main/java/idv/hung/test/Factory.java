package idv.hung.test;

public abstract class Factory {
	protected static LogCache cache;
	
	public static void setCache(LogCache c) {
		cache = c;
	}
}

//各類工廠

/*
class WeaponFactory extends Factory {
	private String name = "default Weapon";
	private int atk = 50;
	
	public void name(String n) {
		name = n;
	}
	public void attack(int n) {
		atk = n;
	}
	public String showMessage() {
		return "Produced a Weapon.";
	}
	public Weapon produce() {
		Weapon product = new Weapon();
		product.setAtk(atk);
		product.setName(name);
		System.out.println(showMessage());
		return product;
	}
}

class ArmorFactory extends Factory {
	private String name = "default Armor";
	private int def = 12;
	
	public void name(String n) {
		name = n;
	}
	public void defense(int n) {
		def = n;
	}
	public String showMessage() {
		return "Produced a Armor.";
	}
	public Armor produce() {
		Armor product = new Armor();
		product.setDef(def);
		product.setName(name);
		System.out.println(showMessage());
		return product;
	}
}
*/