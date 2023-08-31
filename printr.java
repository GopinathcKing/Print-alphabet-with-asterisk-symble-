import java.util.Scanner;

public class printr {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your R's size here : ");
        int user=in.nextInt();
        int r = 1;
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(j==r||i==1||i==user/2+1||j==user&&i<=user/2||j==1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            if(i>=user/2+1)
            r+=2;
            System.out.println();
        }
        in.close();
    }
}

