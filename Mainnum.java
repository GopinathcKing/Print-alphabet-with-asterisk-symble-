import java.util.Scanner;

public class Mainnum {
    public static void main(String[] args){
       try{ Scanner in = new Scanner(System.in);
        printa a = new printa();
        printb b = new printb();
        printc c = new printc();
        printd d = new printd();
        printe e = new printe();
        printf f = new printf();
        printg g = new printg();
        printh h = new printh();
        printi i = new printi();
        printj j = new printj();
        printk k = new printk();
        printl l = new printl();
        printm m = new printm();
        printn n = new printn();
        printo o = new printo();
        printp p = new printp();
        printq q = new printq();
        printr r = new printr();
        prints s = new prints();
        printt t = new printt();
        printu u = new printu();
        printv v = new printv();
        printw w = new printw();
        printx x = new printx();
        printy y = new printy();
        printz z = new printz();
        int ch;
        do{
        System.out.print("27 or more than 27 for Exit...\nEnter a number(1-26) : ");
       // String he = new String();
         ch = in.nextInt();
        //ch = hi.charAt(0);
        //in.close();
        switch(ch){
            case 1:
            System.out.print("Enter your A's size here : ");
            int num = in.nextInt();
            a.printnow(num);
            break;
            case 2:
            b.printnow();
            break;
            case 3:
            c.printnow();
            break;
            case 4:
            d.printnow();
            break;
            case 5:
            e.printnow();
            break;
            case 6:
            f.printnow();
            break;
            case 7:
            g.printnow();
            //System.out.print("I didn't write code yet..!");
            break;
            case 8:
            h.printnow();
            break;
            case 9:
            i.printnow();
            break;
            case 10:
            j.printnow();
            break;
            case 11:
            k.printnow();
            break;
            case 12:
            l.printnow();
            break;
            case 13:
            m.printnow();
            break;
            case 14:
            n.printnow();
            break;
            case 15:
            o.printnow();
            break;
            case 16:
            p.printnow();
            break;
            case 17:
            q.printnow();
            break;
            case 18:
            r.printnow();
            break;
            case 19:
            s.printnow();
            break;
            case 20:
            t.printnow();
            break;
            case 21:
            u.printnow();
            break;
            case 22:
            v.printnow();
            break;
            case 23:
            w.printnow();
            break;
            case 24:
            x.printnow();
            break;
            case 25:
            y.printnow();
            break;
            case 26:
            z.printnow();
            break;
        }
    }while(ch<=26);
    in.close();
        }catch(Exception e){
    System.out.println("Just a error.. try again...");
        }
    }
}
