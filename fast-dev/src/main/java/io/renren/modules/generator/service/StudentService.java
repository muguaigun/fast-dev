package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.StudentEntity;

import java.util.Map;

/**
 * 学生表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-11 15:25:18
 */
public interface StudentService extends IService<StudentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

