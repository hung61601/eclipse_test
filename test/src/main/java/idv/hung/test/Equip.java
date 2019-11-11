package idv.hung.test;

public abstract class Equip implements Item {
	private String name;
	private String[] commands;
	protected String[] value;
	
	public void setName(String newName) {
		name = newName;
	};
	public String getName() {
		return name;
	};
	public String[] getCommands() {
		return commands;
	};
	public void showStatus() {
		// 讓子類重寫
	}
}

//子類定義

class Weapon extends Equip {
	private int atk;
	public void setAtk(int num) {
		atk = num;
	}
	public int getAtk() {
		return atk;
	}
}

class Armor extends Equip {
	private int def;
	public void setDef(int num) {
		def = num;
	}
	public int getDef() {
		return def;
	}
}