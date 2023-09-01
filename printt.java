import java.util.Scanner;

public class printt {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your T's size here : ");
        int user = in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user/2;i++){
            for(int j=1;j<=user;j++){
                if(i==1||j==user/2+1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}
