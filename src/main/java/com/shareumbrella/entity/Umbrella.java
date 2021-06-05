package com.shareumbrella.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

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
public class Umbrella implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer pid;


}
