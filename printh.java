import java.util.Scanner;

public class printh {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your H's size here : ");
        int user = in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(j==1||j==user||i==user/2+1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}
