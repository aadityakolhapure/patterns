public class nimappattern {


// 1   2   3   4   
//     2   4   6   
//         3   6   
//             4 



    public static void main(String[] args) {
        int n = 5; 
        
      
        for (int i = 1; i <= n; i++) {
          
            for (int j = 1; j < i; j++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= n-i; j++) {
              
                System.out.print(i * j + "   ");
            }

            System.out.println();
        }
    }
}