### Алгоритмы и структуры данных

### 1. Общие сведения об алгоритмах и структурах данных
>Алгоритмические задачи их решение позволяют немного по другому смотреть на то с чем работаем и глубже погружаться в инструменты с которыми мы ежедневно работаем.

С алгоритмами мы постоянно сталкиваемся в виде методов

**n** - это входные данные, чем больше n тем больше действий

Что-бы высчитывать сложность алгоритмов,
мы будем брать функцию и подвязывать к понятию асимптотическая сложность.

**О большая big-O**:
асимптотическая сложность читается как:

O(n) - о большая от n

O(log n) - о большая от log n

**Асимптотическая сложность** выражающая то самое отношение между количеством действий
с ростом числа входных данных,
поможет нам понять какова сложность алгоритма, насколько один код хуже второго.

>Сложность алгоритма влияет на время выполнения и расход памяти.

>Сложность алгоритма вычисляется из соотношения действий и соотношения
количества входных данных с течением времени.

#### Виды сложностей из графика: (рис. 1Все сложности на графике)

O(log n) — логарифмическая сложность

O(1) - алгоритм выполняется за постоянное/константное время

O(n) — линейная сложность

O(n log n) - квазилинейная сложность

O(n^2) - полиномиальная сложность

O(2^n) - экспонинцеальная сложность

O(n!) - фактоиальная сложность

#### Где могут появиться эти сложности:

Алгоритмы сортировки:
O(log n) — логарифмическая сложность
O(n) — линейная сложность

Тоже в алгоритмах сортировки, и в собственных алгоритмах реализованых мною:
O(n^2) - полиномиальная сложность
O(n log n) - квазилинейная сложность

В деревьях:
O(2^n) - экспонинцеальная сложность

Полный перебор: (узкоспециализированные задачи)
O(n!) - фактоиальная сложность


#### Подсчет O большого:

1. первый пример:

тайминг видео, Урок 1. Общие сведения об алгоритмах и структурах данных - 1:01 мин

в примере кода lesson1 -> Rule123.java

```markdown
// O(1) + O(1) + O(1) + O(1) + O(4n - 3)

// O(4n - 3)

// O(4n)

// O(n)
```

>подсчет происходит по принципу сколько раз,
>
>n это будет количество раз, каждого действия,
>
>будь это инициализация переменной, проход цикла, вывод на экран, сравнение, присваивание
>
>сокращаем: отбрасываем константы(числа), проход по элементам массива всреднем n раз получается,
> получается линейная сложность
>
>при определении сложности смотрим что из себя представляет данный цикл, смотрим на побочные условия внитри тела цикла которые напрямую могут повлиять на количество исполнений
>
>например for (int i = 1; i < n; i*=2) //O(logn) , увеличение скорости в данном случае происходит в геометрической прогрессии по условию i *= 2
>
>при выборе из нескольких равнозначно стоящих относительно друг друга сложностей, выбираем самую сложную

> Все сводится к одному: как много итераций будет при определенном количестве действий, и как быстро это количество
> действий будет возрастать с ростом нашего количества данных.

2. второй пример:

тайминг видео, Урок 1. Общие сведения об алгоритмах и структурах данных - 1:14 мин
в примере кода lesson1 -> Rule4.java
два цикла O(n), один вложен в другой поэтому O(n^2) полиномиальная сложность
```markdown
//O(n)*O(n)=O(n^2)
```

3. третий пример:

тайминг видео, Урок 1. Общие сведения об алгоритмах и структурах данных - 1:15:30 мин

```markdown
лучший
худший
средний случаи
```

4. четвертый пример:
   тайминг видео, Урок 1. Общие сведения об алгоритмах и структурах данных - 1:23:00 мин
```markdown
Логарифмическая сложность
```

>По таблице временной сложности сортировок(рис. 4Сложности сортировок), ориентируемся на средний случай.

---

### 2. Массивы и сортировка

Разбор ДЗ предыдущего 00:02
тайминг видео, Урок 2. Массивы и сортировка - 00:02 мин

Разбор простых сортировки которые сочинялись в 60-70 года

Виды сортировок: (рис. 4Сложности сортировок) 

**Сортировки можно разделить на две группы сложностей:**

| 1 группа                             |             2 группа              | 
|--------------------------------------|:---------------------------------:|
| O(n log n) - квазилинейная сложность | O(n^2) - полиномиальная сложность |

#### Какие сортировки надо знать:

понимать их работу лучше чем их заучивать, по какому алгоритму они идут

>Пузырьковая сортировка
>
>Сортировка вставками
>
>Сортировка выбором

**Пузырьковая сортировка**
![Bubble sort.gif](src%2Flesson2%2Fgif%2FBubble%20sort.gif)
тайминг 34:20

не очень быстрая сортировка

Финальная сложность алгоритма пузырьком: O(n) * O(n) => O(n^2)

```java
public void sortBubble(){
        int out, in;
        for (out = this.size - 1; out >= 1; out--) {        // O(n)
            for(in = 0; in < out; in++) {                   // O(n)
                if (this.arr[in] > this.arr[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
}

private void change(int a, int b){
    int tmp = this.arr[a];
    this.arr[a] = this.arr[b];
    this.arr[b] = tmp;
}
```

**Коктельная сортировка**

[сортировки на анимации](https://algostructure.com/sorting/selectionsort.php)

![Cocktail Sort.gif](src%2Flesson2%2Fgif%2FCocktail%20Sort.gif)

тайминг 01:06

сложность O(n^2)

**Сортировка расческой**

очень эффективная сортировка

![Comb Sort.gif](src%2Flesson2%2Fgif%2FComb%20Sort.gif)

тайминг 01:09

сложность O(n^2)

**Сортировка выбором**
![Selection sort.gif](src%2Flesson2%2Fgif%2FSelection%20sort.gif)
тайминг 01:14

сложность O(n^2)

в четыре раза быстрее чем пузырьковая

**Сортировка вставками**
![Insertion sort.gif](src%2Flesson2%2Fgif%2FInsertion%20sort.gif)
тайминг 01:27

сложность O(n^2)

**Поразрядная сортировка**

[анимация и код на java](https://algostructure.com/sorting/radixsort.php)

самая лучшая сортировка для чисел

![Radix sort.gif](src%2Flesson2%2Fgif%2FRadix%20sort.gif)
тайминг 01:49

сложность O(nk)

```java
// for arrays with integers from 0 to 99
public void radixSort(int[] array) {
     int counter = 0;
     LinkedList<LinkedList<Integer>> allBuckets = new LinkedList<LinkedList<Integer>>();

     for (int i = 0; i < 10; i++) {
          allBuckets.addLast( new LinkedList<Integer>() );
     }

     for (int i = 0; i < array.length; i++) {
          int j = array[ i ] % 10;
          allBuckets.get( j ).addLast( array[ i ] );
     }

     for (int i = 0; i < 10; i++){
          while ( !allBuckets.get( i ).isEmpty() ) {
               array[ counter ] = allBuckets.get( i ).pollFirst();
               counter++;
          }
     }

     for (int i = 0; i < array.length; i++) {
          int j = ( (int ) ( array[ i ] / 10 ) ) % 10;
          allBuckets.get( j ).addLast( array[ i ] );
     }

     counter = 0;

     for (int i = 0; i < 10; i++) {
          for (int j = 0; j < allBuckets.get( i ).size(); j++) {
               array[ counter ] = allBuckets.get( i ).get( j );
               counter++;
          }
     }
}
```

**Сортировка подсчетом**

очень эффективная сортировка

![Counting sort.gif](src%2Flesson2%2Fgif%2FCounting%20sort.gif)
тайминг 01:56

сложность O(nk)

---

### Поиск

**Линейный поиск** - поиск проходом по каждому элементу, плохой поиск, сложность O(n)

**Бинарный поиск** - в основе принцип разделяй и властвуй, хороший поиск для сортированных данных, сложность O(logn)

Опасен тем что выполняется большое количество раз

Нужно уметь реализовывать

Имеет две реализации:

1. Через рекурсию
2. in place (тайминг 20:00 Урок 3. Стек и очередь)

тайминги 07:00

**Экспоненциальный поиск** - повторяет принцип бинарного поиска, но за большее количество шагов,
используется для отдельных отрезков данных, сложность O(logn)

тайминг 28:00

Реализация: (тайминг 34:54 Урок 3. Стек и очередь)

**Интерполяционный поиск** - быстрее чем экспоненциальный

тайминг 47:27

Реализация: (тайминг 52:14 Урок 3. Стек и очередь)

Самый быстрый поиск

Сложность O(log(logn))

Используется для индексов и поиска по строкам в базе данных, по big integer значениям

---

### 3. Стек и очередь

тайминг 1:15 Урок 3. Стек и очередь

**Стек (stack)** - стек структура данных, (не путать со структурой памяти) работает по принципу «последний пришел — первый вышел» (LIFO, Last In — First
Out)

Одно из объяснений работы стека, которое встречается во многих источниках — это стопка
тарелок. Представьте, что мы кладем на стол красную тарелку, на нее синюю, а на синюю —
зеленую. Чтобы достать красную тарелку, сначала из стопки вытаскиваем зеленую, потом
синюю.

Сложность O(1)

реализация тайминг 1:32 Урок 3. Стек и очередь

**Очереди (queue)** - для описания очереди используют аббревиатуру FIFO (First In — First Out) — «первый вошел —
первый вышел». Очереди могут использоваться при моделировании, например, банковских систем.
Очередь работает по аналогии с обычной очередью например в магазине.

сложность очередей: вставка — O(1), удаление — O(1).

реализация тайминг 1:43 Урок 3. Стек и очередь

**Двусторонняя очередь - Дек (deque)** - массив с реализацией очереди плюс реализацией стека

