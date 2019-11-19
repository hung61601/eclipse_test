package idv.hung.test;

public class Run {

	public static void main(String[] args) {
		// 日誌文字快取
		LogCache cache = LogCache.getInstance();
		Factory.setCache(cache);
		// 用工廠模式產生劍士角色
		SwordsmanFactory sf = new SwordsmanFactory();
		sf.setName("super Swordsman");
		sf.setStrength(25);
		Swordsman s = sf.produce();
		// 用工廠模式產生法師角色
		EnchanterFactory ef = new EnchanterFactory();
		ef.setIntelligence(60);
		Enchanter e = ef.produce();
//		// 用工廠模式產生武器
//		WeaponFactory wf = new WeaponFactory();
//		Weapon w1 = wf.produce();
//		// 用工廠模式產生防具
//		ArmorFactory af = new ArmorFactory();
//		af.name("gold armor");
//		Armor a1 = af.produce();
//		af.name("silver armor");
//		Armor a2 = af.produce();
		
		// 用建造者模式製作裝備, 這裡使用兩種不同方法實現
		// 建造指揮者
		Director director = new Director();
		Builder.setCache(cache);
		// 得到由老闆自行指揮生產的武器
		WeaponBuilder weaponBuilder = (WeaponBuilder) new BuilderFactory().create("Weapon");
		Weapon w1 = director.Construct(weaponBuilder, true);
		// 得到由客戶給予藍圖生產的防具
		ArmorBuilder armorBuilder = (ArmorBuilder) new BuilderFactory().create("Armor");
		armorBuilder.setName("gold armor");
		armorBuilder.setDef(35);
		Armor a1 = director.Construct(armorBuilder, false);
		armorBuilder.setName("silver armor");
		armorBuilder.setDef(20);
		Armor a2 = director.Construct(armorBuilder, false);
		
		System.out.println(weaponBuilder.getClass());
		// 顯示狀態
		s.showStatus();
		e.showStatus();
		// 進行裝備
		s.setWeapon(w1);
		System.out.printf("%s equipped with %s.%n", s.getName(), s.getWeapon().getName());
		s.setArmor(a1);
		System.out.printf("%s equipped with %s.%n", s.getName(), s.getArmor().getName());
		e.setArmor(a2);
		System.out.printf("%s equipped with %s.%n", e.getName(), e.getArmor().getName());
	}
}
