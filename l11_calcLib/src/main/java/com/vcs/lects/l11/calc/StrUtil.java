/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l11.calc;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author owr
 */
public class StrUtil {

    public boolean isItNumberX10(String txt) {
        txt += txt + "0";
        return StringUtils.isNumericSpace(txt);

    }

}
