import java.util.Scanner;

public class printi {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your I's size here : ");
        int user = in.nextInt();
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(i==1||i==user||j==user/2+1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}

