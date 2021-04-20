package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 书库
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-07-25 16:33:58
 */
@Data
@TableName("tb_book")
public class 	BookEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Integer id;
	/**
	 * 书名
	 */
	private String name;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 数量
	 */
	private Integer num;
	/**
	 * 上架时间
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern= "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private Date addtime;
	/**
	 * 备注
	 */
	private String bak;

}
