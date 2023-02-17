import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    // Задание 1. Написать программу на Java для вычисления серии чисел Фибоначчи.

    // Задание 2. Создать метод, который преобразует массив объектов User
    // (с полями name, age, phone) в карту Номер телефона - Имя пользователя.

    public static void main(String[] args) {

        System.out.println("Задание 1");

        Stream.iterate(new int[]{0, 1}, t -> new int[]{
                        t[1], t[0] + t[1]}).limit(10)
                .map(x -> x[0]).forEach(System.out::println);


        System.out.println("Задание 2");
        List<User> users = new ArrayList<>();
        users.add(new User("Пользователь1", 16, "8-800-700-00-00"));
        users.add(new User("Пользователь2", 35, "8-800-000-00-00"));
        users.add(new User("Пользователь3", 27, "8-900-000-00-00"));
        System.out.println(users);

        Map<String, String> usersPhoneMap = new HashMap<>();
        users.forEach(user -> {
            usersPhoneMap.put(user.getPhone(), user.getName());
        });

        System.out.println(usersPhoneMap);


    }
}