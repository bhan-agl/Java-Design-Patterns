package Builder_Deisgn_Pattern.builder2;

public interface IProductDTOBuilder {
    IProductDTOBuilder withProductName(String productName);

    IProductDTOBuilder withProductPrice(String productPrice);

    IProductDTOBuilder withProductId(String productId);

    IProductDTOBuilder withIsCOD(boolean isCOD);

    IProductDTOBuilder withIsHalfPriceSale(boolean isHalfPriceSale);

    IProductDTO build();
}
