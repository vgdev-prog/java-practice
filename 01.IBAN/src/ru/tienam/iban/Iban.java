package ru.tienam.iban;

import java.math.BigInteger;

public final class Iban {

    public boolean isValid(String iban) {
        final String formattedIban = formatIban(iban);
        final Country country = formatCountryFromIban(formattedIban);
        return hasValidLength(formattedIban, country) && hasValidChecksum(formattedIban);
    }

    private Country formatCountryFromIban(String iban) {
        final String countryCode = iban.substring(0, 2);
        return Country.valueOf(countryCode);
    }

    private String formatIban(String iban) {
        return iban.replace(" ", "");
    }

    private boolean hasValidLength(String iban, Country country) {
        return iban.length() == country.getLength();
    }

    private boolean hasValidChecksum(String iban) {
        final BigInteger checksum = new BigInteger(rearrangeIban(iban));
        final BigInteger remainder = checksum.mod(BigInteger.valueOf(97));
        return remainder.equals(BigInteger.ONE);
    }


    private String rearrangeIban(String iban) {
        final String leftPart = iban.substring(0, 4);
        final String rightPart = iban.substring(4);
        final StringBuilder sb = new StringBuilder(rightPart);
        for (int i = 0; i < leftPart.length(); i++) {
            sb.append(Character.getNumericValue(leftPart.charAt(i)));
        }
        return sb.toString();
    }
}
