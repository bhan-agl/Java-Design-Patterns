package Builder_Deisgn_Pattern.builder2;

public class ProductWebDTOBuilder implements IProductDTOBuilder {
    private String productName, productId, productPrice;
    private boolean isProductCOD, isHalfPriceSale;

    @Override
    public IProductDTOBuilder withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    @Override
    public IProductDTOBuilder withProductPrice(String productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    @Override
    public IProductDTOBuilder withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    @Override
    public IProductDTOBuilder withIsCOD(boolean isCOD) {
        this.isProductCOD = isCOD;
        return this;
    }

    @Override
    public IProductDTOBuilder withIsHalfPriceSale(boolean isHalfPriceSale) {
        this.isHalfPriceSale = isHalfPriceSale;
        if (this.isHalfPriceSale) {
            int price = Integer.parseInt(this.productPrice);
            int priceHalf = price / 2;
            withProductPrice(Integer.toString(priceHalf));
        }
        return this;
    }

    @Override
    public IProductDTO build() {
        return new Product(this.productName, this.productId, this.productPrice, this.isProductCOD, this.isHalfPriceSale);
    }
}
