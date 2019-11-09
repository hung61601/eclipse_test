package idv.hung.test;

// 子類定義
class Swordsman extends Actor {
	private int str;
	private Weapon weapon;
	private Armor armor;
	public void setWeapon(Weapon newWeapon) {
		weapon = newWeapon;
	}
	public void setArmor(Armor newArmor) {
		armor = newArmor;
	}
	public void setStr(int num) {
		str = num;
	}
}

class Enchanter extends Actor {
	private int Int;
	private Weapon weapon;
	private Armor armor;
	public void setWeapon(Weapon newWeapon) {
		weapon = newWeapon;
	}
	public void setArmor(Armor newArmor) {
		armor = newArmor;
	}
	public void setInt(int num) {
		Int = num;
	}
}

class Weapon extends Equip {
	private int atk;
	public void setAtk(int num) {
		atk = num;
	}
}

class Armor extends Equip {
	private int def;
	public void setDef(int num) {
		def = num;
	}
}

//======================================================

public class Run {

	public static void main(String[] args) {
		SwordsmanFactory sf = new SwordsmanFactory();
		sf.strength(25);
		Swordsman s = sf.produce();
		EnchanterFactory ef = new EnchanterFactory();
		ef.Intelligence(60);
		Enchanter e = ef.produce();
		WeaponFactory wf = new WeaponFactory();
		Weapon w1 = wf.produce();
		ArmorFactory af = new ArmorFactory();
		Armor a1 = af.produce();
		Armor a2 = af.produce();
		
		s.setWeapon(w1);
		System.out.println("Swordsman equipped with weapon.");
		s.setArmor(a1);
		System.out.println("Swordsman equipped with armor.");
		e.setArmor(a2);
		System.out.println("Enchanter equipped with armor.");
	}

}
