package com.fseg.management.services.impls;


import com.fseg.management.dtos.CommentDto;
import com.fseg.management.entities.Comment;
import com.fseg.management.mappers.CommentMapper;
import com.fseg.management.repository.CommentRepository;
import com.fseg.management.security.KeycloakConfig;
import com.fseg.management.services.CommentService;
import com.fseg.management.services.UserService;
import lombok.RequiredArgsConstructor;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private KeycloakConfig keycloakConfig;


    @Override
    public String getUserNameById(String userId) {
        return  keycloakConfig.getInstance().realm(keycloakConfig.getRealm()).users().get(userId).toRepresentation().getUsername();
    }

    @Override
    public List<UserRepresentation> getAllUsers() {
        return keycloakConfig.getInstance().realm(keycloakConfig.getRealm()).users().list();
    }

    @Override
    public List<RoleRepresentation> getAllRoles() {
        return keycloakConfig.getInstance().realm(keycloakConfig.getRealm()).roles().list();
    }

    @Override
    public ResponseEntity<?> createUser(UserRepresentation userRepresentation) {
        Response response = keycloakConfig.getInstance().realm(keycloakConfig.getRealm()).users().create(userRepresentation);
        if (response.getStatus() == 201)
        return new ResponseEntity<>(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);


    }

    @Override
    public ResponseEntity<?> changePass(String userId, String newPass) {
        keycloakConfig.getInstance().realm(keycloakConfig.getRealm()).users().get(userId).credentials() ;
        return null;
    }
}
