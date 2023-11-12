## 01. Принципы ООП. Инкапсуляция
* Принципы ООП - это набор техник, с помощью которых можно эффективно пользоваться средствами ООП, при этом разарабатывая
быстрые, удобные и безопасные приложения.
* Принципов ООП всего 4:
  * Инкапсуляция
  * Абстракция
  * Наследование
  * Полиморфизм
* Инкапсуляция - это принцип ООП, который говорит о том, что:
1. все данные, сохраненные в объекте должны быть защищены;
2. все методы и поля должны быть внутри одного класса.
* Инкапсуляция реализуется с помощью модификаторов доступа и аксесоров.
* Модификатор доступа - это ключевое слово, которое будет обозначать, кто будет иметь доступ к данным класса.
* Модификаторы доступа должны быть использованы перед каждым элементом класса.
* Модификаторы доступа:
  * private
  * package-private
  * protected
  * public
* В этом списке, каждый предыдущий модификатор будет расширять следующий.
* public
  * Дает возможность классам абсолютно везде видеть этот элемент.
* package-private 
  * Дает возможность видеть этот элемент только классам в том же пакете.
  * Ключевого слова для этого уровня не существует. Чтобы обозначить поле/объект этим модификатором, 
  нужно впринципе не писать никакой модификатор.
* private
  * Не дает возможность видеть элемент абсолютно никому кроме этого же класса

* По инкапсуляции, нам нужно всегда для всех полей указывать как можно более строгий модификатор доступа.
* Для полей это почти всегда будет private (кроме случаев с наследованием).
* Для методов, это будет любой модификатор в зависимости от того, как вы хотите разработать ваше приложение.

* Возникает резонный вопрос - а как же пользоваться объектом, если нам недоступны никакие поля?
* Эту проблему решают аксесоры.
* Аксесоры - это такие методы, которые предоставляют другим классам возможность получить доступ к полям, но
делают это безопаснее (т.е. также могут осуществлять контроль над данными, которые вводятся/выводятся из объекта).
* Аксесоры делятся на геттеры и сеттеры (getter and setter).
  * Геттеры - позволяют получить значение поля.
  * Сеттер - позволяют задать значение поля.
* Аксесоры (по кодстайлу) всегда нужно записывать неразрывно.
* Это значит, что между аксесорами не может быть других методов
* Есть два способа записать аксесоры правильно:
1. Сначала один тип аксесоров, потом второй.
2. Поочередно геттер и сеттер для каждого поля.

* Аксесоры всегда будут формироваться по определенному шаблону.
* Для геттеров:
  * Модификатор public.
  * Возвращаемый тип метода - совпадает с полем, для которого пишется геттер.
  * Идентификатор начинается со слова get, и после этого имя поля.
  * Исключение: тип boolean. Для него пишем is вместо get. Но если поле уже начинается с is, тогда пишем is всего один раз.
  * Почти никогда не будет параметров.
  * В теле метода - возвращение значения поля.
* Для сеттеров:
  * Модификатор public.
  * Возвращаемый тип метода - почти всегда void.
  * Идентификатор начинается с set, после чего записывается имя поля, для которого пишется сеттер.
  * Параметр почти всегда один - значение, которое нужно выставить для этого поля.
  * В теле метода - присвоение параметра полю

* В аксесорах может быть какая-то дополнительная логика.
* Это значит, что там можно написать какой-то дополнительный код, который будет контролировать
какие данные мы выставляем или получаем

## 02. Абстракция
* Абстракция - говорит о том, что в вашем приложении все должно быть нужным для текущего приложения.
* Другими словами, не должно быть избыточного функционала, который не используется.
* В ООП, это интерпретируется так: в классах не должно быть лишних полей либо методов, также как и полей либо методов,
которые не будут универсальными для всех объектов этого класса.
* Пример: Телефон.
  * В телефоне, по сути, должна быть только возможность звонить.
  * Например, поле "Разрешение экрана" будет не соответствовать абстракции, потому что существуют телефоны, 
  у которых нет экрана.
* Если мы хотим телефон с экраном, то, скорее всего, нужно его записать как Мобильный телефон.
* Если мы хотим телефон с возможностью компьютера, то назовем этот класс смартфон










