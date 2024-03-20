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
        System.out.println(sandauga(c, d));

        System.out.println("<5 uzduotis>");
        int e = 0;
        int f = 30;
        System.out.println(random(e, f));

        System.out.println("<6 uzduotis>");
        int[] arr2 = arr(5, 10, 15);
        printArr(arr2);

        System.out.println("<7 uzduotis>");
        int[] arr3 = arr(5, 10, 15);
        int sum = arrSum(arr3);
        System.out.println(sum);

        System.out.println("<8 uzduotis>");
        int averageArr = arrSum(arr) / arr.length;
        System.out.println(averageArr);
        System.out.println(averageArr(arr));

        System.out.println("<9 uzduotis>");
        printsquare(5, 5);

        System.out.println("<10 uzduotis>");
        String sentence = "Siandien labai grazi diena";
        encodeText(sentence);

        System.out.println("<11 uzduotis>");
        System.out.println(reverseString("Eulalija"));

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

    public static int random(int e, int f) {
        return (int) (e + Math.random() * (f - e)); //5 uzduotis
    }

    public static int[] arr(int min, int max, int length) {
        int[] array = new int[length];
        for (int g = 0; g < length; g++) {
            array[g] = min - (int) Math.round(Math.random() * (max - min));
        }
        return array; //6 uzduotis
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum; //7 uzduotis
    }

    public static double averageArr(int[] arr) {
        return (double) arrSum(arr) / arr.length; //8 uzduotis
    }

    public static void printsquare(int num1, int num2) {
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("*");
            }
            System.out.println(); //9 uzduotis
        }
    }

    public static void encodeText(String sentence) {
        int countSpaces = 0;
        int countLetters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            sentence.charAt(i);
            if (sentence.charAt(i) == ' ') {
                countSpaces++;
            } else {
                countLetters++;
            }
        }
        System.out.println("Tekste yra " + countSpaces + " tarpu");
        System.out.println("Tekste yra " + countLetters + " raidziu");
    }

    public static String reverseString(String input) {
        char[] inputArray = input.toCharArray();
        char[] reverseArray = new char [inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            reverseArray[i] = inputArray[inputArray.length -1 - i];
        }
        String reversedString = new String (reverseArray);
        return reversedString;




        }
    }

