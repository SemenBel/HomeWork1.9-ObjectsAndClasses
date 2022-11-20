public class Main {
    public static void main(String[] args) {
        Author kathySierra = new Author("Kathy", "Sierra");
        Author adityaBhargava = new Author("Aditya", "Bhargava");
        Book learningJava = new Book("Learning Java", kathySierra, 2022);
        Book grokAlgorithms = new Book("Grok Algorithms", adityaBhargava, 2017);

        System.out.println("Книга: " + learningJava.getTitle() + ", Автор: " + learningJava.getAuthor().getName() + " " + learningJava.getAuthor().getSurname() + ", Год публикации: " + learningJava.getPublicationYear());
        System.out.println("Книга: " + grokAlgorithms.getTitle() + ", Автор: " + grokAlgorithms.getAuthor().getName() + " " + grokAlgorithms.getAuthor().getSurname() + ", Год публикации: " + grokAlgorithms.getPublicationYear());
        grokAlgorithms.setPublicationYear(2021);
        System.out.println("Книга: " + grokAlgorithms.getTitle() + ", Автор: " + grokAlgorithms.getAuthor().getName() + " " + grokAlgorithms.getAuthor().getSurname() + ", Год публикации: " + grokAlgorithms.getPublicationYear());

    }

}