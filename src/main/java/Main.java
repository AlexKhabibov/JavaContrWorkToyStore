import Controller.Controller;
import fabricMethod.ItemToy;
import fabricMethod.Toy;
import fabricMethod.ToyGen;

//Промежуточная контрольная работа по блоку специализация
//
//        Задание
//
//        Напишите класс-конструктор у которого принимает минимум 3 строки, содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки
//        Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.
//        Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию
//        Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в файл

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createAndGetToy();
        controller.show();
    }
}