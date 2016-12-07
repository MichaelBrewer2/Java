import java.util.Date;

public class Orange extends Fruit{
	public Orange(){
		this.name = "orange";
	}
	
	public Orange(Date r){
		this.name = "orange";
		this.ripe = r;
	}
	
	public void prepare(){
		System.out.println("Peel the orange");
	}

}
