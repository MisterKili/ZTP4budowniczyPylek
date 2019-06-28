package com.company;

public class Student {

    int nrAlbumu;       //obligatoryjne
    String imie;        //obligatoryjne
    String nazwisko;    //obligatoryjne
    String miasto;      //opcjonalne
    String plec;        //opcjonalne
    int wiek;           //opcjonalne

    public Student(Builder builder){
        this.nrAlbumu = builder.nrAlbumu;
        this.imie = builder.imie;
        this.nazwisko = builder.nazwisko;
        this.miasto = builder.miasto;
        this.plec = builder.plec;
        this.wiek = builder.wiek;
    }

    public String toString(){
        return nrAlbumu+" "+nazwisko+" "+imie+" "+miasto+" "+plec+" "+wiek;
    }

    public static class Builder {

        private int nrAlbumu;       //obligatoryjne
        private String imie;        //obligatoryjne
        private String nazwisko;    //obligatoryjne
        private String miasto = "";      //opcjonalne
        private String plec = "";        //opcjonalne
        private int wiek;           //opcjonalne

        public Builder(int nrAlbumu, String imie, String nazwisko){
            this.nrAlbumu = nrAlbumu;
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public Builder miasto(String miasto){
            this.miasto = miasto;
            return this;
        }

        public Builder plec(String plec){
            this.plec = plec;
            return this;
        }

        public Builder wiek(int wiek){
            this.wiek = wiek;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }


}
