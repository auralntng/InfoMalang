package id.sch.smktelkom_mlg.xirpl204132231.infomalang.model;

import java.io.Serializable;

/**
 * Created by Krisna Putra F on 11/15/2016.
 */
public class Home implements Serializable
{
    public String judul;
    public String foto;
    public String penjelasan;
    public String isi;

    public Home(String judul, String foto, String penjelasan, String isi)
    {
        this.judul = judul;
        this.foto = foto;
        this.penjelasan = penjelasan;
        this.isi = isi;
    }
}
