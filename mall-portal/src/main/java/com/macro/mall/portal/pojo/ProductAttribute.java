package com.macro.mall.portal.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductAttribute implements Serializable {
    public String key;
    public String value;
}
