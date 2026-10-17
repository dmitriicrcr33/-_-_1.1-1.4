package ru.mirea.baranov.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Иванов Иван", "ivanov@mail.ru", 'M');
        System.out.println(a);
        a.setEmail("i.ivanov@mirea.ru");
        System.out.println("Email после смены: " + a.getEmail());
        System.out.println("Имя: " + a.getName());
        System.out.println("Пол: " + a.getGender());
    }
}
