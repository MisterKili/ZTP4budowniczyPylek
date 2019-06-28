package com.company;

import java.util.ArrayList;

public class FabrykaStudentow {

    ArrayList<Student> studenci = new ArrayList<>();

    //pylek dla zwyklych studentow
    public Student dodajStudenta(int id, String imie, String nazwisko){
        for(Student s: studenci){
            if(s.nrAlbumu == id && s.imie.equals(imie) && s.nazwisko.equals(nazwisko))
                return s;
        }
        Student nowyStudent =  new Student.Builder(id, imie, nazwisko).build();
        studenci.add(nowyStudent);
        return nowyStudent;
    }

    public Student dodajSuperStudenta(int id, String imie, String nazwisko, String miasto, String plec, int wiek){
        Student s;
        for(int i = 0; i<studenci.size(); i++){
            s = studenci.get(i);
            if(s.nrAlbumu == id && s.imie.equals(imie) && s.nazwisko.equals(nazwisko))
                studenci.remove(s);
        }
        Student nowyStudent =  new Student.Builder(id, imie, nazwisko).miasto(miasto).plec(plec).wiek(wiek).build();
        studenci.add(nowyStudent);
        return nowyStudent;
    }

    public void drukujStudentow(){
        for(Student s: studenci){
            System.out.println(s);
        }
    }

}
