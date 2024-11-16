import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class projectpwd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String alpha="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String spch="!@#$%*&^()";
        String num="1234567890";
        
        System.out.println("Enter the number of character: ");
        int a=sc.nextInt();
        System.out.println("Enter the number of digits: ");
        int b=sc.nextInt();
        System.out.println("Enter the number of special character: ");
        int c=sc.nextInt();

        Random random = new Random();
        ArrayList<Character> pass =  new ArrayList<>();

        while ((a+b+c) >0){ 
            if(a>0){
                pass.add(alpha.charAt(random.nextInt(alpha.length())));
                a--;
            }
            if(b>0){
                pass.add(num.charAt(random.nextInt(num.length())));
                b--;
            }
            if(c>0){
                pass.add(spch.charAt(random.nextInt(spch.length())));
                c--;
            }
            
        }
        Collections.shuffle(pass);

        StringBuilder password= new StringBuilder();

        for(char ch: pass){
            password.append(ch);
        }
        System.out.println(password);

    }
}
