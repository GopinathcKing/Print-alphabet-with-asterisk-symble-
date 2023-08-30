import java.util.Scanner;

public class printn {
    public void printnow(){
         Scanner in = new Scanner(System.in);
        System.out.print("Enter your J's size here : ");
        int user = in.nextInt();
        int n=1;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(j==1||j==user||j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
            n++;
        }   
        in.close();
    }
}
