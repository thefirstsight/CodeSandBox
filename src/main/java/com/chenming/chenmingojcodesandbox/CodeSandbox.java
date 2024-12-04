package com.chenming.chenmingojcodesandbox;


import com.chenming.chenmingojcodesandbox.model.ExecuteCodeRequest;
import com.chenming.chenmingojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
