public class Main {
    public static void main(String[] args) {
        System.out.println("<1 uzduotis>");
        int a = 19;
        int b = 3;
        suma(10, 20);
        suma(a,b);

        System.out.println(Pisq());
    }
    public static void suma(int a, int b){
        int suma = a+b;
        System.out.println(suma);
    }

    public static double Pisq() {
        return 9.8596;
    }


    
}
