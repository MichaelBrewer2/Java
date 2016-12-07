import java.util.Date;

public class Apple extends Fruit{
	public Apple(){
		this.name = "apple";
	}
	
	public Apple(Date r){
		this.name = "apple";
		this.ripe = r;
	}
	
	public void prepare(){
		System.out.println("Core the apple");
	}

}
