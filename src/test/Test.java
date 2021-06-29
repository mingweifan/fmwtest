package test;

/**
 * @author fanmw
 * @create 2021-06-23 19:07
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }
    public int calc(String a, String b)  {
        long a2 = 0;
        long b2 = 0;

        try {
            String aa = new StringBuffer(a).reverse().toString();
            String bb = new StringBuffer(b).reverse().toString();

            if(aa.endsWith("-")){

                aa = aa.split("-")[0];
                aa = "-"+aa;
            }
            if(bb.endsWith("-")){
                bb = bb.split("-")[0];
                bb = "-"+bb;
            }

            a2 = Long.parseLong(aa);
            b2 = Long.parseLong(bb);
        }catch (Exception e){
            System.out.println("数据数据有误！");
            return -1;
        }


        return a2+b2>Integer.MAX_VALUE||a2+b2<Integer.MIN_VALUE?0:(int)(a2+b2);
    }
}
