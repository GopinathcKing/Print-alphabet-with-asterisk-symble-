import java.util.Scanner;

public class printg {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your G's Size here : ");
        int user = in.nextInt();
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user/**2*/;j++){
              if(j==1||i==1||i==user||i==user/2&&j>user/2)  
                System.out.print("*");
                else if(j==user/*||j==user*2*/){
                    if(i>user/2)
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
