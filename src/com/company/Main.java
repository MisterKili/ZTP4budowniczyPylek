package com.company;

public class Main {

    public static void main(String[] args) {
        FabrykaStudentow fabryka = new FabrykaStudentow();
        Student jank = fabryka.dodajStudenta(1, "Jan", "Kowalski");
        fabryka.dodajStudenta(2, "Adam", "Nowak");
        fabryka.drukujStudentow();

        System.out.println();

        Student jank2 = fabryka.dodajStudenta(1, "Jan", "Kowalski");

        System.out.println("Czy jank i jank2 to ta sama osoba: "+(jank == jank2));

        fabryka.dodajSuperStudenta(2, "Adam", "Nowak", "Wroclaw", "mezczyzna", 30);

        System.out.println();
        fabryka.drukujStudentow();
    }
}
