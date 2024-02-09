## 01. Файлы и IO
* IO - Input/Output - операции ввода/вывода, которые можно делать с любыми внешними ресурсами из программы.
* Внешним ресурсом может быть сайт, веб-сервис, база данных или файл.
* Файл в программе можно представить с помощью объекта класса File.
* У каждого файла есть путь.
* При этом, пути бывают абсолютными и относительными.
* Абсолютный путь - путь от корня системы.
* Относительный путь - путь от любой папки.
* Относительный путь используется как альтернатива абсолютному тогда, когда требуется переносимость проекта/папки на 
другие устройства без потери работоспособности
* Запись и чтение из файла производится с помощью IO потоков.
* Обратите внимание, что для правильного завершения работы потока его нужно закрывать.
* Если этого не сделать, некоторые данные могут быть не записаны. Насколько много данных будет потеряно зависит от реализации
* Закрывать потоки вручную - неудобно. Для решения этого неудобства придумати try-with-resources
* Он позволяет закрывать потоки созданные в его круглых скобках автоматически.
* Также он может стоять без блока catch, но зачастую там нужно ловить IOException