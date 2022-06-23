package practice;
import java.util.*;
public class prac12 {
        static String str;String rev;int count;static String str1;
        prac12()
        {

                str = new String();
                rev = new String();
                str1 = new String();
                count = 0;
        }
        void readsent()
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the sentence");
                str = sc.nextLine();
               str1 = str.toLowerCase();
        }
                
        int freq(String w)
        {
                int l = w.length();
                for(int i=0;i<l;i++)
                {
                        
                        if(w.charAt(i)!=' ')
                        {
                          rev = rev+w.charAt(i);
                        }
                }
                int rr = rev.length();
                for(int j=0;j<rr;j++)
                {
                   char c = rev.charAt(j);
                   switch (c) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                        count++;
                                
                                break;
                        default:
                                break;
                   }
                }
                return count;
                
        }
        void arrange()
        {
                System.out.println("original song:");
                System.out.println(str);
                System.out.println(count);
        }
        public static void main(String []args)
        {
                prac12 ob = new prac12();
                ob.readsent();
                ob.freq(str1);
                ob.arrange();
                
                

        }
}