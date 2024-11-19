package com.exo1.exo1.repository;

import com.exo1.exo1.entity.ProjetTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetTaskRepository extends JpaRepository<ProjetTask, Long> {
}
