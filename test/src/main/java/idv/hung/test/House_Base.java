package idv.hung.test;

public abstract class House_Base {
	private Actor_Base actor;
	
	public House_Base(Actor_Base actor)
	   {
	      this.actor = actor;
	   }
	public Actor_Base own()
	   {
		  return actor;
	   }
	public abstract Furniture_Base[] getFumitures();
}
