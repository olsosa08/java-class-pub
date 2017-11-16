package exercise8;

/**
 * Class Item
 * @author yasiro01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

    public Item(long id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
      boolean ans = false;
    if(quantity > 0){
        ans = true;
    }
    return ans;
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    if(quantity > 0){
        quantity --;
    }
    else{
        System.out.println("This item is not available");
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      quantity ++;
  }
  
  @Override
  public String toString() {
    String temp = null;
    if(quantity == 1){
        temp = String.format("We have a copy of %s",title);
    }
    else{
        temp = String.format("We have %d copies of %s",quantity, title);
    }
    return temp;
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
