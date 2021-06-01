package com.shareumbrella.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lv
 * @since 2021-05-26
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Point implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "pid", type = IdType.AUTO)
      private Integer pid;

    private String pname;

    private Integer stock;


}
