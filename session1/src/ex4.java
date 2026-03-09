public class ex4 {
    public static void main(String[] args){
        int a = 456;
        int b = 123;

        float tong, hieu, tich, thuong, so_du;

        tong = a+b;
        hieu = a-b;
        tich = a*b;
        thuong = (float) a/b;
        so_du = a%b;

        System.out.printf("a+b = %.2f %n",tong);
        System.out.printf("a-b = %.2f %n",hieu);
        System.out.printf("a*b = %.2f %n",tich);
        System.out.printf("a/b = %.2f %n",thuong);
        System.out.printf("a%%b = %.2f",so_du);
    }
}
