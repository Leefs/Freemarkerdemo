FreemarkerDemo创建步骤：
====
### 1.创建一个Maven工程

### 2.在pom.xml文件夹下引入Freemarker的依赖Jar包

### 3.创建模版文件

#### 模版文件中四种元素：
1、文本，直接输出的部分  
2、注释，即<#--注释的内容-->  
3、插值(Interpolation):即${..}部分，将使用数据模型中的部分替代输出。  
4、FTL指令：FreeMarker指令，和HTML标记类似，名字前加#予以区分，不会输出。

### 4.创建一个main方法	(ider创建main方法快捷方式：psvm)

#### 业务逻辑：
1.创建一个配置对象  
2.设置模版所在的目录  
3.设置字符集  
4.获取模版对象  
5.创建数据模型（可以是对象，也可以是Map）  
6.创建一个输出流对象  
7.输出  
8.关闭out.  

###5.运行