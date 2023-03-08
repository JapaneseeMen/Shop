import ru.netology.product.Product;

public class SmartPhone extends Product {
    public SmartPhone(int Id, String name, int price, String creator) {
        super(Id, name, price);
        this.creator = creator;
    }

    private String creator;
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


}
