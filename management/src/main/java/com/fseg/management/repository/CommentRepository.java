package com.fseg.management.repository;

import com.fseg.management.entities.Comment;
import com.fseg.management.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
