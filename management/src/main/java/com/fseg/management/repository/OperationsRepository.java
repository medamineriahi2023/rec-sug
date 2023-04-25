package com.fseg.management.repository;

import com.fseg.management.entities.Image;
import com.fseg.management.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationsRepository extends JpaRepository<Operation, Long> {
}
