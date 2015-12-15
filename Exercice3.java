import java.util.*;
class Exercice3 {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a value for X:");
        int x = sc.nextInt();
        
        System.out.println("Enter a value for Y:");
        int y = sc.nextInt();
        
        big(x,y);
        
	}

    public static void big(int A, int B, int C, int D) {
        int max = A;
        if (B>max) {
            max = B;
        }
        if (C>max) {
            max = C;
        }
        if (D>max) {
            max = D;
        }
        System.out.println(max + " is the bigger number.");
    }
}