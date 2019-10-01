package com.example.proteintracker.Model;

public class MahasiswaKu {


    private String namaku;
    private String nimku;
    private String gender;
    private String cita;
    private String hobi;
    private String motohidup;
    private int foto;

    public MahasiswaKu(String namaku, String nimku, String cita, String hobi, String motohidup, int foto, String gender) {
        this.namaku = namaku;
        this.nimku = nimku;
        this.cita = cita;
        this.hobi = hobi;
        this.motohidup = motohidup;
        this.foto = foto;
        this.gender = gender;
    }


    public String getNamaku() {
        return namaku;
    }

    public void setNamaku(String namaku) {
        this.namaku = namaku;
    }


    public String getNimku() {
        return nimku;
    }

    public void setNim(String nimku) {
        this.nimku = nimku;
    }

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getMotohidup() {
        return motohidup;
    }

    public void setMotohidup(String motohidup) {
        this.motohidup = motohidup;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
