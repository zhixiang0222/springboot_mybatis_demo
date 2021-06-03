package cn.wisefly.springboot_mybatis_demo.mapper;

import cn.wisefly.springboot_mybatis_demo.entity.Student;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StudentMapper {

  //新增学生信息
  @Insert("insert into student(sname,sage) values(#{sname},#{sage})")
  public void save(Student student);


  //修改学生信息
  @Update("update student set sname=#{sname},sage=#{sage} where sid=#{sid}")
  public void update(Student student);

  //删除学生信息
  @Delete("delete from student where sid=#{sid}")
  public void delete(Long sid);

  //查询所有学生信息
  @Select("select * from student")
  public List<Student> getAll();


  //查询一个学生信息
  @Select("select * from student where sid=#{sid}")
  public Student findOne(Long sid);

}

