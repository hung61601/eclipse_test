package idv.hung.test;

public class Run {

	public static void main(String[] args) {
		// 產生劍士角色
		SwordsmanFactory sf = new SwordsmanFactory();
		sf.strength(25);
		Swordsman s = sf.produce();
		// 產生法師角色
		EnchanterFactory ef = new EnchanterFactory();
		ef.Intelligence(60);
		Enchanter e = ef.produce();
		// 武器使用默認參數
		WeaponFactory wf = new WeaponFactory();
		Weapon w1 = wf.produce();
		// 防具給予參數
		ArmorFactory af = new ArmorFactory();
		af.name("gold armor");
		Armor a1 = af.produce();
		af.name("silver armor");
		Armor a2 = af.produce();
		
		// 顯示狀態
		System.out.print("Show swordsman status: ");
		s.showStatus();
		// 進行裝備
		s.setWeapon(w1);
		//System.out.println("Swordsman equipped with weapon.");
		System.out.printf("%s equipped with %s.%n", s.getName(), s.getWeapon().getName());
		s.setArmor(a1);
		System.out.printf("%s equipped with %s.%n", s.getName(), s.getArmor().getName());
		e.setArmor(a2);
		System.out.printf("%s equipped with %s.%n", e.getName(), e.getArmor().getName());
	}

}
