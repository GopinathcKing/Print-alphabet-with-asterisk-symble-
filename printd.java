import java.util.Scanner;

public class printd {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your D's Size here : ");
        int user = in.nextInt();
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(i==1&&j==user||i==user&&j==user||i==2&&j==user||i==user-1&&j==user||i==1&&j==user-1||i==user&&j==user-1)
                continue;
                if(i==1&&j==user-3||i==user&&j==user-3)
                break;
                 if(i==2&&j==user-1||i==user-1&&j==user-1)
                System.out.print("*");
                else if(i==1||i==user||j==1||j==user)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}
