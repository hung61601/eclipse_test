package idv.hung.test;

public abstract class Equip implements Item {
	private String name;
	private String[] commands;
	protected String[] value;
	
	public void setName(String newName) {
		name = newName;
	};
	public String getName() {
		return name;
	};
	public String[] getCommands() {
		return commands;
	};
}
