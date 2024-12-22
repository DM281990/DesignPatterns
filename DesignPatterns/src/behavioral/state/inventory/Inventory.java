package behavioral.state.inventory;

public class Inventory {
    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    ItemShelf[] inventory = null;
    Inventory(int itemCount){
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    private void initialEmptyInventory() {
        int startCode =101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i]=space;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.getCode() ==codeNumber){
                if(itemShelf.isSoldOut()){
                    itemShelf.setSoldOut(false);
                    itemShelf.setItem(item);
                }
                else{
                    throw new Exception("Item already present");
                }
            }
        }
    }

    public Item getItem(int codeNumber) {
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.getCode() ==codeNumber){
                if(!itemShelf.isSoldOut()){
                    return itemShelf.getItem();
                }
            }
        }
        return null;
    }

    public void updateSoldCount(int codeNumber) {
    }
}
