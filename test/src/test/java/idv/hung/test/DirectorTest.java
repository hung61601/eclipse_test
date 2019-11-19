package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DirectorTest {
	private Director director;
	private LogCache log;
	private String[] strArray = {"Weapon","Armor"}; 
	
	@Before
	public void setUp() {
		log = LogCache.getInstance();
		Builder.setCache(log);
		director = new Director();
	}
	@Test
	public void testWeaponConstruct() {
		WeaponBuilder wb = (WeaponBuilder) new BuilderFactory().create(strArray[0]);
		Weapon w1 = director.Construct(wb, true);
		assertEquals(w1.getName().getClass(), "".getClass());
		assertNotNull(w1.getAtk());  //要驗證是否為數字型態
		wb.setName("gold Weapon");
		wb.setAtk(35);
		Weapon w2 = director.Construct(wb, false);
		assertEquals(w2.getName(), "gold Weapon");
		assertEquals(w2.getAtk(), 35);
		wb.setAtk(-35);
		Weapon w3 = director.Construct(wb, false);
		assertEquals(w3.getAtk(), 0);
	}
	@Test
	public void testArmorConstruct() {
		ArmorBuilder ab = (ArmorBuilder) new BuilderFactory().create(strArray[1]);
		Armor a1 = director.Construct(ab, true);
		assertEquals(a1.getName().getClass(), "".getClass());
		assertNotNull(a1.getDef());  //要驗證是否為數字型態
		ab.setName("silver armor");
		ab.setDef(5);
		Armor a2 = director.Construct(ab, false);
		assertEquals(a2.getName(), "silver armor");
		assertEquals(a2.getDef(), 5);
		ab.setDef(-5);
		Armor a3 = director.Construct(ab, false);
		assertEquals(a3.getDef(), 0);
	}
}
