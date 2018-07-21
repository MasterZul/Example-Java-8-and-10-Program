package com.MasterZul;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if(value == 1){
//            System.out.println("The value was 1");
//        }else if(value == 2){
//            System.out.println("The value was 2");
//        }else{
//            System.out.println("The value was not 1 or 2");
//        }

        int switchValue = 4;

        switch (switchValue) { // can be use by 4 four primitive chart byte,char,int and short
            case 1:
                System.out.println("The value was 1");
                break;

            case 2:
                System.out.println("The value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("The value was 3 - 5");
                break;

            default:
                System.out.println("The value was not 1 or 2");
                break;
        }

        //Challenge for char type

        char charValue = 'A';

        switch (charValue) { // can be use by 4 four primitive chart byte,char,int and short
            case 'A':
                System.out.println("The value A was found");
                break;

            case 'B':
                System.out.println("The value B was found");
                break;

            case 'C':
                System.out.println("The value C was found");
                break;

            default:
                System.out.println("Not Found");
                break;
        }

        //Challenge for string type

        String stringValue = "JANUARY";

        switch (stringValue.toLowerCase()) { // can be use by 4 four primitive chart byte,char,int and short
            case "january":
                System.out.println("It is January");
                break;

            case "february":
                System.out.println("It is February");
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
