package weekend02.task.item;

public class ItemManager {
    private ItemModel itemModel;
    private ItemModel createShopItem(String title, String description, double price) {
        itemModel= new ItemModel(title, description, price);
        return itemModel;
    }
}
