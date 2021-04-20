package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学生表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-11 15:25:18
 */
@Data
@TableName("tb_student")
public class StudentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 班级名称
	 */
	private String classname;
	/**
	 * 性别
	 */
	private String sex;

}
