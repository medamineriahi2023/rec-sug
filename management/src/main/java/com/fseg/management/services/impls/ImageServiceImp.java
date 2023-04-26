package com.fseg.management.services.impls;

import com.fseg.management.dtos.ImageDTO;
import com.fseg.management.entities.Image;
import com.fseg.management.mappers.ImageMapper;
import com.fseg.management.repository.ImageRepository;
import com.fseg.management.services.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ImageServiceImp implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    public ImageDTO save(ImageDTO dto) {
        Image image = ImageMapper.dtoToEntity(dto);
        ImageDTO imageDTO = ImageMapper.entityToDto(imageRepository.save(image));
        return imageDTO;
    }

    @Override
    public ImageDTO update(ImageDTO dto) {
        Image image = ImageMapper.dtoToEntity(dto);
        ImageDTO imageDTO = ImageMapper.entityToDto(imageRepository.save(image));
        return imageDTO;
    }

    @Override
    public void delete(Long id) {
            imageRepository.deleteById(id);
    }

    @Override
    public List<ImageDTO> getAll(Sort sort) {
        List<ImageDTO> imageDTOS = imageRepository.findAll().stream().map(ImageMapper::entityToDto).toList();

        return imageDTOS;
    }
}
