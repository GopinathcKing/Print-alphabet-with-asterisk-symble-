import java.util.Scanner;

public class Main {
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
        char ch;
        do{
        System.out.print("-Capital \"E\" for Exit...\nEnter a alphabet(a-z) : ");
       // String he = new String();
        String hi = in.nextLine();
        ch = hi.charAt(0);
        //in.close();
        switch(ch){
            case 'a':
            System.out.print("Enter your A's size here : ");
            int num = in.nextInt();
            a.printnow(num);
            break;
            case 'b':
            b.printnow();
            break;
            case 'c':
            c.printnow();
            break;
            case 'd':
            d.printnow();
            break;
            case 'e':
            e.printnow();
            break;
            case 'f':
            f.printnow();
            break;
            case 'g':
            g.printnow();
            //System.out.print("I didn't write code yet..!");
            break;
            case 'h':
            h.printnow();
            break;
            case 'i':
            i.printnow();
            break;
            case 'j':
            j.printnow();
            break;
            case 'k':
            k.printnow();
            break;
            case 'l':
            l.printnow();
            break;
            case 'm':
            m.printnow();
            break;
            case 'n':
            n.printnow();
            break;
            case 'o':
            o.printnow();
            break;
            case 'p':
            p.printnow();
            break;
            case 'q':
            q.printnow();
            break;
            case 'r':
            r.printnow();
            break;
            case 's':
            s.printnow();
            break;
            case 't':
            t.printnow();
            break;
            case 'u':
            u.printnow();
            break;
            case 'v':
            v.printnow();
            break;
            case 'w':
            w.printnow();
            break;
            case 'x':
            x.printnow();
            break;
            case 'y':
            y.printnow();
            break;
            case 'z':
            z.printnow();
            break;
        }
    }while(ch!='E');
    in.close();
        }catch(Exception e){
    System.out.println("Just a error.. try again...");
        }
    }
}
