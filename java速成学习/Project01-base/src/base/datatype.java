package base;

//基础数据类型
public class datatype {
    public static void main(String[] args) {
        //1.整数数据类型
        byte a = 18;//范围 -128~127
        short b = 20;//范围：正负三万
        int c = 30;//范围：正负21亿
        long d = 403213131321313L;//范围：正负2^63,超过int类型范围就要加L。
        //2.浮点类型
        float e = 3.14f;//float后要加f
        double f = 3.14;
        //3.字符型
        char g = 'a';//单引号引起来的单个字符
        System.out.println("hello");//字符串多个单字符拼接而成的
        //4.布尔类型
        boolean flag = true;//布尔类型只有两个：true、false
    }
}
