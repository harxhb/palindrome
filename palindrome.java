public class palindrome {
    public static void main(String[] args) {
       
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int n4 = Integer.parseInt(args[3]);
        int n5 = Integer.parseInt(args[4]);
        int n6 = Integer.parseInt(args[5]);

        boolean result = (n1 == n6) && (n2 == n5) && (n3 == n4);
        System.out.println(result);
    }
}
