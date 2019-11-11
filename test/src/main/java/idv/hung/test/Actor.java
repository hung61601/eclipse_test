package idv.hung.test;

public abstract class Actor implements Item {
	private String name;
	private Weapon weapon;
	private Armor armor;
	private String[] commands;
	protected String[] type;
	
	public void setName(String newName) {
		name = newName;
	};
	public String getName() {
		return name;
	};
	public void setWeapon(Weapon newWeapon) {
		weapon = newWeapon;
	}
	public void setArmor(Armor newArmor) {
		armor = newArmor;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public Armor getArmor() {
		return armor;
	}
	public String[] getCommands() {
		return commands;
	};
	public abstract void showStatus();
}

//子類定義

class Swordsman extends Actor {
	private int str;
	public void setStr(int num) {
		str = num;
	}
	public int getStr() {
		return str;
	}
	@Override
	public void showStatus() {
		System.out.printf("My STR has %d points.%n", str);
	}
}

class Enchanter extends Actor {
	private int Int;
	public void setInt(int num) {
		Int = num;
	}
	public int getInt() {
		return Int;
	}
	@Override
	public void showStatus() {
		System.out.printf("My INT has %d points.%n", Int);
	}
}