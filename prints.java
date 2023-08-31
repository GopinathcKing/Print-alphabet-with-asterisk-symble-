import java.util.Scanner;

public class prints {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your E's size : ");
        int user=in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            if(i<=user/2+1||i==user)
            System.out.print("*");
            else 
            System.out.print(" ");
            for(int j=2;j<=user;j++){
                if(i==1||i==user||i==user/2+1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
                if(i>=user/2+1)
                System.out.print("*");
            System.out.println();
        }
        in.close();
    }
}

