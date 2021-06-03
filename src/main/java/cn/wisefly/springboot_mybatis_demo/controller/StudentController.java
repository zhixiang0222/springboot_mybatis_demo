package cn.wisefly.springboot_mybatis_demo.controller;

import cn.wisefly.springboot_mybatis_demo.entity.Student;
import cn.wisefly.springboot_mybatis_demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@Api(tags = "swagger测试")
public class StudentController {

  @Autowired
  StudentService studentService;

  /**
   * 获取所有学生信息
   *
   * @return
   */
  @GetMapping("/")
  @ApiOperation("获取所有学生信息")
  public List<Student> getStudentList() {
    return studentService.getStudentList();
  }

  /**
   * 新增学生信息
   *
   * @param student
   * @return
   */
  @PostMapping("/")
  @ApiOperation("新增学生信息")
  public String createStudent(@RequestBody Student student) {
    studentService.createStudent(student);
    return "新增成功";
  }

  /**
   * 根据学生id查询学生信息
   *
   * @param sid
   * @return
   */
  @GetMapping("/{sid}")
  @ApiOperation("根据学生id获取学生信息")
  @ApiImplicitParams(value =
      {@ApiImplicitParam(name = "sid", value = "主键", required = true)})
  public Student getStudent(@PathVariable("sid") Long sid) {
    return studentService.getStudent(sid);
  }

  /**
   * 根据id修改学生信息
   *
   * @return * @param student
   */
  @PutMapping("/{sid}")
  @ApiOperation("根据id修改学生信息")
  public String updateStudent(@RequestBody Student student) {
    studentService.updateStudent(null, student);
    return "修改成功";
  }

  /**
   * 根据id删除学生信息
   *
   * @param sid
   * @return
   */
  @DeleteMapping("/{sid}")
  @ApiOperation("根据id删除学生信息")
  @ApiImplicitParams(value =
      {@ApiImplicitParam(name = "sid", value = "主键", required = true)})
  public String deleteStudent(@PathVariable("sid") Long sid) {
    studentService.deleteStudent(sid);
    return "删除成功";
  }

}
