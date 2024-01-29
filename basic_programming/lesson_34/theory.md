## 01. switch
* Оператор переключатель (switch) - это такой оператор управления потоком программы, который будет облегчать сравнение 
нескольких значений с значением какой-то переменной.
* В отличии от if-else, в switch можно только проверять равенство значений.
* Делается проверка с помощью слова `case`
* Внутри кейсов не предусмотрен блок кода. Это значит, что если вручную не завершить оператор управления потоком программы,
после выполнения одного кейса будут выполняться и все остальные, которые находятся под ним.
* Такой случай называется break-out (когда выполняется несколько кейсов)
* Вручную завершить можно словом `break`
* Вместо else здесь используется default case, который обозначается ключевым словом `default`. Но он не обязателен
* Синтаксис:

```
switch (переменная либо выражение) {
case значение1:
    // выполняемый код
    break;
case значение2:
    // выполняемый код
    break; 
case значение3:
    // выполняемый код
    break;
default:
    // выполняемый код
    break;
}
```

## 02. Перечисления
* Перечисление - это такой пользовательски-определяемый тип, для которого можно указать все возможные значения.
* При этом, у каждого значения будет свой идентификатор.
* Синтаксис:
```
public enum Идентификатор {
    ЗНАЧЕНИЕ1,
    ЗНАЧЕНИЕ2,
    ЗНАЧЕНИЕ3
}
```
* В любом перечислении будет метод values(), позволяющий получить все элементы перечисления как обычный массив.
* Чтобы вывести элемент перечисления в консоль, достаточно просто записать его идентификатор; джава сама разберется,
* что нужно вывести, и выведет в форме строки идентификатор этого объекта.
* Точку с запятой нужно ставить после последнего элемента только в том случае, если дальше пишем что-то