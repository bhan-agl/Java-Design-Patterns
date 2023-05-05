package Builder_Deisgn_Pattern.client;

import Builder_Deisgn_Pattern.builder4.CarDTO;

public class Builder4 {
    public static void main(String[] args) {
        CarDTO dto = CarDTO.getBuilder()
                .withCarName("Wagon-R")
                .withCarEngine("1200cc")
                .withCarFuel("CNG")
                .withCarType("Manual")
                .build();
        System.out.println("dto -> " + dto.getCarName() + " " + dto.getCarEngine() + " " + dto.getCarFuel() + " " + dto.getCarType());
    }
}
