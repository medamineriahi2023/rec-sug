package com.fseg.management.repository;

import com.fseg.management.entities.Image;
import com.fseg.management.entities.React;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReactRepository extends JpaRepository<React, Long> {
}
