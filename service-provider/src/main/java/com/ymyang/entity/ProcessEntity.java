package com.ymyang.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_process_202012")
public class ProcessEntity {

    @TableId
    private Integer id;

    private String department;

    private String processNo;

    private String processName;

    private String nodeName;

    private String approver;

    private String receiveTime;

    private String dealTime;

    private BigDecimal consumeTime;
}
