package cz.pedry.examplespringapp.repository;

import cz.pedry.examplespringapp.entity.Sprite;
import org.springframework.data.repository.CrudRepository;

public interface SpriteRepository extends CrudRepository<Sprite, Integer> {
}
