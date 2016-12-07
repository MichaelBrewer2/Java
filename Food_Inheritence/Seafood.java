
public class Seafood extends Food{
	public Seafood(){
		this.name = "Generic Seafood";
	}
	
	public Seafood(String n){
		this.name = n;
	}
	
	public void prepare(){
		System.out.println("Peel the " + name);
	}

}