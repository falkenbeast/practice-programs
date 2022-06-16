import java.util.*;
public class prac15 {
        int m;
        int arr[][] = new int [m][m];
        prac15(int mm)
        {
                m = mm;
        }
        void readarray()
        {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the array");
          for(int i=0;i<m;i++)
          {
                for(int j=0;j<m;j++)
                {
                        arr[i][j] = sc.nextInt();
                }
          }
        }
        void larg()
        {
                int l[] = new int [m];
                for(int i=0;i<m;i++)
                {
                        for(int j=0;j<m;j++)
                        {
                                if(arr[i][j]>arr[i+1][j])
                                {
                                        int t = arr[i][j];
                                        arr[i][j]=arr[i+1][j];
                                        arr[i+1][j] = t;
                                        l[i] = t;
                                }
                        }
                        
                }
                for(int i=0;i<m;i++)
                {
                               System.out.println(l[i]);
                }
                
        }
        void display()
        {
                for(int i=0;i<m;i++)
                {
                        for(int j=0;j<m;j++)
                        {
                                System.out.println(arr[i][j]);
                        }
                }
                
        }
        public static void main(String []args)
        {
                prac15 ob = new prac15(3);
                ob.readarray();
                ob.display();
                ob.larg();
        }
}
