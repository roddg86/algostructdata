**По вопросам проверки и переноса обращаться к Игорю tg: @inchestnov**
### 1. Прочитать в книге "Грокаем алгоритмы" или в предложенных материалах про алгоритмы и О-большое.
### 2. Определить сложность следующих алгоритмов:
-. Поиск элемента массива с известным индексом: O(1)

-. Дублирование одномерного массива через foreach: O(n)

-. Удаление элемента массива с известным индексом без сдвига: O(1)

-. Удаление элемента массива с неизвестным индексом без сдвига: O(n) или O(logn) или O(1)

-. Удаление элемента массива с неизвестным индексом со сдвига: O(n)

### 3. Определить сложность следующих алгоритмов. Сколько произойдет итераций?
a)

```
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {         // O(n)
            for (int j = 1; j < n; j *= 2) {  // O(logn)
                arrayList.add(i * j);
            }
        }
       
Ответ:  O(n) + O(logn) = O(nlogn)
```
b)

```
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i += 2) {    // O(n)
            for (int j = i; j < n; j++) {   // O(n)
                arrayList.add(i * j);
            }
        }

Ответ:  O(n) * O(n) = O(n^2)
```

с)

```
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {      // O(n)
            for (int j = 0; j < n; j++) {    
                arrayList.add(i * j);
				n--;
            }
        }
        
Ответ:  O(n)
```

d)
```
		
		factorial(BigInteger.valueOf(10000))
	
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return n;
        }
        return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }
    
Ответ:  O(n)
```

e)
```
	
	fib(BigInteger.valueOf(50));

    public static BigInteger fib(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return n;
        }
       
        return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
    }
    
Ответ:  O(n)
```