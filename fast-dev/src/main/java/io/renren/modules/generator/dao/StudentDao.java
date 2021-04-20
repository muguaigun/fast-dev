package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.StudentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学生表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-11 15:25:18
 */
@Mapper
public interface StudentDao extends BaseMapper<StudentEntity> {
	
}
