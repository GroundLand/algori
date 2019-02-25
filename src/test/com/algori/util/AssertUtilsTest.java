package com.algori.util;

import org.junit.Test;

/**
 * @author cl
 * @version $Id: AssertUtilsTest v 0.1 2019-01-10 17:24 cl Exp $$
 */
public class AssertUtilsTest {

    @Test
    public void notNull(){
        AssertUtils.notNull(null,"空值");
    }
}
