package base;

//算数运算符
public class ope1 {
    public static void main(String[] args) {
        //1.算数运算符
        //作用：1.表示正数 2.表示相加运算 3.字符串拼接
        System.out.println(+10);
        System.out.println(5 + 6);
        System.out.println("abc" + 1 + 6);
        //只要+左右两侧是字符串，那么结果一定 是字符串
        //++自增
        int a = 5;
        a++;
        ++a;
        System.out.println(a);
        //无论++放在变量前还是变量后，都是+1操作

        //如果自增在表达式中
        a = 5;
        int m = a++ + 7;//若++在变量后面，先运算，后加1：m = a + 7;a + 1;
        System.out.println(a);
        System.out.println(m);
        a = 5;
        int n = ++a + 7;//若++在变量前面，先加1，再运算：a + 1; n = a + 7;
        System.out.println(a);
        System.out.println(n);

    }
}
