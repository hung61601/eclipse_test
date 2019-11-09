package idv.hung.test;

public abstract class Actor implements Item {
	private String name;
	private String[] commands;
	protected String[] type;
	
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
