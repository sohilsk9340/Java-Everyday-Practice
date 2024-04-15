public class patters1 {
    public static void main(String[] args) {
        int rows = 5;
        char ch = '*';
        for(int i = rows; i>=1 ; i--){
            for (int j = rows; j >i; j--) {
                System.out.print(" ");
                for (int k = 1 ; k <= i; k++) {
                    System.out.println(ch);
                }
    
            }
            System.out.println();
        }
    }
}
   

    
