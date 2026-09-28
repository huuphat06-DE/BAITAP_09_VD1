package vn.iotstar.mapper;

import org.springframework.stereotype.Component;
import vn.iotstar.dto.UserDTO;
import vn.iotstar.entity.User;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        if ( user.getRole() != null ) {
            userDTO.roleName( user.getRole().getName() );
        }
        userDTO.id( user.getId() );
        userDTO.username( user.getUsername() );
        userDTO.email( user.getEmail() );
        userDTO.fullName( user.getFullName() );
        userDTO.images( user.getImages() );
        userDTO.enabled( user.isEnabled() );

        return userDTO.build();
    }
}
