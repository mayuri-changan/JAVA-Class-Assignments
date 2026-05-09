class PrimeTable { 
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)      
                return false;
        }
        return true;
    }

    public static void main(String args[]) {

        
        if (args.length != 3) {
            System.out.println("Please enter  3 numbers");
            return;
        }

        for (int i = 0; i < args.length; i++) {

            int num = Integer.parseInt(args[i]);

            if (isPrime(num)) {
                System.out.println("\n" + num + " is Prime. Table:");
                for (int j = 1; j <= 10; j++)
 {
                    System.out.println(num + " x " + j + " = " + (num * j));
                }
            } 
               else 
{
                System.out.println("\n" + num + " is Not Prime.");
                System.out.println("After dividing by 10: " + (num / 10));
            }
        }
    }
}
