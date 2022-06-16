class prac2
{
        public static void main(String []args)
        {
                String n = "nishaant gupta";
                System.out.println("oringianl text:" + n);
                int a = n.codePointAt(6);
                int b = n.codePointAt(3);
                System.out.println(a + " , " + b);
                String v = "t";
                int q = v.codePointAt(0);
                System.out.println(q);
                char vv = 'A';
                int qq = (int)vv;
                System.out.println(qq);
        }
}