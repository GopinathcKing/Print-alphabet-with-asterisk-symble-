import java.util.Scanner;

public class printv {
    public void printnow(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your V's size here : ");
        int user = in.nextInt();
        int vp = 1,vm = user;
        if(user%2==0)
        user++;
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user;j++){
                if(i%2==0){
                if(j==vp || j==vm)
                System.out.print("*");
                else 
                System.out.print(" ");}
            }if(i%2==0){
            vp++;
            vm--;
            }
            System.out.println();
        }
        in.close();
    }
}