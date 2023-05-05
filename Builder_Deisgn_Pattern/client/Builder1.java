package Builder_Deisgn_Pattern.client;

import Builder_Deisgn_Pattern.builder1.*;

import java.time.LocalDate;

public class Builder1 {
    public static void main(String[] args) {
        User user = createUser();
        UserWebDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = builder(builder, user);
        System.out.println("Builder Pattern 1 -> " + dto.getName() + " " + dto.getAge() + " " + dto.getAddress());
    }

    private static UserDTO builder(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withSecondName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    private static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1991, 1, 1));
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        Address address = new Address();
        address.setCity("City");
        address.setPinCode("pinCode");
        address.setHouseNumber("HouseNo.");
        user.setAddress(address);
        return user;
    }

}
