public class patterns {
    
        /*
         * 
         * *
         * * *
         * * * *
        */
        public static void triangle(int rows, char ch) {
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
        
        public static void Itriangle(int rows, char ch) {
            for (int i = rows; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
        /*
         * * * * 
           * * *
             * *
               *
        */
        public static void IItriangle(int rows, char ch) {
            // TODO: write the logic

            for(int i = rows; i<0 ; i--){
                for (int j = rows; j <i; j--) {
                    System.out.print(" ");
                    for (int k = 1 ; k <= i; k++) {
                        System.out.println(ch+" ");
                    }
                }
                
                System.out.println();
            }
        }
        public static void main(String[] args) {
            IItriangle(5, '*');
        }
    
}
