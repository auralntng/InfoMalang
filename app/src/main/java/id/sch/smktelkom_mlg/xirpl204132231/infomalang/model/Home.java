package id.sch.smktelkom_mlg.xirpl204132231.infomalang.model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Krisna Putra F on 11/15/2016.
 */
public class Home implements Serializable {
    public String deskripsi;
    public String detail;
    public String foto;
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public Drawable d;

    public Home(String deskripsi, String detail, String foto) {
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.foto = foto;
    }

    public Home(String s, Drawable drawable) {
        this.a = Drawable.createFromPath(String.valueOf(a));
        this.b = Drawable.createFromPath(String.valueOf(b));
        this.c = Drawable.createFromPath(String.valueOf(c));
        this.d = Drawable.createFromPath(String.valueOf(d));
    }
}
