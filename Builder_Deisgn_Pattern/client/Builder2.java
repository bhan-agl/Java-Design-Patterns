package Builder_Deisgn_Pattern.client;

import Builder_Deisgn_Pattern.builder2.IProductDTO;
import Builder_Deisgn_Pattern.builder2.Product;
import Builder_Deisgn_Pattern.builder2.ProductWebDTOBuilder;

public class Builder2 {
    public static void main(String[] args) {
        Product productWithOutSale = getProductWithoutSale();
        Product productOnSale = getProductOnSale();

        IProductDTO dtoWithOutSale = builder(new ProductWebDTOBuilder(), productWithOutSale);
        IProductDTO dtoSale = builder(new ProductWebDTOBuilder(), productOnSale);

        printLogs(dtoWithOutSale);
        printLogs(dtoSale);
    }

    private static void printLogs(IProductDTO dto) {
        System.out.println("Sale -> " + dto.getProductName() + " " + dto.getProductID() + " " + dto.getProductPrice() + " " + dto.isProductCOD() + " " + dto.isHalfPriceSale());
    }

    private static IProductDTO builder(ProductWebDTOBuilder builder, Product product) {
        return builder.withProductName(product.getProductName()).withProductId(product.getProductID()).withProductPrice(product.getProductPrice()).withIsCOD(product.isProductCOD()).withIsHalfPriceSale(product.isHalfPriceSale()).build();
    }

    private static Product getProductWithoutSale() {
        return new Product("PlayStation-5", "PS-5", "50000", true, false);
    }

    private static Product getProductOnSale() {
        return new Product("XBox-360", "X-360", "30000", true, true);
    }
}
