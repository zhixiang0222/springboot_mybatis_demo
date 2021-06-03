package cn.wisefly.springboot_mybatis_demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("学生实体类")
public class Student implements Serializable {

  @ApiModelProperty(value = "主键")
  private Long sid;

  @ApiModelProperty(value = "姓名")
  private String sname;

  @ApiModelProperty(value = "年龄")
  private Integer sage;
}
