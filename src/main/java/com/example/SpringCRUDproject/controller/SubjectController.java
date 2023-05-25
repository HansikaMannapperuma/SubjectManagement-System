package com.example.SpringCRUDproject.controller;

import com.example.SpringCRUDproject.entity.Subject;
import com.example.SpringCRUDproject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public List<Subject> getAllSubjects(){
    return subjectService.getAllSubjects();
    }

    @PostMapping("/subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @PutMapping("/subjects/{id}")
    public void updateSubject(@PathVariable Integer id,@RequestBody Subject subject){
        subjectService.updateSubject(id,subject);
    }

    @DeleteMapping("subjects/{id}")
    public void deleteSubject(@PathVariable Integer id){
        subjectService.deleteSubject(id);
    }
}
