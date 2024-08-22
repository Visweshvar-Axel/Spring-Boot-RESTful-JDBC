package com.mysql.MysqlStarterWeb.controller;

import com.mysql.MysqlStarterWeb.domain.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/* *
- /api/vl/students [GET]: Fetch all the students
- /api/vl/students (POST): Add a new student
- /api/vl/students/{id} (GET): Fetch the details of a student
- /api/vl/students/{id) [PUT]: Update the details of a student
- /api/vl/students/{id} (DELETE): Delete the student.
 * */
@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public StudentController(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent() {
        return ResponseEntity.ok().body(null);
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<List<Student>> getStudent(@PathVariable Long id) {
        return ResponseEntity.ok().body(null);
    }

    @PostMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent(@RequestBody Student student) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<List<Student>> getAllStudent(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
