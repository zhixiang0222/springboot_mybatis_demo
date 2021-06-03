package cn.wisefly.springboot_mybatis_demo.service.impl;

import cn.wisefly.springboot_mybatis_demo.entity.Student;
import cn.wisefly.springboot_mybatis_demo.mapper.StudentMapper;
import cn.wisefly.springboot_mybatis_demo.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentMapper studentMapper;

  @Override
  public List<Student> getStudentList() {
    return studentMapper.getAll();
  }

  @Override
  public void createStudent(Student student) {
    studentMapper.save(student);
  }

  @Override
  public Student getStudent(Long sid) {
    return studentMapper.findOne(sid);
  }

  @Override
  public void updateStudent(Long sid, Student student) {
    // student.setSid(sid);
    studentMapper.update(student);
  }

  @Override
  public void deleteStudent(Long sid) {
    studentMapper.delete(sid);
  }
}
