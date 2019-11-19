package idv.hung.test;

public class Swordsman extends Actor {
	private int str;
	public void setStr(int num) {
		str = num;
	}
	public int getStr() {
		return str;
	}
	@Override
	public void showStatus() {
		System.out.printf("%s: My STR has %d points.%n", this.getName(), str);
	}
}
