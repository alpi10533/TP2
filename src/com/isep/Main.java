package com.isep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteStr() ;
        factorielle();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier : ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " est pair.");
        } else {
            System.out.println(n + " est impair.");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un premier entier : ");
        int n1 = scanner.nextInt();
        System.out.println("Saisir un second entier : ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("l’entier le plus grand est le premier : " + n1);
        } else {
            System.out.println("l’entier le plus grand est le second : " + n2);
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un premier entier : ");
        int n1 = scanner.nextInt();
        System.out.println("Saisir un second entier : ");
        int n2 = scanner.nextInt();
        if (n1 < n2){
            System.out.println("l’entier le plus petit est le premier : "+ n1);
        } else {
            System.out.println("l’entier le plus petit est le second : " + n2);
        }
    }

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une premiere chaine de caractere : ");
        String c1 = scanner.nextLine();
        System.out.println("Saisir une premiere chaine de caractere : ");
        String c2 = scanner.nextLine();
        boolean test = c1.equals(c2);
        if (test){
            System.out.println("les chaines de caractères sont égales");
        } else {
            System.out.println("les chaines de caractères ne sont pas égales");
        }
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int f = 1;
        if (n == 0) {
            System.out.println(n + "! = " + f);
        } else {
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println(n + "! = " + f);
        }
    }

}
