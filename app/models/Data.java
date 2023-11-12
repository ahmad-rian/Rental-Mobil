// models/Data.java
package models;

import play.db.jpa.Model;
import play.data.validation.*;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Data extends Model {

    @Required
    public String nama;

    @Required
    public String nohp;

    @Required
    public Date tgl;

    @Required
    public String model;

    @Required
    @Min(1)
    public int durasi;

    @Required
    public String lokasi;

    public Data(String nama, String nohp, Date tgl, String model, int durasi, String lokasi) {
        this.nama = nama;
        this.nohp = nohp;
        this.tgl = tgl;
        this.model = model;
        this.durasi = durasi;
        this.lokasi = lokasi;
    }
}
