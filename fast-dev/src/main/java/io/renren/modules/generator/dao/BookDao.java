package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.BookEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 书库
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-07-25 16:33:58
 */
@Mapper
public interface BookDao extends BaseMapper<BookEntity> {
	
}
