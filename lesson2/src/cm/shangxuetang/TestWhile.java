package cm.shangxuetang;

public class TestWhile {
    public static void main(String[] args) {
        int i =0;
        int sum =0;
        int evenSum =0;
        int oddSum =0;
        while(i<=100){

            sum +=i;
            if(i%2==0)
            {
                evenSum +=i;//偶数和
            }else
            {
                oddSum +=i;//奇数和
            }

            i++;
        }
        System.out.println("sum="+sum);
        System.out.println("evenSum="+evenSum);//偶数和
        System.out.println("oddSum="+oddSum);//奇数和
        int n = 0;
        System.out.println("number can be divided by 5:");
        while (n<=120)
        {


            if(n%5==0)
            {
                System.out.print("\t"+n);
            }
            n++;
        }
        //each row print 7
        System.out.println();
        int n1=0;
        while(n1<=130)
        { System.out.print("\t"+n1);
            if((n1+1)%7==0)//通过判断6，13 ，更加合理一点
            {
                System.out.println();
            }

            n1++;
        }
        //两种方式打印a-z字母
        System.out.println();
            for (char ch='a';ch<='z';ch++){
                System.out.print(ch+"\t");
            }
        System.out.println();
            char ch = 'a';
            for(int d =0;d<26;d++){
                System.out.print((char)(ch+d)+"\t");
            }
            //正三角乘法表
        System.out.println();
            for (int p=1;p<=9;p++) {
                for(int j=1;j<=p;j++){
                    System.out.print(p+"*"+j+"="+p*j+'\t');
                }
                System.out.println();

            }
            //倒三角乘法表
        System.out.println();
        for (int p=1;p<=9;p++) {
            for(int j=9;j>=p;j--){
                System.out.print(p+"*"+j+"="+p*j+'\t');
            }
            System.out.println();

        }
      /*    打印以下内容
       *     * # * # *
       *     # * # * #
       *     * # * # *
       *     # * # * #
       *     * # * # *
       */
       for (int r=1;r<6;r++){
           for (int c=1;c<6;c++){
               if((r%2==0)||(c%2==0)){
                   System.out.print("*"+'\t');
               }else
               {
                   System.out.print("#"+'\t');
               }
           }
           System.out.println();
       }

       //第二种方法
        System.out.println();
        for (int r1=1;r1<=5;r1++){
            for(int c1=1;c1<=5;c1++){
                if((r1+c1)%2==0){
                    System.out.print("#"+"\t");
                }else{
                    System.out.print("*"+"\t");
                }
            }
            System.out.println();
        }
        //Math.round

        int total=0;
        int num;
        while(true){
            total++;
           num = (int)Math.round(100*Math.random());
            if(num==10){
                break;
            }
        }
        System.out.println("number is "+num);
        System.out.println("program proceed"+total+"times");
    }
}
