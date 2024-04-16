public class exceptions {
    public static void main(String[] args) {
        // int a = 10;
        // int d = a/0;

        String [] str = {"","","",""};
        try {
            //  System.out.println(d);
            System.out.println(str[4]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
