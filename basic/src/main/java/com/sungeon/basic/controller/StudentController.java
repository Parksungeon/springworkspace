package com.sungeon.basic.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sungeon.basic.dto.request.student.PostStudentRequestDto;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/student")
public class StudentController {

    // CREATE
    @PostMapping("/")
    public ResponseEntity<String> postStudent(
        @RequestBody @Valid PostStudentRequestDto requestBody
    ) {
        return null;
    }

    // UPDATE
    @PatchMapping("/")
    public ResponseEntity<?> patchStudent() {
        return null;
    }

    // DELETE
    @DeleteMapping("/{studentNumber}")
    public ResponseEntity<?> deleteStudent(
        @PathVariable("studentNumber") Integer studentNumber
    ) {
        return null;
    }
    
}