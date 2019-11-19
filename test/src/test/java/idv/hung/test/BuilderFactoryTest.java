package idv.hung.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuilderFactoryTest {
	private BuilderFactory bf;
	
	@Test
	public void test() {
		bf = new BuilderFactory();
		WeaponBuilder wb = (WeaponBuilder) bf.create("Weapon");
		assertNotNull(wb);
		assertEquals(wb.getClass().getName(), "idv.hung.test.WeaponBuilder");
		ArmorBuilder ab = (ArmorBuilder) bf.create("Armor");
		assertNotNull(ab);
		assertEquals(ab.getClass().getName(), "idv.hung.test.ArmorBuilder");
		assertNull(bf.create(""));
	}
}
