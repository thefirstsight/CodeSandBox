package com.chenming.chenmingojcodesandbox.controller;

import com.chenming.chenmingojcodesandbox.JavaCodeLatestSandbox;
import com.chenming.chenmingojcodesandbox.model.ExecuteCodeRequest;
import com.chenming.chenmingojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/index")
public class MainController {

    private static final String AUTH_REQUEST_HEADER = "auth";
    private static final String AUTH_REQUEST_SECRET = "secretKey";

    @Resource
    private JavaCodeLatestSandbox javaCodeLatestSandbox;

    @GetMapping("/health")
    public String Hello(){
        return "ok";
    }

    @PostMapping("/executeCode")
    ExecuteCodeResponse executeCode(@RequestBody ExecuteCodeRequest executeCodeRequest, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        if(executeCodeRequest == null){
            throw new RuntimeException("请求参数为空");
        }
        String header = httpServletRequest.getHeader(AUTH_REQUEST_HEADER);
        if(!AUTH_REQUEST_SECRET.equals(header)){
            httpServletResponse.setStatus(403);
            return null;
        }
        ExecuteCodeResponse executeCodeResponse = javaCodeLatestSandbox.executeCode(executeCodeRequest);
        return executeCodeResponse;
    }
}
