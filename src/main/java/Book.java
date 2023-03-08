import ru.netology.product.Product;

public class Book extends Product {
    public Book(int Id, String name, int price, String author) {
        super(Id, name, price);
        this.author = author;
    }

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
