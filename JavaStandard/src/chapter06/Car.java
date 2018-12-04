package chapter06;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white","auto",4);
	}
	
	Car(String color){
		this(color,"auto",4);
	}
	
	Car(String c, String g,  int d){
		color = c;
		gearType=g;
		door =d;
	}
	
	Car(Car c){
		this.color = c.color;
		this.gearType=c.gearType;
		this.door =c.door;
	}
}
