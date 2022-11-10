import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter X :");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int x = Integer.parseInt(input1.nextLine());
        System.out.println("Enter Y :");
        int y =Integer.parseInt(input2.nextLine());
        System.out.println("Before Swaping : " + "X:" + x +"  Y:"+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swaping : " + "X:" + x +"  Y:"+y);
    }
}