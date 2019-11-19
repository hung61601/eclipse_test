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
