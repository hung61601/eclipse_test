package idv.hung.test;

public class LogCache {
	private static LogCache uniqueInstance = new LogCache();
	// 工廠生產產品
	private String produced = "Produced a \"%s\".%n";
	// 建造者建造產品
	private String build = "build a \"%s\".%n";
	
	private LogCache() {
		
	}
	public static LogCache getInstance() {
		return uniqueInstance;
	}
	public String getProduced() {
		return produced;
	}
	public String getBuild() {
		return build;
	}
}
