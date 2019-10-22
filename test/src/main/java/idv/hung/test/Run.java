package idv.hung.test;

// 子類定義
class Actor extends Actor_Base {

	public Actor(String name) {
		super(name);
	}

	@Override
	public String message() {
		return "Hello, everyone.";
	}

	@Override
	public String skill() {
		return "I can speak Chinese.";
	}
	
}

class Vase extends Furniture_Base {
	private String area;
	
	public Vase(String name, String type, String area) {
		super(name, type);
		this.area = area;
	}
	
	public String MadeIn() {
		return area;
	}
	
	public String getName()
	   {
		  return this.name;
	   }
	
	public String getType()
	   {
		  return this.type;
	   }
	
}

class House extends House_Base {
	private Furniture_Base[] furnitures;
	private int furSize;
	
	public House(Actor_Base actor) {
		super(actor);
		furSize = 0;
		furnitures = new Furniture_Base[10];
	}

	@Override
	public Furniture_Base[] getFumitures() {
		return furnitures;
	}
	
	public void AddFumitures(Furniture_Base f) {
		furnitures[furSize++] = f;
	}
	
}
//======================================================

public class Run {

	public static void main(String[] args) {
		Vase v = new Vase("Colored Vase", "Vase", "Canada");
		Actor a = new Actor("Bob");
		a.setBirthday(1998, 9, 15);
		House h = new House(a);
		h.AddFumitures(v);
		//驗證結果
		System.out.printf("The House owned furniture is：%s %n", h.getFumitures()[0].name);
		System.out.printf("House owner is：%s %n", h.own().getName());
		System.out.printf("House owner's message：%s %n", h.own().message());
		System.out.printf("personal skill：%s %n", h.own().skill());
	}

}
