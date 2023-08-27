//import java.util.Scanner;

public class printa{
    void printnow(int x){
        //Scanner val = new Scanner(System.in);
        //System.out.print("Enter your A's size : ");
        int user=x;//val.nextInt();
        int space = user-1;
        int senspace=0;
        for(int a = 1; a<=user; a++){
            for(int s=1;s<=space;s++){
            System.out.print(" ");
            }
            System.out.print("*");
            for(int ss=1;ss<=senspace;ss++){
                if(a==(user/2)+2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
                System.out.print("*");
                space--;
                senspace+=2;
                System.out.println();    
            }
            //val.close(); 
        }   
       
    }
