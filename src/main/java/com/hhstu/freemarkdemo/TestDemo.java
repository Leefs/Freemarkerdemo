package com.hhstu.freemarkdemo;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class TestDemo {

    public static void main(String[] args) throws IOException, TemplateException {
        //1.创建一个配置对象
        Configuration configuration = new Configuration(Configuration.getVersion());
        //2.设置模版所在的目录
        configuration.setDirectoryForTemplateLoading(new File("D:\\Web\\IDEA\\Freemarkerdemo\\src\\main\\resources"));
        //3.设置字符集
        configuration.setDefaultEncoding("utf-8");
        //4.获取模版对象
        Template tomplate = configuration.getTemplate("test.ftl");
        //5.创建数据模型（可以是对象，也可以是Map）
        Map map = new HashMap();
        map.put("name","大家好");
        map.put("message","李林超博客");
        //6.创建一个输出流对象
        Writer out = new FileWriter("D:\\Web\\IDEA\\Freemarkerdemo\\src\\main\\resources\\static\\test.html");
        //7.输出
        tomplate.process(map,out);
        //8.关闭out .
        out.close();
    }

}
