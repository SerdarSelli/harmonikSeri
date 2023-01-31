public class Main {
    public static void main(String[] args) {
        int[] list = {3,4,7,6,4,67,88,23,7};

        double sum = 0;


        for (int i=0;i< list.length;i++){

            sum += 1.0/list[i];

        }
        double avg = list.length / sum;
        System.out.println(avg);
    }
}