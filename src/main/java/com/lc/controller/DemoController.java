package com.lc.controller;


import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestController
public class DemoController {

       org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());



    @RequestMapping("/demo")
    public void demo(){

                StringBuffer str=new StringBuffer();
                str.append("hello world!");
                str.append("don't touch ");
                str.append("this is my bottle!~");

                export(str.toString());


    }



    public  Object export(String str){

        BufferedOutputStream buff = null;

        try {
            buff.write(str.getBytes("UTF-8"));
            buff.flush();
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("文件写入出现异常！！！");
        }


        return "";
    }


}
