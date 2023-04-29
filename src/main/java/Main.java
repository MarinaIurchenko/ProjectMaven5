public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Анатолий";
        post.passport = "5674 № 46738294";
        post.patronymic = "Александрович";
        post.phone = "+7 (921) 536-74-27";
        post.surname = "Кузнецов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 25;
        post.birthday.month = 10;
        post.birthday.year = 1990;
    }
}
