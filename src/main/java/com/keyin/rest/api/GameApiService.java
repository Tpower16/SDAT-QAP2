package com.keyin.rest.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "game", path = "game")
public interface GameApiService extends JpaRepository<Game, Long> {

    public List<Game> findByTitle(@Param("title")String title);
    public List<Game> findByCreator(@Param("creator")String creator);
}
