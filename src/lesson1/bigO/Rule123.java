package lesson1.bigO;

public class Rule123 {

    public static int findMax(int[] array) {

        int max = array[0]; //O(1) ,сколько раз инициализируется переменная, один раз

        System.out.println("Начинаем поиск"); //O(1) ,сколько раз будет вывод на экран, один раз

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        } //O(1 + 4 * (n - 1)) ,сколько раз выполнится цикл, зависит от входных данных, если на вход поступает 10 то 9 раз выполнится цикл

        System.out.println("Поиск окончен. Максимальное число: " + max); //O(1) ,сколько раз будет вывод на экран, один раз

        return max; //O(1) ,сколько раз будет возврат переменной, один раз
    }
}

// O(1) + O(1) + O(1) + O(1) + O(4n - 3)
// O(4n - 3)
// O(4n)
// O(n)
