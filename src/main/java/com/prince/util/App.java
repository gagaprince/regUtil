package com.prince.util;

import com.prince.util.RegUtil.RegUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String myEmail = "wangzidongprince@163.com";
        String myPhone = "17701308857";
        String myBlog = "http://gagalulu.wang";
        String myWord = "我是中国人";

        RegUtil regUtil = RegUtil.getInstance();

        System.out.println(myEmail+" is "+regUtil.isEmail(myEmail));
        System.out.println(myPhone+" is "+regUtil.isPhone(myPhone));
        System.out.println(myBlog+" is "+regUtil.isHttp(myBlog));
        System.out.println(myWord+" is "+regUtil.isHanZi(myWord));

        System.out.println(myWord+" is "+regUtil.isAllNum(myWord));


    }
}
