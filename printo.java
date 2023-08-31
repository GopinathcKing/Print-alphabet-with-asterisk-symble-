import java.util.Scanner;

public class printo {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your O's Size here : ");
        int user = in.nextInt();
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
              if(i==1&&j>1&&j<user||j==1&&i>1&&i<user||j==user&&i>1&&i<user||i==user&&j>1&&j<user)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}
