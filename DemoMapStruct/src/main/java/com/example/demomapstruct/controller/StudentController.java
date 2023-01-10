package com.example.demomapstruct.controller;

import com.example.demomapstruct.dto.StudentDTO;
import com.example.demomapstruct.entity.Student;
import com.example.demomapstruct.service.StudentService;
import com.example.libs.controller.AbstractController;
import com.example.libs.payload.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController extends AbstractController<Student, StudentDTO> {

    @Autowired
    public StudentController(StudentService studentService) {
        super(studentService);
    }

    @GetMapping("/{id}")
    public BaseResponse getOne(@PathVariable Long id) {
        return BaseResponse.builder()
                .data(((StudentService) super.getAbstractService()).getOne(id))
                .code("OK")
                .message("")
                .build();
    }

//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(StudentNotFoundException.class)
//    public void studentNotFoundHandler() {
//
//    }
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public BaseResponse studentNotFoundHandler() {
//        return BaseResponse.builder()
//                .code("404")
//                .message("Student is not found")
//                .build();
//    }

    private void test(){

    }
}
