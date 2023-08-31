import java.util.Scanner;

public class printp {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your P's size here : ");
        int user=in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(i==1||i==user/2+1||j==user&&i<=user/2||j==1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}

