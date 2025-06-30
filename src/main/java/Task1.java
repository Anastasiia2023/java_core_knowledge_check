public class Task1 {
    public void count(int n){
        printFromOne(1, n);
    }

    private void printFromOne(int start, int finish){
        if(start > finish){
            return;
        }
        System.out.println(start);
        printFromOne(start + 1, finish);
    }


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.count(4);
    }
}
