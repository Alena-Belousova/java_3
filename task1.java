import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] myArray = {1, 8, 10, 12, 5};
        int[] abc = sortArray(myArray);
        System.out.println(Arrays.toString(abc));
    }
    //1 2--{1 2}
    //{1 3} {2}---{1 2 3}
    //{1 3 5} {2 4)----{1 2 3 4 5 )
    public static int[] sortArray(int[] myArray) {
        if (myArray.length==1)
        {
            return myArray;
        }
        int[] array1 = new int[myArray.length / 2];//создаем массив с длинной в половину от длинны myArray
        System.arraycopy(myArray, 0, array1, 0, myArray.length / 2);//загоняем в array1 значения с индексами от 0 до середины
        int[] array2 = new int[myArray.length - myArray.length / 2];//делаем еще один массив, который равен длинне myArray минус длинна array1
        System.arraycopy(myArray, myArray.length / 2, array2, 0, myArray.length - myArray.length / 2);//загоняем в array1 значения с индексами от середины до максимального индекса
        array1 = sortArray(array1);//1
        array2 = sortArray(array2);//2
       return  mergeArray(array1, array2);
    }
    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1,0,array3,0,array1.length);
        System.arraycopy(array2,0,array3, array1.length,array2.length);
        Arrays.sort(array3);//отсортировать массив 3 по возрастанию
        return array3;
    }

}