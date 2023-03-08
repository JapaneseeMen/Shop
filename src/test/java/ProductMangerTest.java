import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.product.Product;

public class ProductMangerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "Гарри Поттер", 1000, "Роулинг");
    Product book2 = new Book(2, "Война и Мир", 1500, "Толстой");
    Product book3 = new Book(3, "Мертвые души", 1300, "Гоголь");
    Product smartphone1 = new SmartPhone(4, "IPhone", 90000, "USA");
    Product smartphone2 = new SmartPhone(5, "Samsung", 50000, "S.Korea");
    Product smartphone3 = new SmartPhone(6, "Xiaomi", 55000, "China");

    @BeforeEach
    public void setup() {
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);

    }
    @Test

    public void showAddBook(){
        Product book4 = new Book(7,"Идиот", 2000, "Достоевсикй");
        manager.add(book4);
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3, book4};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void searchOneItem(){
        Product[] actual = manager.searchBy("Га");
        Product[] expected = {book1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void searchThreeItems(){
        Product[] actual = manager.searchBy("и");
        Product[] expected = {book1, book2, book3};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void searchNoItems(){
        Product[] actual = manager.searchBy("ё");
        Product[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }
   @Test
    public void searchItemsWithAdd(){
        Product book4 = new Book(7,"Идиот", 2000, "Достоевсикй");
        manager.add(book4);
        Product[] actual = manager.searchBy("и");
        Product[] expected = {book1, book2, book3, book4};
        Assertions.assertArrayEquals(expected, actual);

    }
}
