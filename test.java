import java.util.*;
class test
{
    public static void main(String []args)
    {
        int arr[][] = new int [3][3];
       Scanner sc = new Scanner(System.in);
       for(int i =0;i<3;i++)
       {
        for(int j= 0;j<3;j++)
        {
           arr[i][j] = sc.nextInt();
        }
       }
       for(int i =0;i<3;i++)
       {
        for(int j= 0;j<3;j++)
        {
            System.out.println(arr[i][j]);
        }
      }
    }
}

