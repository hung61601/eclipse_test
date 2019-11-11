package idv.hung.test;

public interface Factory {
	String showMessage();
}

//各類工廠
class SwordsmanFactory implements Factory {
	private int str;
	private String name = "Swordsman";
	
	public void strength(int s) {
		str = s;
	}
	public void name(String n) {
		name = n;
	}
	public String showMessage() {
		return "Produced a Swordsman.";
	}
	public Swordsman produce() {
		Swordsman product = new Swordsman();
		product.setName(name);
		product.setStr(str);
		System.out.println(showMessage());
		return product;
	}
}

class EnchanterFactory implements Factory {
	private int Int;
	private String name = "Enchanter";
	
	public void Intelligence(int i) {
		Int = i;
	}
	public void name(String n) {
		name = n;
	}
	public String showMessage() {
		return "Produced a Enchanter.";
	}
	public Enchanter produce() {
		Enchanter product = new Enchanter();
		product.setName(name);
		product.setInt(Int);
		System.out.println(showMessage());
		return product;
	}
}

class WeaponFactory implements Factory {
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

class ArmorFactory implements Factory {
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