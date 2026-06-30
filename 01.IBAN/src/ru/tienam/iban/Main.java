package ru.tienam.iban;

class Main  {
    public static void main() {
        Iban iban = new Iban();
        System.out.println(iban.isValid("UA89 3704 0044 0532 0130 00"));
    }
}