package idv.hung.test;

public abstract class Builder {
	protected static LogCache cache;
	
	public static void setCache(LogCache c) {
		cache = c;
	}
}
