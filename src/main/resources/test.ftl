<html>
    <head>
        <title>李林超博客</title>
        <meta charset="utf-8">
    </head>
    <body>
        <#include "head.ftl">
        <#--李林超博客，这是一个注释-->
        ${name},欢迎来到${message}
        <hr/>
        <#--FTL指令演示-->

        <#--assign指令-->
        <#assign linkman="llc">
        联系人：${linkman}<br/>
        <#assign info={"mobile":"122334","address":"xxxx.xxxx"}>
        电话：${info.mobile}<br/>
        地址：${info.address}<br/>

        <#--if 指令-->
        <#if success=true>
            你已通过实名认证
            <#else>
            你未通过实名认证
        </#if>
        <br>
        <#-- list集合 -->
        <#list goodsList as goods>
            ${goods_index+1}商品名称：${goods.name} 商品价格：${goods.price}<br>
        </#list>

        <#--内建函数-->

        一共${goodsList?size}条记录<br>

        <#--将字符串转换成对象-->
        <#assign iteam="{'name':'zhangsan','address':'xxxx.xxxx'}">
        <#assign data = iteam?eval>
        姓名：${data.name} <br>
        地址：${data.address} <br>

        <#-- 日期 -->
        当前日期：${today?date}<br>
        当前时间：${today?time}<br>
        当前日期+时间：${today?datetime}<br>
        日期格式化：${today?string('yyyy年MM月')}<br>

        当前积分：${print}<br>
        当前积分：${print?c}<br>

        <hr>
        <#-- 【??】 判断当前变量是否存在 -->
        <#if aaa??>
            aaa变量存在${aaa}
            <#else>
            aaa变量不存在
        </#if>
        <br>
        ${bbb!'bbb不存在'} <#-- 当变量bbb不存在时用 【‘’】中的内容来替代这个值 -->

        <#-- 运算符-->
        <#if print gt 100>
            成功通过认证!!!
        </#if>

        <#if (print > 100)>
            成功通过认证2222!!!
        </#if>
    </body>
</html>