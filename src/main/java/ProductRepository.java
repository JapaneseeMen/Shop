import ru.netology.product.Product;

public class ProductRepository {
    private Product[] items = new Product[0];

    public Product[] findAll() {
        return items;
    }

    public void save(Product item) {
        Product[] tmp = new Product[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Product findBiId(int id){
        for(Product item : items){
            if(item.getId() == id){
                return item;
        }
    }
    return null;
}
    public void removeById(int id) {
        if (findBiId(id) == null){
            throw new NotFoundException("Товар с ID" + id + "не найден");
        }
        Product[] tmp = new Product[items.length - 1];
        int copyToIndex = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }
}
