package com.fseg.management.services;

import com.fseg.management.dtos.CommentDto;
import com.fseg.management.services.abstracts.ICrudService;

import java.util.Map;

public interface UserService {

    String getUserNameById(String userId);
}
