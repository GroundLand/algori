package com.algori.util;

import lombok.experimental.UtilityClass;

/**
 * @author cl
 * @version $Id: StringUtils v 0.1 2018-12-29 15:40 cl Exp $$
 */
@UtilityClass
public class StringUtils {


    public String[] splitString(String str,String sep){
        if (str==null || sep==null){
            return null;
        }
        return str.split(sep);
    }

}
