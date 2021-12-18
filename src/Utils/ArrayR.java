package Utils;

public class ArrayR {


    public static int[] zufallsArray(int size) {
        int[] a = new int[size];
        int[] temp = new int[size];
        for (int i = 0; temp.length > i; i++) {
            temp[i] = i + 1;

        }

        for (int i = 0; i < a.length; i++) {
            int rand = 50;
            while (temp[rand] == -1) {
                rand = (int) (Math.random() * temp.length);
            }
            int tempg = temp[rand];
            temp[rand] = -1;
            a[i] = tempg;
        }
        return a;
    }




}
