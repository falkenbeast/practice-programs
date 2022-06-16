public class prac6 {
        public static void main(String [] args)
        {
                char arr[] = new char[] {'1','2','3','4','5'};
                
                String st = String.copyValueOf(arr, 1 , 4);                 // count = till where to copy by number
                System.out.println(st);

        }
        
}
