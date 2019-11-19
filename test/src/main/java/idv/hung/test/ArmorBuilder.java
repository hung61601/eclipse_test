package idv.hung.test;

public class ArmorBuilder extends Builder {
	private Armor armor= new Armor();
	
	public void createArmor() {
		armor = new Armor();
	}
	public void setName(String newName) {
		armor.setName(newName);
	}
	public void setDef(int num) {
		if(num < 0) num = 0;
		armor.setDef(num);
	}
	public Armor build() {
		Armor buildArmor = armor;
		System.out.printf(cache.getBuild(), buildArmor.getName());
		createArmor();
		return buildArmor;
	}
}
