import java.util.Scanner;

public class printq {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Q's Size here : ");
        int user = in.nextInt();
        int q = user-6;
        for(int i=1;i<=user+3;i++){
            for(int j=1;j<=user;j++){
              if(j==q&&i>user-3||i==1&&j>1&&j<user||j==1&&i>1&&i<user||j==user&&i>1&&i<user||i==user&&j>1&&j<user)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
            if(i>user-3)
            q++;
        }
        in.close();
    }
}
