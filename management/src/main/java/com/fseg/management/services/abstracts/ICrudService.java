package com.fseg.management.services.abstracts;

import java.util.List;

public interface ICrudService<T> {

    T save(T dto);
    T update(T dto);
    void delete(Long id);
    List<T> getAll();
}
