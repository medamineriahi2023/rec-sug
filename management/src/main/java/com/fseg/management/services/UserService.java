package com.fseg.management.services;

import com.fseg.management.dtos.CommentDto;
import com.fseg.management.services.abstracts.ICrudService;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    String getUserNameById(String userId);
    List<UserRepresentation> getAllUsers();
    List<RoleRepresentation> getAllRoles();

    ResponseEntity<?> createUser(UserRepresentation userRepresentation);

    ResponseEntity<?> changePass(String userId, String newPass);
}
