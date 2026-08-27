package day7;

public class recursion {
static void count(int n) {
	if(n==0) {
		return;
	}
	System.out.println("calling count("+n + ")");
	count(n-1);
	System.out.println("Returning from the count(" + n +")");
}
	public static void main(String[] args) {
		count(5);
	}

}
