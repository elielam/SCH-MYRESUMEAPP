package app.elbase.fr.myresumeapp;

/**
 * Created by eliel on 18/04/2018.
 */

public class Formation {
    private String libelle;
    private String year;
    private String desc;

    public Formation(String libelle, String year, String desc) {
        this.libelle = libelle;
        this.year = year;
        this.desc = desc;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
