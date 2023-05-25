package com.example.SpringCRUDproject.service;

import com.example.SpringCRUDproject.entity.Subject;
import com.example.SpringCRUDproject.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    public SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects(){
        List<Subject> subjects=new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject){
        subjectRepository.save(subject);
    }

    public void updateSubject(Integer id, Subject subject){
        subjectRepository.save(subject);
    }

    public void deleteSubject(Integer id) {
        subjectRepository.deleteById(id);
    }
}
