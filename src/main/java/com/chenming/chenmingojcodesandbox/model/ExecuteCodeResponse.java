package com.chenming.chenmingojcodesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 沙箱响应值
 * 1. 输出值
 * 2. 接口信息
 * 3. 执行状态
 * 4。 判题信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExecuteCodeResponse {

    private List<String> outputList;

    private String message;

    private Integer status;

    private JudgeInfo judgeInfo;
}
