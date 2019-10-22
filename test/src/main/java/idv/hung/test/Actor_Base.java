package idv.hung.test;

public abstract class Actor_Base {
	private String name;
	private String birthday;
	
	public Actor_Base(String name)
	   {
	      this.name = name;
	      this.birthday = "1970/1/1";
	   }
	public void setName(String name)
	   {
	      this.name = name;
	   }
	public String getName()
	   {
		  return this.name;
	   }
	public void setBirthday(int year, int month, int day)
	   {
	      if(year < 1970 && year > 2019)
	    	  System.out.println("Year not in range");
	      else if(month < 0 && month > 12)
	    	  System.out.println("Month not in range");
	      else if(day < 0 && day > 31)
	    	  System.out.println("Day not in range");
	      else
	    	  this.birthday = String.format("%d/%d/%d", year, month, day);
	   }
	public String getBirthday()
	   {
		  return this.birthday;
	   }
	public abstract String message();
	public abstract String skill();
}

