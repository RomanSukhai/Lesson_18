package homework_02;

import java.util.Iterator;
import java.util.Scanner;


public class Main {
    public static void main(){
        System.out.println();
        System.out.println("_____________________________________________________________________");
        System.out.println("--->If you want add new object,please print:                --->    {1}");
        System.out.println("--->If you want delete something object by key :            --->    {2}");
        System.out.println("--->If you want delete something object by value:           --->    {3}");
        System.out.println("--->If you want print all key which own object:             --->    {4}");
        System.out.println("--->If you want print all value which own object:           --->    {5}");
        System.out.println("--->If you want print all object from the Class.map :       --->    {6}");
        System.out.println("--->If you want Exit from program :                         --->    {7}");
        System.out.println("_____________________________________________________________________");
        System.out.print("----->  ");

    }
    public static void main(String[] args) {
        Map s = new Map();
        Scanner sc = new Scanner(System.in);
        Main.main();
        while (true){
            int a = sc.nextInt();
            boolean flag = 0 < a && 8 > a;
            if (flag){
                switch (a){
                    case 1 :{
                        System.out.print("--->Key: ");
                        int b = sc.nextInt();
                        System.out.print("--->Value: ");
                        String v = sc.next();
                        s.add(new MyEntry(b,v));
                        Main.main();
                        break;
                    }
                    case 2 :{
                        System.out.print("--->Key: ");
                        int b = sc.nextInt();
                        s.removeKey(b);
                        Main.main();
                        break;
                    }
                    case 3 :{
                        System.out.print("--->Value: ");
                        String b = sc.next();
                        s.removeValue(b);
                        Main.main();
                        break;
                    }
                    case 4 :{
                        s.printAllKey();
                        Main.main();
                        break;
                    }
                    case 5 :{
                        s.printAllValue();
                        Main.main();
                        break;
                    }
                    case 6 :{
                        s.printAll();
                        Main.main();
                        break;
                    }
                    case 7 :{
                        System.out.println();
                        System.out.println("Buy,see you))...");
                        System.exit(0);
                    }
                }
            }else {
                System.out.println("Please,print correct your number,it is mistake");
                Main.main();
            }

        }

    }

}
