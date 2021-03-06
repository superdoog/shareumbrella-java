package com.shareumbrella.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Point implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer pid;

    private String pname;

    private Integer stock;


}
