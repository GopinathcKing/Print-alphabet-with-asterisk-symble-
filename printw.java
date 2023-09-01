import java.util.Scanner;

public class printw {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your W's size here : ");
        int user = in.nextInt();
        int vp = 1,vm = user;
        int vp1 = user,vm1 = user*2;
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user*2;j++){
                if(i%2==0){
                if(j==vp || j==vm)
                System.out.print("*");
                else 
                System.out.print(" ");
                if(j==vp1 || j==vm1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            }if(i%2==0){
            vp++;
            vm--;
            vp1++;
            vm1--;
            }
            System.out.println();
        }
        in.close();
    }
}