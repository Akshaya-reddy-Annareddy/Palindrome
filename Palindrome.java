import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String str = String.valueOf(num);
        String str1 = "";
        for(int i = str.length()-1; i>=0; i--){
            str1+=str.charAt(i);
        }
        System.out.println(str1);
        int num1 =Integer.valueOf(str);
        int num2 = Integer.valueOf(str1);
        if(num1 == num2){
            System.out.println("Given number is a palindrome");
        }else{
            System.out.println("Given number is not a palindrome");
        }
    }
}


    

   



