package com.fseg.management.services.impls;

import com.fseg.management.dtos.ReactDTO;
import com.fseg.management.entities.React;
import com.fseg.management.mappers.ReactMapper;
import com.fseg.management.repository.ReactRepository;
import com.fseg.management.services.ReactService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReactServiceImp implements ReactService {

    private final ReactRepository reactRepository;

    @Override
    public ReactDTO save(ReactDTO dto) {
        React react = ReactMapper.dtoToEntity(dto);
        ReactDTO reactDTO = ReactMapper.entityToDto(reactRepository.save(react));
        return reactDTO;
    }

    @Override
    public ReactDTO update(ReactDTO dto) {
        React react = ReactMapper.dtoToEntity(dto);
        ReactDTO reactDTO = ReactMapper.entityToDto(reactRepository.save(react));
        return reactDTO;
    }

    @Override
    public void delete(Long id) {
        reactRepository.deleteById(id);
    }

    @Override
    public List<ReactDTO> getAll(Sort sort) {
        return ReactMapper.getDtoList(reactRepository.findAll());
    }
}
