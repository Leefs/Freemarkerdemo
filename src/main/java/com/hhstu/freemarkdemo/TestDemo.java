package com.hhstu.freemarkdemo;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

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
        map.put("success",true);
        map.put("today",new Date());

        map.put("print",1231232324);
        //list指令演示
        List goodsList = new ArrayList();
        Map goods1 = new HashMap();
        goods1.put("name","苹果");
        goods1.put("price",4.0);
        Map goods2 = new HashMap();
        goods2.put("name","香蕉");
        goods2.put("price",2.3);
        Map goods3 = new HashMap();
        goods3.put("name","葡萄");
        goods3.put("price",5.3);

        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);

        map.put("goodsList",goodsList);
        //6.创建一个输出流对象
        Writer out = new FileWriter("D:\\Web\\IDEA\\Freemarkerdemo\\src\\main\\resources\\static\\test.html");
        //7.输出
        tomplate.process(map,out);
        //8.关闭out .
        out.close();
    }

}
