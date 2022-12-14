public class Task003_2 {
    public static void main(String[] args) {

        char[] array = { 15, 88, 12, 42, 65, 87, 54, 71, 9, 2, 16 };
        char temp = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if ((int) array[j] > (int) array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (char c : array) {
            average = c + average;
        }
        average = average / array.length;

        System.out.printf("Max: %s\nMin: %s\nAverage: %s\nAverage: %s\n", (int) array[array.length - 1], (int) array[0],
                (int) array[10 / 2], average);
    }
}
