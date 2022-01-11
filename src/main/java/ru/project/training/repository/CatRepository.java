package ru.project.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.training.entity.animalsInheritanceTypeSingleTable.Cat;

public interface CatRepository extends JpaRepository<Cat, Integer> {
}
