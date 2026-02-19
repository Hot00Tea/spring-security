package mate.academy.spring_security.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {

    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    private String shippingAddress;
}
