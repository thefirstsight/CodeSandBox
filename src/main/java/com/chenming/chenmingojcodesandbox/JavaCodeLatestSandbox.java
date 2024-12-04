package com.chenming.chenmingojcodesandbox;

import com.chenming.chenmingojcodesandbox.model.ExecuteCodeRequest;
import com.chenming.chenmingojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * Java 原生代码沙箱实现
 */
@Component
public class JavaCodeLatestSandbox extends JavaCodeSandboxTemplate {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
