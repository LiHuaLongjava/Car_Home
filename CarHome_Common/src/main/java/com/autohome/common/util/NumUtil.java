package com.autohome.common.util;

import java.util.Random;

/**
 * @program: OpenMain
 * @description:
 * @author: Jerry(姜源)
 * @create: 2020-07-28 17:15
 */
public class NumUtil {
    /**
     * 生成指定位数的随机数 - 10的次幂运算控制位数
     *
     * @param len 随机数长度
     * @return 指定位数的随机数
     */
    public static int createNum(int len) {
        Random random = new Random();
        //  len = 4
        //  max = 10^4 即 10000 - 10^3 即 1000 = 9000
        int max = (int) (Math.pow(10, len) - Math.pow(10, len - 1));
        // random.nextInt() 前开后闭
        // 0~8999 + 1000 = 1000~9999
        return random.nextInt(max) + (int) Math.pow(10, len - 1);
    }

    // test
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            int num = createNum(4);
            System.out.println("num1 = " + num);
        }
    }
}
