package com.exo1.exo1.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exo1.exo1.entity.ProjetTask;
import com.exo1.exo1.repository.ProjetTaskRepository;

@Service
public class ProjetTaskService {

    @Autowired
    private ProjetTaskRepository projetTaskRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void refreshMaterializedView() {
        entityManager.createNativeQuery("REFRESH MATERIALIZED VIEW projet_task_count").executeUpdate();
    }

    public List<ProjetTask> findAll() {
        return projetTaskRepository.findAll();
    }
}
