import java.util.Scanner;

public class printf {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your F's size here : ");
        int user=in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            System.out.print("*");
            if(i==1||i==user/2+1)
            for(int j=2;j<=user;j++){
                if(i==user/2+1&&j==user-user/4)
                break;
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}

