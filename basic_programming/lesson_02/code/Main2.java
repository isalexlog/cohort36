// public - access modifier (модификатор доступа)
// class
// ИмяКласса (PascalCase)
// { тело класса }
public class Main2 {

  // тело класса состоит из полей и методов

  // метод main:
  // public - access modifier (модификатор доступа)
  // static
  // void - пустота - тип возвращаемого значения
  // имяМетода (camelCase)
  // ( аргументы, если есть ) - скобочки пишутся в любом случае
  // { тело метода }
  public static void main(String[] args) {
    // print() - после вывода курсор остаётся в конце вывода
    // println() - ПОСЛЕ вывода программа перейдёт на новую строку
    System.out.println("Мама");
    System.out.println("Мыла");

    // последняя команда вывода на экран всегда должна заканчиваться переходом на новую строку
    System.out.println("Раму");
  }
}
