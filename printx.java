import java.util.Scanner;

public class printx {
    public void printnow(){
      Scanner in = new Scanner(System.in);
        System.out.print("Enter your X's size here : ");
        int user = in.nextInt();
        int xp =1 , xm = user;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(j==xp||j==xm)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            xp++;
            xm--;
            System.out.println();
        }
        in.close();
    }
}
