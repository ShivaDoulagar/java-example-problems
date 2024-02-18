package exam;

public class type_conversion {
    public static void main(String[] args) {
        float a= 4;
        float b= 5;//here the values of a and b are 4.0 and 5.0
        int c = (int) ((int)a*b);//type conversion
        System.out.println(c);//here the float will be converted to int
    }
}
