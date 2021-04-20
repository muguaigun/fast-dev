package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.BookEntity;

import java.util.Map;

/**
 * 书库
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-07-25 16:33:58
 */
public interface BookService extends IService<BookEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

