public class Main {
    public static void main(String[] args) {
        Author kathySierra = new Author("Kathy", "Sierra");
        Author adityaBhargava = new Author("Aditya", "Bhargava");
        Book learningJava = new Book("Learning Java", kathySierra, 2022);
        Book grokAlgorithms = new Book("Grok Algorithms", adityaBhargava, 2017);

        System.out.println(learningJava);
        System.out.println(grokAlgorithms);
        grokAlgorithms.setPublicationYear(2021);
        System.out.println(grokAlgorithms);
    }
}