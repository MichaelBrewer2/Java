import java.util.*;
import java.util.Date;

public class MainClass {
	public MainClass(){
		
	}
	
	public ArrayList<Object> makeClasses(ArrayList<Object> arlist){
		int size, i, date;
		String name, obj;
		Date d;
		
		ArrayList <Object> temp_al = new ArrayList<Object>();
		
		size = arlist.size();
		
		for(i = 0; i < size; i++){
			obj = arlist.get(i).toString();
			if(obj == Food.class.getSimpleName()){
				name = arlist.get(i + 1).toString();
				Food f = new Food(name);
				temp_al.add(f);
				i = i + 1;
			}
			else if(obj == Fruit.class.getSimpleName()){
				name = arlist.get(i + 1).toString();
				if(arlist.get(i + 2).toString() == "now"){
					d = new Date();
				}
				else{
					date = (Integer)arlist.get(i + 2);
					d = new Date(date);
				}
				Fruit r = new Fruit(d, name);
				temp_al.add(r);
				i = i + 2;
			}
			else if(obj == Seafood.class.getSimpleName()){
				name = arlist.get(i + 1).toString();
				Seafood s = new Seafood(name);
				temp_al.add(s);
				i = i + 1;
			}
			else if(obj == Apple.class.getSimpleName()){
				if(arlist.get(i + 1).toString() == "now"){
					d = new Date();
				}
				else{
					date = (Integer)arlist.get(i + 1);
					d = new Date(date);
				}
				Apple a = new Apple(d);
				temp_al.add(a);
				i = i + 1;
			}
			else if(obj == Orange.class.getSimpleName()){
				if(arlist.get(i + 1).toString() == "now"){
					d = new Date();
				}
				else{
					date = (Integer)arlist.get(i + 1);
					d = new Date(date);
				}
				Orange o = new Orange(d);
				temp_al.add(o);
				i = i + 1;
			}
			else if(obj == Prawn.class.getSimpleName()){
				Prawn p = new Prawn();
				temp_al.add(p);
			}
			else if(obj == Shrimp.class.getSimpleName()){
				Shrimp m = new Shrimp();
				temp_al.add(m);
			}
			else{
				System.out.println("SOMETHING WENT TERRIBLY WRONG");
			}
		}
		//for(i = 0; i < temp_al.size(); i++){
		//	System.out.print(temp_al.get(i).toString() + " ");
		//}
		return(temp_al);
	}
	
	public static void main(String[] args) {
		int i;
		ArrayList <Object> al  = new ArrayList<Object>();
		ArrayList <Object> al2 = new ArrayList<Object>();
		
		MainClass c = new MainClass();

		al.add("Food");
		al.add("French Fries");
		al.add("Orange");
		al.add(9999991);
		al.add("Fruit");
		al.add("Pear");
		al.add(8833281);
		al.add("Seafood");
		al.add("Crab");
		al.add("Prawn");
		al.add("Food");
		al.add("Sandwich");
		al.add("Apple");
		al.add("now");
		
		for(i = 0; i < al.size(); i++){
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		
		al2 = c.makeClasses(al);
		
		for(i = 0; i < al2.size(); i++){
			System.out.print(al2.get(i) + " ");
		}
		
	}

}
