/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.distro;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Okky
 */
@Entity
@Table(name = "penjualan", catalog = "distro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Penjualan.findAll", query = "SELECT p FROM Penjualan p"),
    @NamedQuery(name = "Penjualan.findByKodePenjualan", query = "SELECT p FROM Penjualan p WHERE p.kodePenjualan = :kodePenjualan"),
    @NamedQuery(name = "Penjualan.findByKodeBarang", query = "SELECT p FROM Penjualan p WHERE p.kodeBarang = :kodeBarang"),
    @NamedQuery(name = "Penjualan.findByTanggalPenjualan", query = "SELECT p FROM Penjualan p WHERE p.tanggalPenjualan = :tanggalPenjualan"),
    @NamedQuery(name = "Penjualan.findByJumlahBarang", query = "SELECT p FROM Penjualan p WHERE p.jumlahBarang = :jumlahBarang"),
    @NamedQuery(name = "Penjualan.findByTotalHarga", query = "SELECT p FROM Penjualan p WHERE p.totalHarga = :totalHarga")})
public class Penjualan implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_penjualan")
    private String kodePenjualan;
    @Basic(optional = false)
    @Column(name = "kode_barang")
    private String kodeBarang;
    @Basic(optional = false)
    @Column(name = "tanggal_penjualan")
    private String tanggalPenjualan;
    @Basic(optional = false)
    @Column(name = "jumlah_barang")
    private int jumlahBarang;
    @Basic(optional = false)
    @Column(name = "total_harga")
    private int totalHarga;

    public Penjualan() {
    }

    public Penjualan(String kodePenjualan) {
        this.kodePenjualan = kodePenjualan;
    }

    public Penjualan(String kodePenjualan, String kodeBarang, String tanggalPenjualan, int jumlahBarang, int totalHarga) {
        this.kodePenjualan = kodePenjualan;
        this.kodeBarang = kodeBarang;
        this.tanggalPenjualan = tanggalPenjualan;
        this.jumlahBarang = jumlahBarang;
        this.totalHarga = totalHarga;
    }

    public String getKodePenjualan() {
        return kodePenjualan;
    }

    public void setKodePenjualan(String kodePenjualan) {
        String oldKodePenjualan = this.kodePenjualan;
        this.kodePenjualan = kodePenjualan;
        changeSupport.firePropertyChange("kodePenjualan", oldKodePenjualan, kodePenjualan);
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        String oldKodeBarang = this.kodeBarang;
        this.kodeBarang = kodeBarang;
        changeSupport.firePropertyChange("kodeBarang", oldKodeBarang, kodeBarang);
    }

    public String getTanggalPenjualan() {
        return tanggalPenjualan;
    }

    public void setTanggalPenjualan(String tanggalPenjualan) {
        String oldTanggalPenjualan = this.tanggalPenjualan;
        this.tanggalPenjualan = tanggalPenjualan;
        changeSupport.firePropertyChange("tanggalPenjualan", oldTanggalPenjualan, tanggalPenjualan);
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        int oldJumlahBarang = this.jumlahBarang;
        this.jumlahBarang = jumlahBarang;
        changeSupport.firePropertyChange("jumlahBarang", oldJumlahBarang, jumlahBarang);
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        int oldTotalHarga = this.totalHarga;
        this.totalHarga = totalHarga;
        changeSupport.firePropertyChange("totalHarga", oldTotalHarga, totalHarga);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodePenjualan != null ? kodePenjualan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penjualan)) {
            return false;
        }
        Penjualan other = (Penjualan) object;
        if ((this.kodePenjualan == null && other.kodePenjualan != null) || (this.kodePenjualan != null && !this.kodePenjualan.equals(other.kodePenjualan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.distro.Penjualan[ kodePenjualan=" + kodePenjualan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
