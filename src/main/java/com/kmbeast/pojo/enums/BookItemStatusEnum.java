package com.kmbeast.pojo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.security.PrivateKey;

/**
 * 馆藏书目状态枚举
 */
@Getter
@AllArgsConstructor
public enum BookItemStatusEnum {

   STATUS_1(1, "在馆"),
   STATUS_2(2, "借出"),
   STATUS_3(3, "损坏"),
   STATUS_4(4, "丢失");

    private final Integer status;
    private final String desc;
}