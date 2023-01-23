package ru.stqa.course.sendbox;

public class HW {
	public static void main (String [] args){
		hello("World");
		hello("Мир");
		hello("User");

		Square s = new Square(5);
		System.out.println("Площать кватрата со строной " + s.l + " = " + s.are());

		Rectangle r = new Rectangle(4,5);
		System.out.println("Площать прямоуголника со стронами " + r.a + " и " + r.b + " = " + r.area());
	}
	public static void hello(String some){
		System.out.println("Hello, " + some + "!");
	}
}