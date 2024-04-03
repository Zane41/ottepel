import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введи длину массива");
        Scanner vvod = new Scanner(System.in);
        int l = vvod.nextInt();
        System.out.println("Введи массив");
        int[] mass1 = new int[l];
        for (int i = 0; i < l; i++) {
            mass1[i] = vvod.nextInt();
        }
        System.out.println("Самая длинная оттепель длилась " + printFromX(mass1));
    }
    public static int printFromX(int[] m) {
        int returningValue1 = 0;
        int countPlusTemp=0;
        for (int i = 0; i < m.length-1; i++) {
            if (sravn(m[i], 0))
                countPlusTemp++;
            else {
                if (countPlusTemp >= returningValue1) {
                    returningValue1 = countPlusTemp;
                    countPlusTemp = 0;
                }
            }
        }
        for (int j = m.length-1; j <m.length ; j++) {
            if (sravn(m[j], 0))
                countPlusTemp++;
                if (countPlusTemp > returningValue1){
                returningValue1 = countPlusTemp;
            }
            else {
                if (countPlusTemp >= returningValue1)
                    returningValue1 = countPlusTemp;
            }
        }
        return returningValue1;
    }
    public static boolean sravn(int x, int y) {
        return x > y;
    }
}