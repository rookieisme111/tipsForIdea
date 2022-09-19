package com.zhao.idea;

import java.util.ArrayList;
import java.util.Date;

/**
 * 1.向下新开一行，无论光标在这行的哪个位置 ctrl+shift+enter
 * 2.复制这一行到下一行 ctrl+d
 * 3.查看类的继承体系 ctrl+h    图形化展示 ctrl+alt+U
 * 4.快速打开Generate  alt+insert
 * 5.提示方法参数类型 ctrl+p
 * 6.查看类的结构 alt+7 或者 idea左下角的structure图标
 * 7.大小写切换 ctrl+shift+u
 * 8.生成try-catch等代码块 ctrl+alt+T
 * 9.抽取方法 ctrl+alt+M
 * 10.错误的快速定位 F2 或者 shift+F2
 * 11.查看近几次的复制内容并选择粘贴 CTRL+shift+V
 * 12.方法的调用层次 alt+F7 或者 ctrl+alt+h
 * 13.调试时，查看已有变量的值 alt+F8
 * 14，调试的快捷键 F8 SHIFT+F8 F7 CTRL+ALT+F7
 */
public class HelloWorld {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        // 自动补全类型及变量 快捷键 ctrl+alt+v 或者 alt+enter
        String zhao = "zhao";
        Date date = new Date();

        String s = zhao.substring(1, zhao.length());
        // 将要输出的内容后面加 .sout 或者 直接输入sout也可以生成完整的输出方法，不过要把内容填进参数

        System.out.println(zhao);

        ArrayList<Object> list = new ArrayList<>();
        System.out.println("Hello World!");
    }

    public void foo() {

        return;
    }

    public void foo2() {
        return;
    }
}
