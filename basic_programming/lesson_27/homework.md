# Задание

`Подготовка к выполнению`

```
Открыть ранее созданый проект homework.
Если не сделали в предыдущем задании, перейти на ветку master, сделать git pull origin master.
Удалить ветку homework26 из локального репозитория.
Создать и перейти на ветку homework27.
В папке src создать пакет homework27. Размещать текущее ДЗ только в этом пакете.
Каждая задача (task) из этого задания должна выполняться в отдельном пакете внутри пакета homework25.
Это значит, что теперь перед задачей написано не название класса который нужно создать, а название пакета.

Желательно для каждой решенной задачи делать отдельный коммит с названием "add task01 solution" 
(вместо 01 написать номер задания, которое было решено).
Порядок выполнения заданий не имеет значения.
```

`task01`

Сложность: легко (3/10)

```
Взять из задания 26 задачи 01 класс Human.
Применить к этому классу инкапсуляцию.
Для этого, для всех полей использовать модификатор private
Для каждого поля написать аксесоры.
В аксесорах реализовать минимальную логику, где это уместно на ваш взгляд.
```

`task02`

Сложность: средне (6/10)

```
Разработать класс "Банковский счет".
Добавить поля для суммы денег на счету и номера счета.
Добавить конструктор с одним параметром "номер счета".
Применить инкапсуляцию: сделать поля приватными и написать аксесоры.
Написать аксесоры таким образом, чтобы нельзя было изменить номер счета.
Вместо сеттера, для поля "сумма" сделать два метода, один из которых позволит 
снять переданную сумму со счета, а второй позволит положить сумму на счет.
Очевидно, что если пользователь попытается снять больше денег чем есть на счету,
эта операция не должна произойти и должно быть выведено сообщение "недостаточно средств". 
```

`Сдача задания`

```
Чтобы сдать задание, отправьте вашу ветку в ремоут, и там создайте пулл реквест слияния этой ветки в master.
Отправьте преподавателю ссылку на пулл реквест.
```