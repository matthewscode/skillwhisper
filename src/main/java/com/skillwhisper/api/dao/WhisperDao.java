package com.skillwhisper.api.dao;

import com.skillwhisper.api.entity.Whisper;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "whisper", path = "whisper")
public interface WhisperDao extends PagingAndSortingRepository<Whisper, Long> {

    List<Whisper> findByName(@Param("name") String name);

}
