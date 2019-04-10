package com.hismartinfo.flume;

import org.apache.flume.event.EventBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {


    public static void main(String[] args) {
        String str = "<129>3. 配置网站时可写的目录不要赋予执行权限，可执行的目录不要赋予写入权限。#WAFSPLIT#检测#WAFSPLIT#GET#WAFSPLIT#http://ggw.tongji.edu.cn/index.php/list/js/images/kindeditor/themes/59/userfiles/download/2013/1/24/themes/59/template/css/index.php?classid=1100<129>WAF Mar28 13:50:08:ALERT#WAFSPLIT#WAF0HW106804#WAFSPLIT#2019-3-28 13:50:8#WAFSPLIT#42.120.161.71#WAFSPLIT#28500#WAFSPLIT#192.168.66.4#WAFSPLIT#80#WAFSPLIT#上传目录存在脚本文件#WAFSPLIT#脚本执行#WAFSPLIT#中#WAFSPLIT#防止访问如upload/1.php等在网站上传和备份目录中的脚本文件，黑客一般利用上传、备份和图片目录具有写权限的特性来写入脚本木马Webshell是一种脚本木马后门，黑客在入侵网站后，常常将这些1. 根据入侵记录的URL，查找和删除对应的Webshell文件；2. 对网站进行全面检查，清理后门，修补漏洞；3. 配置网站时可写的目录不要赋予执行权限，可执行的目录不要赋予写入权限。#WAFSPLIT#1. 根据入侵记录的URL，查找和删除对应的Webshell文件；2. 对网站进行全面检查，清理后门，修补漏洞；" +
                "\n" +
                "\n" +
                "<129>123\n";


        Pattern compile = Pattern.compile("<129>");
        System.out.println(compile.flags());

        System.out.println(Pattern.MULTILINE);

        Matcher m = compile.matcher(str);
        int start = -1;

        while(m.find()){
            if(start == -1){
                start = m.start();
                continue;
            }

            String substring = str.substring(start,m.start());
            System.out.println(substring);

            System.out.println("----------------\n");

            start = m.start();
        }

    }
}
