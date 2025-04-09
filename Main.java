public class Main {
    public static void main(String[] args) {


//        1.Calculate the sum of the first 20 numbers, higher than 11.

//        int sum = 0;
//        int n = 10; //numbers to be added
//        int i = 0; //counter

//        for (i=0; i<20; i+=1) {         //do it 20 times

//            n += 1;
//            sum += n;
//        }
//        System.out.println(sum);


//        2.Calculate the cube of each number <=5

//        E.g.  "For number 1 the cube is 1"

//        "For number 2 the cube is 8"

//        "For number 3 the cube is 27"


//        int n = 1;
//        int cube = 1;

//        for (n=1; n<=5;n +=1) {
//            cube = n*n*n;
//            System.out.println("For number " + n + " the cube is " + cube);
//        }


//        3. I take into consideration the numbers from 1 to 6. For odd numbers, compute their sum, for even numbers , compute their product.

//          int n = 1;
//          int sum = 0;
//          int prod = 1;

//          for (n=1; n<=6; n +=1) {

//              if (n % 2 !=0) {
//                  sum += n;

//              } else {
//                  prod *= n;
//              }
//          }
//          System.out.println("sum for odd numbers <= " + (n-1) + " is " + sum);
//          System.out.println("product for even numbers <= " +(n-1) + " is " + prod);

//        4.Write a program that prints the same message backwards, one character per line For example:"message"


//    String name = "Abracadabra";
//    int i = name.length();  //the number of char/s from string

//            for (i = name.length(); i >0; i = i -1){

        //           char c = name.charAt(i-1);
        //          System.out.println(c);
        //       }


//        5.Write a program that prints every 3rd character from a word

//        String word = "HelloWorld";
//        int len = word.length(); // the length of the word
//        int i = 0; // counter

//              for (i=0; i<len; i+=1) {
//            if ((i+1)%3==0) {
//                char c = word.charAt(i);
//                System.out.println(c);
//            }

//        }


//    prime numbers up to 1 000 000

//        int n;
//        int div;
//        boolean prime;


//        for (n=2; n<100; n=n+1)   {
//            prime=true;
//            for (div = 2; div < n; div += 1)

//                if (n % div == 0) {
//                    prime = false;
//                }

//            if (prime) {
//                System.out.println(n);
//            }
//     }


        // Leap year - program  !hints unhelpful - e.g. 2000, only exception 1900


//        int a = Integer.parseInt(args[0]);

//      if (a>1900) {
//            if (a<=2016) {
//                if (a%4==0) {System.out.println(a + " had 29 days in February");}
//                else {System.out.println(a + " had 28 days in February");}
//            }
//        }
//        else if (a==1900) {System.out.println(a + " had 28 days in February");}

        //   Tema 28.03.2025
        //1.Scrie un program care valideaza o parola. Parola trebuie sa aiba lungimea minima de 8 caractere, sa aibe numai litere si cifre si sa contina cel putin 2 cifre.

// String parola = "74765745agfadgGG764";
// int numarDeCifre = 0;
// boolean valida = true;

// if (parola.length()>=8) {
//     for (int i = 0; i < parola.length(); i++) {
//         char c = parola.charAt(i);
//         if (Character.isLetterOrDigit(c)) {
//             if (Character.isDigit(c)) {
//                 numarDeCifre++;
//             }
//         } else valida = false;
//     }
//     if (numarDeCifre < 2) {
//         valida = false;
//     }
// } else {valida = false;}

// if (valida) {System.out.println("Parola este valida");}
// else {
//     System.out.println("Parola nu este valida");
// }

        //2. Am un cuvant. Daca un cuvant are mai mult de 5 litere, returneaza cuvantul fara vocale. Daca are mai putin de 5 litere, returneaza cuvantu fara consoane. Daca are exact 5 litere, returneaza cuvantul initial.

 /*      verificare("atJRUeeU");
    }
       public static void verificare(String cuvant) {
           if (cuvant.length() == 5) {
                System.out.println(cuvant);
            } else if (cuvant.length() < 5) {
                for (int i = 0; i < cuvant.length(); i++) {
                    char c = cuvant.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                        System.out.print(c);
                    }
                }
            } else for (int j = 0; j < cuvant.length(); j++) {
                char c = cuvant.charAt(j);
                if (c != 'a' & c != 'e' & c != 'i' & c != 'o' & c != 'u' & c != 'A' & c != 'E' & c != 'I' & c != 'O' & c != 'U') {
                    System.out.print(c);
                }
            }

*/

        /*

        //3.Defineste o metoda care calculeaza maximul dintre 3 numere date.

        maxDinTrei(6, 7, 22);
    }

    public static void maxDinTrei(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else System.out.println(c);
          } else if (b > c) {
            System.out.println(b);
               } else {
            System.out.println(c);
        }
    }
*/


 /*       //4. Genereaza random un nr intreg, maxim pana la 100

        System.out.println(numarGenerat());
}
    public static int numarGenerat() {
        double x = Math.random();
        x = x * 100;
return (int) x;
    }*/

    /*    //5. Scrie o metoda java care calculeaza cate cuvinte sunt intr-un string.(delimitare cu " " si sa nu aibe spatii pe margine)
   int a = numarCuvinte("daca vesel se traieste");
        System.out.println("Numar de cuvinte = " + a);
    }
    public static int numarCuvinte(String text) {
        int spatiu = 0;
        for (int i=0; i<text.length();i++ ) {
            char c = text.charAt(i);
            if (c==' ') {spatiu++;}
        }
        return (int)spatiu+1;
    }
    */


/*        //6. Am o operatie +,-,*,/. Pe baza operatie, creeaza un calculator cu aceste operatii. (metoda + switch)

        System.out.println(operatie(4, 3, '/'));
    }

    public static double operatie(int a, int b, char c) {
        double rezultat = 0;
        switch (c) {
            case '+': {
                rezultat = a + b;
                break;
            }
            case '-': {
                rezultat = a - b;
                break;
            }
            case '*': {
                rezultat = a * b;
                break;
            }
            case '/': {
                rezultat = (double) a / b;
                break;
            }
        }

            return (double) rezultat;
*/

        //   ADDITIONAL HOMEWORK METHODS - 29/03/2025 - 5 exercitii
        //   ****************************************

        //1. Calculeaza media aritmetica a tuturor numerelor impare , pana la un numar dat
/*
        System.out.println(mediaAritmeticaImpare(99));
    }
           public static int mediaAritmeticaImpare(int x) {
        int result = 0;
        int counter = 0;
        for (int i=0;i<=x;i++) {
            if (i%2!=0) {
                result+=i;
                counter++;}
            }
        return (int)result/counter;
           }
*/

 /*       //2. Inverseaza un numar. e.g: 12345 -> 54321
        invers(87544);
    }
    public static void invers(int x) {
        int rezultat = 0;
        while (x > 1) {
            rezultat = x % 10;
            System.out.print(rezultat);
            x = x / 10;
        }
    } */

        //3. Verifica daca un numar este magic. Un numar este magic daca impartit la suma cifrelor sale, da 1.
        //cred ca e o eroare in enunt - nici un numar nu este egal cu suma cifrelor proprii; poate divizibil?
/*
 magic(44);
    }    public static void magic(int x) {
        int sumaCifrelor = 0;
        int initial=x;
        while (x > 1) {
            sumaCifrelor += x % 10;
            x = x / 10;
        }
        if (initial%sumaCifrelor==0) {System.out.println(("magic"));}
        else System.out.println(("nu e magic"));
    }  */

        //4. Verifica daca un string a palindrom. e.g. apa, ana, madam, civic, radar
    /*    String text = "elefaccafele";
        if (palindrom(text)) {
            System.out.println(text + " este palindrom");
        }
    }
    public static boolean palindrom(String text) {
        boolean extra = true;
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            char b = text.charAt(text.length() - 1 - i);
            if (a != b) {
                extra = false;
            }
        }
        return extra;
    }
    */
        //5. Verifică dacă un String conține un caracter dat,si daca-l contine, returneaza pozitiile pe care se afla

    /*   verificare("limba noastra-i o comoara",'a');}

    public static void verificare(String text, char ch) {
        boolean nuAreCaracterCerut=true;
        for (int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            if (c==ch) {
                System.out.print(i+1 + " ");
                nuAreCaracterCerut=false;}
            }
        if (nuAreCaracterCerut) {System.out.println(text + " nu continue caracterul " + ch);
        } */

    }

}
