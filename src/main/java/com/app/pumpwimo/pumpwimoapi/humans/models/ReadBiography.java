package com.app.pumpwimo.pumpwimoapi.humans.models;

public enum ReadBiography {

    READ_BIOGRAPHY("readBiography"), /* уже читал биографию */
    NOT_READ_BIOGRAPHY("notReadBiography"); /* еше не читал биографию */

    private String readBiography;

    ReadBiography(String readBiography) {
        this.readBiography = readBiography;
    }

    public String getReadBiographyOrNot() {
        return readBiography;
    }
}