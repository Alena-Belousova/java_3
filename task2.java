import java.util.Arrays;
import java.util.Scanner;

public class task2 {
        public static void main(String[] args) {
            System.out.println("введите 20 чисел:");
            Scanner input = new Scanner(System.in);
            int[] array = new int[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();}
            System.out.print("исходный массив будет: ");
            System.out.println(Arrays.toString(array));//для понимания (вроде бы получился массив)
            //разделим массив пополам просто по середине.
            int[] array1 = new int[array.length / 2];//создала массив с длинной в половину от array
            System.arraycopy(array, 0, array1, 0, array.length / 2);
            System.out.print("первый массив из 10 элементов будет: ");
            System.out.println(Arrays.toString(array1));
            int[] array2 = new int[array.length -array1.length];
            System.arraycopy(array, array.length / 2, array2, 0, array.length - array.length / 2);
            System.out.print("второй массив из 10 элементов будет: ");
            System.out.println(Arrays.toString(array2));
            //самое простое, на мой взгляд, решение не мудрить, и отсортировать исходнуй array по возрастанию.
            //потом просто разбить его на два массима arrayMin и arrayMax токже посередине
            Arrays.sort(array);
            int[] arrayMin = new int[array.length / 2];
            System.arraycopy(array, 0, arrayMin, 0, array.length / 2);
            int[] arrayMax = new int[array.length / 2];
            System.arraycopy(array, array.length / 2, arrayMax, 0, array.length - array.length / 2);
            System.out.println("хранилище минимальных значений: ");
//самый простой способ перевести массив в столбик, на мой взгляд, через for
            for (int i = 0; i < arrayMin.length; i++) {
                System.out.println(arrayMin[i]);
            }
            System.out.println("хранилище максимальных значений: ");
            for (int i = 0; i < arrayMax.length; i++) {
                System.out.println(arrayMax[i]);
            }
        }
            }


