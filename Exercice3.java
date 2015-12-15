import java.util.*;
class Exercice3 {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int w = sc.nextInt();
        
        System.out.println("Enter another number:");
        int x = sc.nextInt();
        
        System.out.println("Enter yet another number:");
        int y = sc.nextInt();
        
        System.out.println("Enter one more number:");
        int z = sc.nextInt();
        
        big(w,x,y,z);
        
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