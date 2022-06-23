package practice;
class prac9 
{
        static void rec(String a)
        {
             int b = a.length();
             if (a == null || b<=1)
             {
                 return;}
                 System.out.print(a.charAt(b-1));
                 rec(a.substring(0,b-1));
             }

        public static void main(String []args)
        {
                System.out.println("geek for geeks school");
                rec("geek for geeks school");
                System.out.println();
                String aa = "school is city montessori school";
                String ab = "";
                for(int i=aa.length()-1;i>0;i--)
                {
                   ab = ab+aa.charAt(i);
                }
                System.out.println("original string:");
                System.out.println("school is city montessori school");
                System.out.println(ab);
        }
}

 