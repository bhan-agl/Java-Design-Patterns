package Builder_Deisgn_Pattern.builder2;

public class Product implements IProductDTO {
    private String productName, productId, productPrice;
    private boolean isProductCOD, isHalfPriceSale;

    public Product(String productName, String productId, String productPrice, boolean isProductCOD, boolean isHalfPriceSale) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.isProductCOD = isProductCOD;
        this.isHalfPriceSale = isHalfPriceSale;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public String getProductID() {
        return this.productId;
    }

    @Override
    public String getProductPrice() {
        return this.productPrice;
    }

    @Override
    public boolean isProductCOD() {
        return this.isProductCOD;
    }

    @Override
    public boolean isHalfPriceSale() {
        return isHalfPriceSale;
    }
}
