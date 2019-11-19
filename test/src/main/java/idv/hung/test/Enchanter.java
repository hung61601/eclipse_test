package idv.hung.test;

public class Enchanter extends Actor {
	private int Int;
	public void setInt(int num) {
		Int = num;
	}
	public int getInt() {
		return Int;
	}
	@Override
	public void showStatus() {
		System.out.printf("%s: My INT has %d points.%n", this.getName(), Int);
	}
}
