package com.ssy.contest;

/**
 *
 * 通过命令行输入一串字符，首先判断这些字符是否都为数字。
 * 如果其中有字符不是数字，那么直接在命令行上输出“用户输入的字符不都为数字，无法转换”，程序结束；
 * 如果用户输入的字符都为数字，那么将该数字转换为中文的大写表示（用户每次最多输入8个字符）。
 *
 * 输入输出示例：
 * 输入：1234567
 * 输出：一百二十三万四千五百六十七
 *
 * 输入：0001
 * 输出：一
 *
 * 输入：1001
 * 输出：一千零一
 *
 * 输入：1100
 * 输出：一千一百
 *
 * 输入：10100
 * 输出：一万零一百
 *
 * 输入：0010
 * 输出：十
 *
 * 输入：00000001
 * 输出：一
 *
 * 输入：10000001
 * 输出：一千万零一
 *
 * 输入：10000010
 * 输出：一千万零十
 *
 * 输入：10000100
 * 输出：一千万零一百
 *
 * 输入：11000000
 * 输出：一千一百万
 *
 * 输入：10100000
 * 输出：一千零十万
 *
 * 输入：10010000
 * 输出：一千零一万
 *
 *
 * 输入：10001000
 * 输出：一千万零一千
 *
 * 输入：a0045
 * 输出：用户输入的字符不都为数字，无法转换
 *
 * 输入：a
 * 输出：用户输入的字符不都为数字，无法转换
 */

public class NumberTransfer {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("未输入待转换数据！");
            return;
        }

        String input = args[0];

        if (input.length() > 8) {
            input = input.substring(0, 8);
        }

        String result = "";
        String[] numMapping = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String[] unitMapping = {"十", "百", "千", "万"};

        boolean inZero = false;

        for (int i = input.length() - 1; i >= 0; i--) {
             char singleChar = input.charAt(i);
             if (singleChar < '0' || singleChar > '9') {
                 System.out.println("输入不全都是数字，无法转换！");
                 return;
             }

             int digital = Integer.valueOf(singleChar + "");

             if (digital == 0) {
                 inZero = true;
             } else {
                 if (inZero) {
                     if (result.length() > 0) {
                         result = numMapping[0] + result;
                     }
                     if (i < input.length() - 4 && input.charAt(input.length() - 5) == '0' && !result.contains(unitMapping[3])) {
                         result = unitMapping[3] + result;
                     }
                 }
                 inZero = false;

                 int unitIndex = (input.length() - i - 2) % 4;
                 String unit =  unitIndex >= 0 ? unitMapping[unitIndex] : "";
                 String prefix = (unitIndex == 0 && digital == 1 ? "" : numMapping[digital]) + unit;
                 result = prefix + result;
             }
        }

        System.out.println(result);
    }
}
