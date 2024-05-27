package base;

//常用运算符
public class ope2 {
    public static void main(String[] args) {
        //赋值运算符 =
        int num1 = 10;
        int num2 = 20;
        int num3 = 10 + 20;

        //求和
        int sum = 0;
        sum = sum + num1;//sum = 10;
        sum = sum + num2;//sum = 10 + 20 = 30;
        sum = sum + num3;//sum = 30 + 30 = 60;

        System.out.println("和：" + sum);
    }
}
