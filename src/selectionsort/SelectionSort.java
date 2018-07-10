package selectionsort;

public class SelectionSort {
    static double list [] = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double mang[]) {
        for (int i = 0; i < mang.length - 1; i++) {
            double currentMin = mang[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < mang.length; j++) {
                if (currentMin > mang[j]) {
                    currentMin = mang[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                mang[currentMinIndex] = mang[i];
                mang[i]=currentMin;

            }

        }
    }

    public static void print(double list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }


    public static void main(String[] args) {
        selectionSort(list);
        print(list);

    }
}
