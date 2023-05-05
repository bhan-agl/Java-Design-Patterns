package Builder_Deisgn_Pattern.builder1;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withSecondName(String secondName);

    UserDTOBuilder withAddress(Address address);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTO build();
}
