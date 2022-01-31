/**
 * 9. Создать класс Book, спецификация
 * которого приведена ниже. Определить
 * конструкторы, set- и get- методы и
 * метод toString(). Создать второй
 * класс, агрегирующий массив типа Book,
 * с подходящими конструкторами и
 * методами. Задать критерии выбора
 * данных и вывести эти данные на консоль.
 * <p>
 * Book: id, название, автор(ы),
 * издательство, год издания, количество
 * страниц, цена, тип переплета.
 * <p>
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным
 * издательством;
 * c) список книг, выпущенных после
 * заданного года.
 */

class Book {
    private int id;
    private String name;
    private String authors;
    private String publisher;
    private int year;
    private int pages;
    private float cost;
    private String cover;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getAuthors() {
        return authors;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Book(int id, String name, String authors, String publisher, int year, int pages, float cost, String cover) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
        this.cover = cover;
    }

    public String toString() {
        return this.id + " | " + this.name + " | " + this.authors + " | " + this.publisher + " | " + this.year + " | " + this.pages + " | " + this.cost + " | " + this.cover;
    }
}

class Bookshop {

    private Book[] books;


    public Bookshop(Book[] books) {
        this.books = books;
    }

    public void selectAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                System.out.println(book.toString());
            }
        }
    }

    public void selectPublisher(String publisher) {
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book.toString());
            }
        }
    }

    public void selectYear(int year) {
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book.toString());
            }
        }
    }
}

public class SimpleClass9 {
    public static void main(String[] args) {
        Book book1 = new Book(12, "1984", "George Orwell", "Januskevic", 2021, 328, 9.99F, "hardcover");
        Book book2 = new Book(15, "Good Omens", "Neil Gaiman, Terry Pratchett", "Fox", 1990, 288, 5.59F, "hardcover");
        Book book3 = new Book(19, "The Colour of Magic", "Terry Pratchett", "Fox", 1983, 288, 19.99F, "paperback");

        Bookshop bookshop = new Bookshop(new Book[]{book1, book2, book3});
        bookshop.selectAuthor("Terry Pratchett");
        System.out.println();
        bookshop.selectPublisher("Fox");
        System.out.println();
        bookshop.selectYear(1989);
    }
}