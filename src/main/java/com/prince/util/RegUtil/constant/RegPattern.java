package com.prince.util.RegUtil.constant;

/**
 * Created by gagaprince on 15-12-12.
 */
public class RegPattern {
    //邮箱
    public static final String EMAIL_PATTERN="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    //邮政编码
    public static final String POSTCODE_PATTERN="^\\d{6}$";
    //手机电话
    public static final String PHONE_PATTERN="^\\d{7,11}$";
    //手机格式电话
    public static final String PHONE_FORMAT_PATTERN="^(\\(\\d{3,4}-)|\\d{3.4}-)?\\d{7,8}$";
    //http地址
    public static final String INTERNET_URL_PATTERN="^http://([/\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
    //身份证
    public static final String ID_PATTERN="^\\d{15}|\\d{18}$";
    //全是数字
    public static final String ALL_NUM_PATTERN="^\\d{0,}$";
    //全是汉字
    public static final String ALL_HANZI_PATTERN="^[\\u4e00-\\u9fa5]{0,}$";
}
