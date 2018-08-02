package com.MasterZul;

public class Main {

    public static void main(String[] args) {

        ITelephone zulPhone;
        zulPhone = new DeskPhone(010);

        zulPhone.powerOn();
        zulPhone.callPhone(010);
        zulPhone.answer();

        zulPhone = new MobilePhone(123);
        zulPhone.powerOn();
        zulPhone.callPhone(123);
        zulPhone.answer();
    }
}
