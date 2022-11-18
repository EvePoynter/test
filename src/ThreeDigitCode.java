public class ThreeDigitCode {
    public static void main(String[] args) {
        // nested loop with i, j and k
        //each time the out loop is executed the inner loop is executed again until it is false
        int total = 0;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                for(int k = 1; k <= 4; k++)
                    if (!(i == k || j == k || i == j)){
                    System.out.println(i + " " + j + " " + k);
                };
                System.out.println("there were" + total + "unique combinations");
}}}}
