
public class Food {
	String name;
	
	public Food(){
		this.name = "Random Fruit";
	}
	
	public Food(String n){
		name = n;
	}
	
	public void prepare(){
		System.out.println("Prepare the " + name);
	}
}

