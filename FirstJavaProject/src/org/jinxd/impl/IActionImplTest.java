package org.jinxd.impl;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by jinxd on 2016/5/28.
 */
public class IActionImplTest {
    @Test
    public void testIA() {
        IActionImpl ia=new IActionImpl();

        TestCase.assertEquals(11,ia.add(3,8));
    }


}