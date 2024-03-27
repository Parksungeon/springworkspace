package com.sungeon.basic.service;

import org.springframework.http.ResponseEntity;

import com.sungeon.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
}
