package com.xcl.entity;

import lombok.Data;

import java.util.List;

@Data
public class RespPageEntity {
    private List<?> data;
    private Long total;
}
