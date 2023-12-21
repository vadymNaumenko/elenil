package de.pet_project.controller.dto.user;

import de.pet_project.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String avatar;
    private String nickname;
    private String firstname;
    private String lastname;
    private String password;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String role;
    private String state;
    private LocalDateTime createdAt;

    public static UserDTO getInstance(User user){
        return new UserDTO(
                user.getId(), user.getAvatar(), user.getNickname(),
                user.getFirstname(), user.getLastname(),null, user.getBirthDate(), //todo password null
                user.getEmail(), user.getPhone(), user.getRole(),user.getState(),user.getCreatedAt()
        );
    }
//    public static User getInstance(UserDTO user){
//        return new User(
//                user.getId(), user.getAvatar(), user.getNickname(),
//                user.getFirstname(), user.getLastname(), user.getBirthDate(),
//                user.getEmail(), user.getPhone(), user.getRole(),user.getState(),user.getCreatedAt()
//        );
//    }
}
