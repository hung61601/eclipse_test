package idv.hung.test;

public class BuilderFactory {
	
	public Builder create(String category) {
		switch (category) {
		case "Weapon":
			return new WeaponBuilder();
		case "Armor":
			return new ArmorBuilder();
		default :
			return null;
		}
	}
}
