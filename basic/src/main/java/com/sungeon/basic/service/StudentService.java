package com.sungeon.basic.service;

import org.springframework.http.ResponseEntity;

import com.sungeon.basic.dto.request.student.PatchStudentRequestDto;
import com.sungeon.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
    ResponseEntity<String> patchStudent(PatchStudentRequestDto dto);
    ResponseEntity<String> deleteStudent(Integer studentNumber);
}