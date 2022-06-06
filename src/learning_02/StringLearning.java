package learning_02;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        /*
        Khai báo dữ liệu: Java heap & String pool
        Có hai cách khái báo -> lưu trữ bộ nhớ khác nhau
         */
        //Khai báo tường minh
        String myname = "Teo";  // Literal declaration: Khai báo tường minh
        String myname1 = "Teo";
        String myname2 = new String("Teo"); //Via String Object

        System.out.println("myname === myname1: " + (myname == myname1));
        System.out.println("myname === myname2: "+ (myname == myname2));

        //Check lowercase, uppercase, digit...
        /*
        Huong giai quyet:
        1. Có 3 biến đếm
        2. Xét từng kí tự. Vòng lặp Cứ gặp 1 kí tụ thì + biến đếm lên 1 đơn vị
        3. Xét nếu 1 trong 3 biến đếm đó bằng =0 thì password không valid. Để vaild thì cả ba biến đếm phải #0
         */
        String myPassword = "123Password";
        char[] myCharacter = myPassword.toCharArray(); // Bien chuoi thanh ki tu
        int totalDigit = 0;
        int totalUpperCase = 0;
        int totalLowerCase = 0;

        for (char character : myCharacter) {
            if(Character.isDigit(character))totalDigit++;
            else if(Character.isUpperCase(character)) totalUpperCase++;
            else if(Character.isUpperCase(character)) totalLowerCase++;

        }
        if(totalDigit >0 && totalUpperCase > 0 && totalLowerCase >0) {
            System.out.println("You are all set");
        }else{
            System.out.println("Password format is wrong");
        }

        //Imutable: Xử lý chuỗi nào thì phải có chuỗi mới thay vào. chứ nó không thay đổi chuỗi cũ
        String badWordContainer = "       bad, very bad, sthing else, bad";
        String filterSrt = badWordContainer.replace("bad","b**");
        System.out.println(badWordContainer);
        System.out.println(filterSrt);

        //Trim: remove những khoảng trắng ở phía đầu và phía sau
        System.out.println(badWordContainer);
        System.out.println(badWordContainer.trim());

        // Substring ; IndixOf ; slipt
        String url = "https://google.com";
        System.out.println(url.indexOf("w"));
        System.out.println(url.indexOf("h"));
        System.out.println(url.indexOf("https"));

        System.out.println(url.substring(0, 3));
        System.out.println(url.substring(2, url.length()));

        //split
        String[] sliptString = url.split("");
        System.out.println(Arrays.toString(sliptString));

        //Regex | Regular Expression

        String mycookingTimes = "   105 mins   ";

        //TODO: Pattern and Matcher

        String coookingTimeNumStr = mycookingTimes.replaceAll("[^0-9]","" );
        System.out.println(coookingTimeNumStr);

        System.out.println(Integer.valueOf(coookingTimeNumStr)); // In ra con so 105 trong chuoi coookingTimeNumStr
        int Cookingtime = Integer.valueOf(coookingTimeNumStr);
        System.out.println(Cookingtime +1);
        System.out.println("Cooking Time is: " + Cookingtime + 1); //  ham print ln: Chuyển từng thành phần thành String phía sau dấu +, chứ không phải tính toán .-> Muốn tính toán thì bao ngoặc tròn lại

        //Concatenation
        String s1 = "Hello;" ;
        String s2 = "Teo";
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        //StringBuilder




    }
}
