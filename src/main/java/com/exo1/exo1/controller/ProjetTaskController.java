package com.exo1.exo1.controller;
import com.exo1.exo1.service.ProjetTaskService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/projet-tasks")
@AllArgsConstructor
public class ProjetTaskController {

    @Autowired
    private ProjetTaskService projetTaskService;

    @PostMapping("/refresh")
    public void refreshMaterializedView() {
        projetTaskService.refreshMaterializedView();
    }
}
