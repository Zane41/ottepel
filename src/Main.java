import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        for (int i = 0; i < m.length; i++) {
            if (sravn(m[i], 0))
                countPlusTemp++;
            else {
                if (countPlusTemp > returningValue1){
                    returningValue1 = countPlusTemp; countPlusTemp=0;
                }
            }
            if (i==m.length-1)
                if (sravn(m[i], 0)) {
                    returningValue1 = countPlusTemp;
                }
                else {
                    if (countPlusTemp > returningValue1){
                        returningValue1 = countPlusTemp; countPlusTemp=0;
                    }
                }
        }
        return returningValue1;
    }

    public static boolean sravn(int x, int y) {
        return x > y;
    }


}