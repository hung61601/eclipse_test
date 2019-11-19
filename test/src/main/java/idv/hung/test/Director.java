package idv.hung.test;

public class Director {
	
	//指揮建造者組裝武器
	public Weapon Construct(WeaponBuilder builder, Boolean _default) {
		if(_default) {
			builder.setName("default Weapon");
			builder.setAtk(10);
			return builder.build();
		}
		else {
			return builder.build();
		}
	}
	//指揮建造者組裝防具
	public Armor Construct(ArmorBuilder builder, Boolean _default) {
		if(_default) {
			builder.setName("default Armor");
			builder.setDef(10);
			return builder.build();
		}
		else {
			return builder.build();
		}
	}
}
