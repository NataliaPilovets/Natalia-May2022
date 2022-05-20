package com.academy.natalia;

public class Homework1 {
    public static void main (String[] args) {

        /*Task 1: Weight*/

        double gMoon;
        double myWeight;
        double gEarth;

        myWeight = 53.0;
        gEarth = 9.8;

        System.out.println("The force of gravity of the Moon is 16% of that on the surface of the Earth:");

        gMoon = gEarth * 0.16;
        System.out.println("Задача 1: ");
        System.out.println("Мой вес на Земле равен: " + myWeight * gEarth + " N");
        System.out.println("Мой вес на Луне равен: " + myWeight * gMoon + " N");

           }
}

/*Task 2: 10% increment of the array element*/

class Arrays {
    public static void main(String[] args) {

        System.out.println("Задача 2: ");

        int[] array1 = new int[10]; //create array of 10 elements 0 - 9
        System.out.println(array1.length);
        for (int i = 0; i < array1.length; i++) {

            {
                array1[i] = i + 10; //
                System.out.println(array1[i]);
            }
                   }
    }
}

/*Task 3: com.academy.natalia.Polindrom*/

class Polindrom {
    public static void main(String args[]){
        int r,sum=0,temp;
        int inputNumber=454;   // parameter to be checked for palindrome

        temp=inputNumber;
        while(inputNumber>0){
            r=inputNumber%10; // calculate last number
            sum=(sum*10)+r; // 4 // 5
            inputNumber=inputNumber/10; // 45 // 4
        }
        if(temp==sum)
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
    }
/*Task 4:  even numbers from 1 to 100 use remainder of the division*/

class EvenNumbers{
   public static void main(String args[]){
       int[] array= new int[100];
       for (int i = 1; i <= 100; i++){
           if (i % 2 == 0)
           System.out.print(i+"  ");
             }
   }
}
/*Task 5:  odd numbers from 1 to 100 use remainder of the division*/

class Oddnumbers{
    public static void main(String args[]){
        int[] array= new int[15];
        for (int i = 1; i <= 15; i++){
            if (i % 2 > 0)
                System.out.print(i+"  ");
        }
    }
}
/*Task 6:  even numbers from 1 to 100 without use remainder of the division*/

class Evennumberstwo {
    public static void main(String args[]){
        int[] array= new int[101];
        for(int i=2; i<=100; i=i+2){
            i=i+array[i];
            System.out.print(i+"  ");
                        }
    }
}
/*Task 7:  sum of numbers from 20 to 200*/
class Sumofnumbers {
    public static void main(String args[]) {
        int[] array = new int[201];
        int sum = 0;
        for (int i = 20; i <= 200; i++) {
            sum += i;
                    }
        System.out.println("Sum of elements of the array from 20 to 200 is " + sum);
    }
}

/*Task 8: Name of month*/



/*Task 9: Change of values of two variables*/
class TwoVariables {
    public static void main(String args[]) {
        int a = 10;
        int b = 50;
        // меняем местами пошагово
        a = a + b;
        b = a - b;
        a = a - b;
        // меняем местами в одну строчку.
        a = a + b - (b = a);

        System.out.println ("Новое значение переменной а = " + a);
        System.out.println ("Новое значение переменной b = " + b);
    }
}
/*Task 10: Sum of two variables*/

class SumTwoVariables {
    public static void main(String args[]) {
        int a = 10;
        int b = 50;
        int c = a + b;

        System.out.println ("Сумма переменных а + b = " + c);
    }
}
/*Task 11: The largest value of three*/

    class LargestValueOfThree {
        public static void main(String[] args)        {
        int a = 10;
        int b = 50;
        int c = 44;
        int largest;

        largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("The largest number is: "+largest);
    }
    }
/*Task 12: Boolean*/

class TryBoolean {
    public static void main(String[] args) {
        boolean a, b, c;
        a = true;
        b = false;
        c = a & b;
        System.out.println(c); // returns false because only one of the two required values is true

        int i = 10;
        int j = 9;
        System.out.println(i > j); // returns true, because 10 is higher than 9

        int x = 10;
        System.out.println(x == 10); // returns true, because the value of x is equal to 10

        int e = 10;
        int z = 3;
        System.out.println(e + z >= 10); // returns true, because the value of is higher to 10
    }
}

/*Task 13: StringVariables*/

class TryString{
    public static void main(String[] args) {
        String a = "Hello, Slava! ";
        String b = " Please, check my code!";
        String c = a + b;
        System.out.println(c);
    }
    }
/*Task 14: Increase Value*/
class IncreaseLargest {
public static void main(String args[]) {
        int a = 10;
        int b = 50;

        if(a > b) {
            System.out.print(a+3);}
        else {
            System.out.println(b+8);
        }
        System.out.println("The first value was " + a);
    System.out.println("The second value was " + b);

}
        }

/*Task 15: Numbers from 1 to 100 For While Do While*/
class TryForWhileDoWhile {
    public static void main(String args[]) {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "  ");
        }
               }
}

class TryWhile {
    public static void main(String args[]) {
        int i = 1;
        while (i < 101) {
            System.out.println("i= " + i);
            i++;
        }
    }
}

class TryDoWhile {
    public static void main(String args[]) {
        int i = 1;
        do{
            System.out.println("i = " + i);
            i++;
        }while(i < 101);
    }
}

/*Task 16: Display step %5*/


/*Task 17: All the elements divide for largest*/
class DivideForLargestElement {
            public static void main(String args[]) {

            int array[] = {10, 1, 3, 4, 67, 93, 65, 11};
            int max = 0;

            //search for the largest value
            for (int i = 0; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                System.out.println("The largest value of this array is " + max);
                }

}