import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-10
 * Time: 23:31
 */
public class 面5替换空格 {
    public String main(String s) {
        if(s ==null){
            return null;
        }
        StringBuffer str = new StringBuffer(s);//设置s为一个可修改的字符串
        int lengthy =s.length();//原始字符串的长度
        int bankNum = 0;//定义空格的个数
        for (int i = 0; i <lengthy ; i++) {
            if(str.charAt(i) == ' ') {
                bankNum++;//求出空格的个数；
            }
        }
        //定义两个指针
//todo:待看
        int oldStr = lengthy - 1;//旧指针
        lengthy += 2 * bankNum;
        int newStr = lengthy - 1;//新指针
        str.setLength(lengthy);
        while(bankNum > 0 && newStr >= 0){
            char ch = str.charAt(oldStr--);
            if(ch == ' '){
                str.setCharAt(newStr--,'0');
                str.setCharAt(newStr--,'2');
                str.setCharAt(newStr--,'%');
                bankNum--;
            }
            else{ str.setCharAt(newStr--,ch); }
        }

        return str.toString();
    }
        // write code here
        /*
        第一种方法
        if(s ==null || "".equals(s)){
           return s;
        }
        return s.replaceAll(" ","%20");
    }

         */
/*
第二种方法：
            StringBuilder sb = new StringBuilder();
            if (s == null || "".equals(s))
                return s;
            String[] strs = s.split("");
            for (String str : strs) {
                if (" ".equals(str))
                    sb.append("%20");
                else
                    sb.append(str);
            }
            return sb.toString();
        }

 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            String str = sc.nextLine();
//        }
//    }
    }

