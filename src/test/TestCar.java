package test;

/**
 * @author fanmw
 * @create 2021-06-25 12:19
 * // 1.杭州存在一个区域号牌限行的规则，在一些时间段内，“区域号牌”的车辆无法驶入限行区
 * // 2.给定车当前坐标x,y，给限行规则描述： 1.区域号牌限行区，2.限行区   (假定都是正方形)
 *
 * // 3.不同限行区限行时段也不同。
 *
 * // 4.判断这个车有没有违反限行规则
 * // 浙A区域号牌的组合方式：浙A后的第2、5位或第3、4位均为字母，其余为数字
 * // public boolean checkCarValid(int x, int y, String carNo);
 */
public class TestCar {
    public static void main(String[] args) {
        String a = "abcdfg";
        System.out.println(a.substring(2));
    }
//    public boolean checkCarValid(int x, int y, String carNo){
//
//        /*
//            1.获取当前限行区及限行类型
//            2.获取当前限行区的限行时间
//            3.判断当前时间是否在限行时间内
//            4，if (在)
//                4.1 判断 当前车是否为区域限行车
//                    4.1.1 若判断为true,说明该区域限行车，在限行区范围内行驶，违规返回false
//                    4.1.2 若结果为false，说明该车为普通车，
//            5. if(不在)  返回true
//         */
//
//        //判断是否在为限行时间
//        //获取当前时间
//        LocalDateTime now = LocalDateTime.now();
//
//        // 判断是否为区域好牌
//        String tempCN = carNo.substring(2);
//        char c2 = tempCN.charAt(1);
//        char c3 = tempCN.charAt(2);
//        char c4 = tempCN.charAt(3);
//        char c5 = tempCN.charAt(4);
//        if(checkChar(c2)&&checkChar(c5)||checkChar(c3)&&checkChar(c4)){
//            //当前车为区域限行车
//        }else{
//            //当前车为普通车
//        }
//
//        //判断该车是否在限行区域
//        //获取限行区域横纵坐标  （-X,X） (-Y,Y)
//        if((x>-X&&x<X)&&(y>-Y&&y<Y))  //该车在限行区域
//        else //不在限行区域
//
//
//
//        return false;
//    }
//    private boolean checkChar(char c){
//        //判断c是否在字母范围内    c>'a'&&c<'z'||c>‘A’&&c<'Z'
//        return true;
//    }
}
