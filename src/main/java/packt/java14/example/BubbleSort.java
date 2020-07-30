package packt.java14.example;

public class BubbleSort {
    public static void sort(String[] names) {
        var num = names.length;
        while (num > 1) {
            for (var j = 0; j < num - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    var temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
            num--;
        }
    }
}
