package org.example.day2.library;

public class Book {
    private String name;

//    public void setTheName(String inputName){
//        if (inputName.length()<5) {
//            System.out.println("Book name is invalid");
//        }else{
//            this.name = inputName;
//        }
//    }
//
//
//    public String getTheName(){
//        return this.name;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
