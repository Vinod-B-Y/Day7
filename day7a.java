package day7;

public class day7a {
static void methodA() {
	System.out.println("inside methodA");
	methodB();
	System.out.println("Back to method");
}
static void methodB() {
	System.out.println("inside the methodB");
}
public static void main(String[] args) {
	System.out.println("inside main");
	methodA();
	System.out.println("Back to main");
}
}