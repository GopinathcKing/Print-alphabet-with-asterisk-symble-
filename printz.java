import java.util.Scanner;

public class printz {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Z's size here : ");
        int user = in.nextInt();
        int z=user;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(i==1||i==user||j==z)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            z--;
            System.out.println();
        }
        in.close();
    }
}
