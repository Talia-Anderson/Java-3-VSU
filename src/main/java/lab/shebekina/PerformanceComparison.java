package lab.shebekina;
import java.util.ArrayList;
import java.util.LinkedList;


public class PerformanceComparison
{
    public static void runTests(int numOperations)
    {
        System.out.println("Method\t\t\t\t\tTimes Executed\t\tExecution Time (ms)");
        System.out.println("-------------------------------------------------------------");

        testAdd(numOperations);
        testDelete(numOperations);
        testGet(numOperations);
    }

    /**
     * метод, который принимает целочисленный аргумент numOperations.
     * Внутри метода определены переменные startTime, endTime и executionTime типа long,
     * которые используются для замера времени выполнения операций.
     * Далее создаются два списка: ArrayList и LinkedList,
     * которые будут использоваться для добавления элементов.
     * Затем запускается цикл, который добавляет numOperations элементов в каждый из списков.
     * Для ArrayList используется метод add, а для LinkedList - тоже метод add.
     * После того как операции добавления завершены, замеряется время выполнения каждой
     * из операций с помощью методов System.nanoTime() и вычисляется разница между startTime и endTime.
     * Результат сохраняется в переменной executionTime.
     * В конце метода выводится информация о времени выполнения каждой операции в миллисекундах
     * @param numOperations - целочисленный аргумент кол-ва эл-тов
     */
    public static void testAdd(int numOperations)
    {
        long startTime, endTime, executionTime;

        ArrayList<Integer> arrayList = new ArrayList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("ArrayList.add()\t\t\t" + numOperations + "\t\t\t\t" + executionTime);

        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("LinkedList.add()\t\t" + numOperations + "\t\t\t\t" + executionTime);
    }

    /**
     * метод принимает целочисленный аргумент
     * Внутри метода определены переменные startTime, endTime и executionTime типа long,
     * используются для замера времени выполнения операций.
     * создаются два списка: ArrayList и LinkedList,
     * которые будут использоваться для удаления элементов.
     * Затем запускается цикл, который добавляет numOperations элементов в каждый из списков.
     * Для ArrayList используется метод add, а для LinkedList - тоже метод add.
     * После того как операции добавления завершены, запускается цикл,
     * который удаляет элементы из каждого списка.
     * Для ArrayList используется метод remove, а для LinkedList - тоже метод remove.
     * Затем замеряется время выполнения каждой из операций
     * с помощью методов System.nanoTime() и вычисляется разница
     * между startTime и endTime. Результат сохраняется в переменной executionTime.
     * В конце метода выводится информация о времени выполнения каждой операции в миллисекундах
     * @param numOperations - целочисленный аргумент кол-ва эл-тов
     */
    public static void testDelete(int numOperations)
    {
        long startTime, endTime, executionTime;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numOperations; i++) {
            arrayList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = numOperations - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("ArrayList.delete()\t\t" + numOperations + "\t\t\t\t" + executionTime);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numOperations; i++) {
            linkedList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = numOperations - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("LinkedList.delete()\t\t" + numOperations + "\t\t\t\t" + executionTime);
    }

    /**
     * метод  принимает целочисленный аргумент
     * Внутри метода определены переменные startTime, endTime и executionTime типа long,
     * которые используются для замера времени выполнения операций.
     *
     * Далее создаются два списка: ArrayList и LinkedList,
     * которые будут использоваться для получения элементов.
     * Затем запускается цикл, который добавляет numOperations элементов в каждый из списков.
     * Для ArrayList используется метод add, а для LinkedList - тоже метод add.
     *
     * После того как операции добавления завершены,
     * запускается цикл, который получает элементы из каждого списка.
     * Для ArrayList используется метод get, а для LinkedList - тоже метод get.
     *
     * Затем замеряется время выполнения каждой из операций с
     * помощью методов System.nanoTime() и вычисляется разница между startTime и endTime
     * Результат сохраняется в переменной executionTime
     *
     * В конце метода выводится информация о времени выполнения каждой операции в миллисекундах
     * @param numOperations - целочисленный аргумент кол-ва эл-тов
     */
    public static void testGet(int numOperations)
    {
        long startTime, endTime, executionTime;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numOperations; i++) {
            arrayList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("ArrayList.get()\t\t\t" + numOperations + "\t\t\t\t" + executionTime);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numOperations; i++) {
            linkedList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime) / 1_000_000;
        System.out.println("LinkedList.get()\t\t" + numOperations + "\t\t\t\t" + executionTime);
    }
}
