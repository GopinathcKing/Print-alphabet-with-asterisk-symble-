import java.util.Scanner;

public class printj {
    public void printnow(){ 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your J's size here : ");
        int user = in.nextInt();
        if(user%2==0)
        user++;
        int temuser = user/2+1;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(i==1||j==temuser||i==user-1&&j==1)
                System.out.print("*");
                else if(i==user){
                    if(j<=temuser)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}


