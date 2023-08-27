import java.util.Scanner;

public class printb{
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you B's Size here : ");
        int user = in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            System.out.print("*");
            for(int a=1;a<=user/2;a++){
                if(i==1 || i==user/2+1 || i==user)
                System.out.print("*");
                else
                System.out.print(" ");
            }
             if(i==1 || i==user/2+1 || i==user)
             System.out.print("");
             else
             System.out.print(" *");
            System.out.println();
        }
    in.close();
    }
}