class prac14
{
    int start;
    int end ;
    int flag;
    int f;
    
        prac14(int a, int b)
        {
            start = a;
            end = b;
        }
        int isprimee(int n)
        {
            flag =1;
            if(n<=1)
            flag = 0;
            else{
                for(int i =2;i<n;i++)
                {
                    if(n%i==0)
                    {
                        flag=0;
                    }
                }
            }
            return flag;
        }
        int ispalinn(int n)
        {
            f=1;
            int d,r=0;
            for(int i=n;i>0;i=i/10)
            {
                d = i%10;
                r = r*10+d;
            }
            if(r==n)
            f =0;
            return f;
        }   
        void generate()
        {
            for(int i =start ; i<=end;i++)
            {
                if(isprimee(i)==1)
                  if(ispalinn(i)==0)
                   System.out.print(i + " ");

            }
        } 
        public static void main(String []args)
        {
           prac14 ob = new prac14 (10, 1000);
            ob.generate();;     
        }
}