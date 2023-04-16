public class Main {
    public static void main(String[] args) {
        Autor lTolstoy = new Autor("Лев", "Толстой");
        Autor nGogol = new Autor("Николай", "Гоголь");
        Book revisor = new Book("Ревизор", nGogol.getFirstName(), nGogol.getLastName(), 1835);
        Book warAndPeace = new Book("Война и мир",lTolstoy.getFirstName(), lTolstoy.getLastName(), 1860);
        System.out.printf("Название книги \"%s\", автор: %s %s, год публикации: %d.\n", warAndPeace.getBookTitle(), warAndPeace.getAutorFirstName(), warAndPeace.getFutorLastName(),warAndPeace.getPublicationYear());
        System.out.println("Не правильно указан год публикаци!");
        System.out.println("Исправление...");
        warAndPeace.setPublicationYear(1863);
        System.out.printf("Название книги \"%s\", автор: %s %s, год публикации: %d.\n", warAndPeace.getBookTitle(), warAndPeace.getAutorFirstName(), warAndPeace.getFutorLastName(),warAndPeace.getPublicationYear());
        System.out.printf("Название книги \"%s\", автор: %s %s, год публикации: %d.\n", revisor.getBookTitle(), revisor.getAutorFirstName(), revisor.getFutorLastName(),revisor.getPublicationYear());
    }

}