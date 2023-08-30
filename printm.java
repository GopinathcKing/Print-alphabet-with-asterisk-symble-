import java.util.Scanner;

public class printm {
    public void printnow(){
         Scanner in = new Scanner(System.in);
        System.out.print("Enter your J's size here : ");
        int user = in.nextInt();
        int mp=1,mm=user;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(j==1||j==user||j==mp&&i<=user/2||j==mm&&i<=user/2)
                System.out.print("*");        
                else
                System.out.print(" ");
            }
            System.out.println();
            mp++;
            mm--;
        }
        in.close();
    }
}
