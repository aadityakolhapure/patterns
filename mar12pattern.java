public class mar12pattern {
    public static void main(String[] args) {
        int n = 8;
        int startval = 10;

        for (int i = 1; i <= n - 1; i++) {
            int currentval = startval;

            if (isOdd(i) == false) {
                for (int j = 1; j <= i; j++) {
                    if (i == 1) {
                        System.out.print("* ");
                    }
                    System.out.print(currentval + " ");
                    currentval = currentval + 5;
                }
            }
            if (isOdd(i) == true ) {
                for (int j = 1; j <= i; j++) {
                   if(j == 1 && i != 1) {
                       System.out.print(currentval+"  ");
                   }else{
                    System.out.print("*  ");
                   }
                    
                }
            }
            System.out.println();
            startval = startval + 10;
        }
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        }
        return false;
    }
}
