package com.algori.util;

import lombok.experimental.UtilityClass;

import java.util.Objects;

/**
 * @author cl
 * @version $Id: AssertUtils v 0.1 2019-01-10 17:21 cl Exp $$
 */
@UtilityClass
public class AssertUtils {

    public void notNull(Object obj,String message){
        Objects.requireNonNull(obj,message);
    }
}
