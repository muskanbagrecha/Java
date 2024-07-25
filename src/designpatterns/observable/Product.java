package src.designpatterns.observable;

public class Product {
    private int productId;
    private String productName;
    private boolean inStock;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
        this.inStock = false; //initially default to false
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
