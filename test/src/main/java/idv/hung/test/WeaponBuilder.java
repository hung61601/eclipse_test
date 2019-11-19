package idv.hung.test;

public class WeaponBuilder extends Builder {
	private Weapon weapon = new Weapon();
	
	private void createWeapon() {
		weapon = new Weapon();
	}
	public void setName(String newName) {
		weapon.setName(newName);
	}
	public void setAtk(int num) {
		if(num < 0) num = 0;
		weapon.setAtk(num);
	}
	public Weapon build() {
		Weapon buildWeapon = weapon;
		System.out.printf(cache.getBuild(), buildWeapon.getName());
		createWeapon();
		return buildWeapon;
	}
}
