import java.util.Scanner;

public class printc {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your C's Size here : ");
        int user = in.nextInt();
        for(int i=1;i<=user+2;i++){
            if(i>=2&&i<user+2)
            System.out.print("*");
            else
            System.out.print(" ");
            if(i==1 || i==user+2)
            for(int a=1;a<=user;a++){
               System.out.print("*");
            }
                        System.out.println();

        }
        in.close();
    }
}
