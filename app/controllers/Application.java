// controllers/Application.java
package controllers;

import play.mvc.Controller;
import play.mvc.With;
import models.Data;

import java.util.List;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void newmobil() {
        render();
    }

    public static void form() {
        render();
    }

    public static void Simpan(Data clien) {
        clien.save();
        showCarRentals();
    }

    public static void showCarRentals() {
        List<Data> carRentals = Data.findAll();
        render(carRentals);
    }

    public static void edit(Long id) {
        Data carRental = Data.find("id=?1", id).first();
        render(carRental);
    }

    public static void destroy(Long id) {
        Data carRental = Data.findById(id);
        carRental.delete();
        showCarRentals();
    }

    public static void delete(Long id) {
        Data carRentals = Data.findById(id);
        if (carRentals != null) {
            carRentals.delete();
            flash.success("Mahasiswa dengan ID %d berhasil dihapus.", id);
        } else {
            flash.error("Mahasiswa dengan ID %d tidak ditemukan.", id);
        }
        showCarRentals(); // Mengarahkan kembali ke halaman tampilkan setelah penghapusan.
    }
}
