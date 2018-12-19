package chapter09.inventory;

public class Person {
	public long id;
	
	public boolean equals(Object obj){
		if(obj != null &&obj instanceof Person){
			return id == ((Person)obj).id;
		}else{
			return false;
		}
	}
	
	public Person(long id){
		this.id = id;
	}
}
