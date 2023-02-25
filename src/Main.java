import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Задание 1. Написать программу на Java для вычисления серии чисел Фибоначчи.

        System.out.println("Задание 1");

        //Создаем бесконечный стрим, где задаем начальное значение, а также указываем как будем получать следующее,
        //используя предыдущий результат.
        // Методом limit ограничиваем стрим по указанному количеству.
        //Метод map вернет элементы с результатами функций.
        //Метод forEach используем для перебора элементов потока, внутрь передаем ссылку на статический метод,
        //который выводит строку на консоль.

        Stream.iterate(new int[]{0, 1}, t -> new int[]{
                        t[1], t[0] + t[1]}).limit(10)
                .map(x -> x[0]).forEach(System.out::println);


        // Задание 2. Создать метод, который преобразует массив объектов User
        // (с полями name, age, phone) в карту Номер телефона - Имя пользователя.

        System.out.println("Задание 2");
        List<User> users = new ArrayList<>();
        users.add(new User("Пользователь1", 16, "8-800-700-00-00"));
        users.add(new User("Пользователь2", 35, "8-800-000-00-00"));
        users.add(new User("Пользователь3", 27, "8-900-000-00-00"));

        Map<String, String> map = users.stream()
                .collect(Collectors.toMap(User::getPhone, User::getName));
        //.collect(Collectors.toMap(x -> x.getName, x -> x.User::getPhone));
        // - С использованием лямбда-выражения вместо ссылок на методы

        System.out.println("Map: " + map);
    }

    //1. Можно ли в конструкторе выкинуть исключение (exception)?
    //2. Что будет, если не переопределить equals and hashCode?
    //3. Дайте определение понятию exception (исключительная ситуация).
    //4. Что такое массив?
}