package com.fseg.management.services.impls;


import com.fseg.management.dtos.CommentDto;
import com.fseg.management.entities.Comment;
import com.fseg.management.mappers.CommentMapper;
import com.fseg.management.repository.CommentRepository;
import com.fseg.management.security.KeycloakConfig;
import com.fseg.management.services.CommentService;
import com.fseg.management.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
