import java.util.Date;

public class Fruit extends Food{
	Date ripe;
	
	public Fruit(){
		this.name = "Generic Fruit";
		this.ripe = null;
	}
	public Fruit(Date r, String n){
		this.name = n;
		this.ripe = r;
	}
	
	public void ripeTime(){
		System.out.println("You can eat it on " + ripe);
	}
}
