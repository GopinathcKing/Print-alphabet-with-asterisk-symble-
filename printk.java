import java.util.Scanner;

public class printk {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your J's size here : ");
        int user = in.nextInt();
        if(user%2==0)
        user++;
        int k=user;
        for(int i=1;i<=user; i++){
            for(int j=1;j<=user;j++){
                if(j==1)
                System.out.print("*");
                if(j==k)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            if(i<user/2+1)
            k-=2;
            else
            k+=2;
            System.out.println();
        }
        in.close();
    }
}
