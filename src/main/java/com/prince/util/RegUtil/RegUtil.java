package com.prince.util.RegUtil;

import com.prince.util.RegUtil.constant.RegPattern;
import com.prince.util.RegUtil.matcher.Gmatcher;

/**
 * Created by gagaprince on 15-12-12.
 */
public class RegUtil {
    private RegUtil(){}
    public static RegUtil instance;
    public static RegUtil getInstance(){
        if (instance==null){
            instance = new RegUtil();
        }
        return instance;
    }

    public boolean isEmail(String des){
        return isMatch(RegPattern.EMAIL_PATTERN,des);
    }

    public boolean isPostCode(String des){
        return isMatch(RegPattern.POSTCODE_PATTERN,des);
    }

    public boolean isPhone(String des){
        return isMatch(RegPattern.PHONE_PATTERN,des);
    }

    public boolean isPhoneFormat(String des){
        return isMatch(RegPattern.PHONE_FORMAT_PATTERN,des);
    }

    public boolean isHttp(String des){
        return isMatch(RegPattern.INTERNET_URL_PATTERN,des);
    }

    public boolean isIDcard(String des){
        return isMatch(RegPattern.ID_PATTERN,des);
    }

    public boolean isHanZi(String des){
        return isMatch(RegPattern.ALL_HANZI_PATTERN,des);
    }

    public boolean isAllNum(String des){
        return isMatch(RegPattern.ALL_NUM_PATTERN,des);
    }

    private boolean isMatch(String pattern,String des){
        Gmatcher gMatcher = new Gmatcher(pattern,des);
        return gMatcher.isMatch();
    }
}
