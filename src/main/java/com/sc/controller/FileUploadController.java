package com.sc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: sunchao
 * @Description: SpringBoot 文件上传
 * @Date: Create in 22:32 2019/12/18
 * @Modified By: sunchao
 */
@RestController //表示该类下的方法的返回值会自动做json格式的转换
public class FileUploadController {

    /**
     * 处理文件上传
     */
    @RequestMapping("/fileUploadController")
    public Map<String,Object> fileUpload(MultipartFile filename)
        throws Exception{
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("E:/" +2+".png"));
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("msg","ok");
        return map;
    }
}
