import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        LinkedList<String> b = new LinkedList<String>();
        System.out.println("заполнение ArrayList: "+(getTimeMsOfInsert(a)));
        System.out.println("заполнение LinkedList: "+(getTimeMsOfInsert(b)));
        System.out.println("удаление ArrayList: "+getTimeMsOfDelet(a));
        System.out.println("удаление LinkedList: "+(getTimeMsOfDelet(b)));
        System.out.println("замена ArrayList: "+getTimeMsOfSet(a));
        System.out.println("замена LinkedList: "+(getTimeMsOfSet(b)));
        System.out.println("нахождение какого-то элемента ArrayList: "+(getTimeMsOfGet(a)));
        System.out.println("нахождение какого-то элемента LinkedList: "+(getTimeMsOfGet(b)));
    }
    public static long getTimeMsOfInsert(List<String> x) {
        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++)
        {
            x.add("0");
        }
        long t1 = System.currentTimeMillis();
        long itogAdd = t1 - t0;
        return itogAdd;
    }
    public static long getTimeMsOfDelet(List<String> x) {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
        {
            x.remove(i);
        }
        long t1 = System.currentTimeMillis();
        long itogDel = t1 - t0;
        return itogDel;
    }
    public static long getTimeMsOfSet(List<String> x) {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            x.set(i, "x");
        }
        long t1 = System.currentTimeMillis();
        long itogSet = t1 - t0;
        //System.out.println("замена элемента: ");
        return itogSet;
    }
    public static long getTimeMsOfGet(List<String> x) {
        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            x.get(i);
        }
        long t1 = System.currentTimeMillis();
        long itogGet = t1 - t0;
        return itogGet;
    }

    }

