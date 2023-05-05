package Builder_Deisgn_Pattern.builder4;

public class CarDTO {

    private String carName, carType, carFuel, carEngine;

    private CarDTO() {
    }

    public String getCarName() {
        return carName;
    }

    private void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    private void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarFuel() {
        return carFuel;
    }

    private void setCarFuel(String carFuel) {
        this.carFuel = carFuel;
    }

    public String getCarEngine() {
        return carEngine;
    }

    private void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public static CarDTOBuilder getBuilder() {
        return new CarDTOBuilder();
    }

    public static class CarDTOBuilder {
        private String carName, carType, carFuel, carEngine;
        private CarDTO dto;

        private CarDTOBuilder() {
        }

        public CarDTOBuilder withCarName(String carName) {
            this.carName = carName;
            return this;
        }

        public CarDTOBuilder withCarType(String carType) {
            this.carType = carType;
            return this;
        }

        public CarDTOBuilder withCarFuel(String carFuel) {
            this.carFuel = carFuel;
            return this;
        }

        public CarDTOBuilder withCarEngine(String carEngine) {
            this.carEngine = carEngine;
            return this;
        }

        public CarDTO build() {
            CarDTO dto = new CarDTO();
            dto.setCarName(this.carName);
            dto.setCarEngine(this.carEngine);
            dto.setCarFuel(this.carFuel);
            dto.setCarType(this.carType);
            return dto;
        }
    }
}
