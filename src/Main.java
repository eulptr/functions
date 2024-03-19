public class Main {
    public static void main(String[] args) {
        System.out.println("<1 uzduotis>");
        int a = 19;
        int b = 3;
        suma(10, 20);
        suma(a, b);

        System.out.println("<2 uzduotis>");
        System.out.println(Pisq());

        System.out.println("<4 uzduotis>");
        int[] arr = {6, 5, 7, 8};
        printArr(arr);

        System.out.println("<3 uzduotis>");
        int c = 4;
        int d = 4;
        System.out.println(sandauga(c,d));

        System.out.println("<5 uzduotis>");
        int e = 0;
        int f = 30;
        System.out.println(random(e,f));

        System.out.println("<6 uzduotis>");
        System.out.println(Arr(5, 10, 15));

    }

    public static void suma(int a, int b) {
        int suma = a + b;
        System.out.println(suma); //1 uzduotis
    }

    public static double Pisq() {
        return 9.8596; //2 uzduotis
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //4 uzduotis
        }
        System.out.println();
    }

    public static int sandauga(int c, int d) {
        int sandauga = (c * d);
        return sandauga; //3 uzduotis

    }

    public static int random (int e, int f){
        return (int) (e + Math.random() * (f-e)); //5 uzduotis
    }

public static int[] Arr (int min, int max, int length) {
        int [] array = new int[length];
    for (int g = 0; g < length; g++) {
        array [g] = min - (int)Math.round(Math.random()) * (max - min);
    }
    return array;
}



}
