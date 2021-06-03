package cn.wisefly.springboot_mybatis_demo.service;


import cn.wisefly.springboot_mybatis_demo.entity.Student;
import java.util.List;

public interface StudentService {

  /**
   * 获取全部用户数据
   */
  public List<Student> getStudentList();

  /**
   * 新增用户数据
   *
   * @param student
   */
  public void createStudent(Student student);

  /**
   * 新增用户数据
   *
   * @param sid
   * @return
   */
  public Student getStudent(Long sid);

  /**
   * 修改指定id用户信息
   *
   * @param sid
   * @param student
   */
  public void updateStudent(Long sid, Student student);

  /**
   * 删除指定id用户
   *
   * @param sid
   */
  public void deleteStudent(Long sid);
}
