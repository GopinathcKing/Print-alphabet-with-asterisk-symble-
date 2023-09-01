import java.util.Scanner;

public class printu {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your U's size here : ");
        int user = in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(j==1||j==user||i==user)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}