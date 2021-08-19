import java.util.Random;

/**
 * 4. На плоскости заданы своими координатами
 * n точек. Написать метод(методы), определяющие,
 * между какими из пар точек самое большое
 * расстояние. Указание. Координаты точек занести
 * в массив.
 */

public class Decomposition4 {

    private static double distance(Coordinates a, Coordinates b) {
        int length = Math.abs(a.x - b.x);
        int width = Math.abs(a.y - b.y);
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    private static void maxDistance(Coordinates[] array) {
        int max1 = 0;
        int max2 = 1;
        for (int i = 0; i < array.length; i++)
            for (int j = 1; j < array.length; j++)
                if (distance(array[i], array[j]) > distance(array[max1], array[max2])) {
                    max1 = i;
                    max2 = j;
                }
        System.out.println("\n" + max1 + " " + max2 + " : " + array[max1].x + " " + array[max1].y + " " + array[max2].x + " " + array[max2].y + " ");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20) + 4;
        Coordinates[] array = new Coordinates[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Coordinates();
            array[i].setX(rand.nextInt(100));
            array[i].setY(rand.nextInt(100));
        }
        for (int i = 0; i < n; i++)
            System.out.println(i + " " + array[i].x + " " + array[i].y);
        maxDistance(array);

    }
}
