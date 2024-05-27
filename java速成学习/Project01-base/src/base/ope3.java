package base;

//关系运算符
public class ope3 {
    public static void main(String[] args) {
        //关系运算符 ==，最终结果为布尔值，true或者false
        System.out.println(5 == 6);
        System.out.println(5 == 5);
        System.out.println("_________________________");
        //逻辑运算符：逻辑运算符左右连接的是布尔值
        // &&逻辑（或运算）：若俩个都为true结果为true，有一个false则为false
        System.out.println(true&&false);
        System.out.println(true&&true);
        System.out.println(false&&false);
        System.out.println(false&&true);
        System.out.println("_________________________");
        // ||逻辑（与运算）：有一个为true结果为true，两个都为false结果则为false
        System.out.println(true||false);
        System.out.println(true||true);
        System.out.println(false||false);
        System.out.println(false||true);
    }
}
