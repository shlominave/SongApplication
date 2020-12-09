package com.example.songapplication;

public class Country {
    private String countryname;
    private String countryflag;
    private long population;

    public Country(String countryname, String countryflag, long population) {
        this.countryname = countryname;
        this.countryflag = countryflag;
        this.population = population;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountryflag() {
        return countryflag;
    }

    public void setCountryflag(String countryflag) {
        this.countryflag = countryflag;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryname='" + countryname + '\'' +
                ", countryflag='" + countryflag + '\'' +
                ", population=" + population +
                '}';
    }
}
