import java.util.Scanner;

public class printe {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your E's size : ");
        int user=in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            System.out.print("*");
            if(i==1||i==user||i==user/2+1)
            for(int j=2;j<=user;j++)
                System.out.print("*");
            System.out.println();
        }
        in.close();
    }
}
