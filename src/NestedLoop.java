public class NestedLoop {
    public static void main(String[] args) {
        // nested loop with i and j
        // each time the out loop is executed the inner loop is executed again until it is false
        for (int i = 1; i < 3; i++){
            for (int j = 0; j < 10; j++){
                System.out.println(i + " " + j);
            }
            //System.out.println();
        }
    }
}
