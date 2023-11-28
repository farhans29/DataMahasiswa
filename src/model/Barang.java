package model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_barang")
public class Barang implements Serializable {
    
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id_barang", length = 150)
    private String idBarang;
    public void setIdBarang(String idBarang){
        this.idBarang = idBarang;
    }
    public String getIdBarang(){
        return  idBarang;
    }

    @Column(name = "nama_barang", length = 50)
    private String namaBarang;
    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    public String getNamaBarang(){
        return  namaBarang;
    }

    @Column(name = "jenis_barang", length = 10)
    @Enumerated(EnumType.STRING)
    private JenisBarang jenisBarang;
    public void setJenisBarang(JenisBarang jenisBarang){
        this.jenisBarang = jenisBarang;
    }
    
    public JenisBarang getJenisBarang(){
        return  jenisBarang;
    }

    @Column(name = "tanggal_kadaluarsa")
    @Temporal(TemporalType.DATE)
    private Date tanggalKadaluarsa;
    public void setTanggalKadaluarsa(Date tanggalKadaluarsa){
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    public Date getTanggalKadaluarsa(){
        return  tanggalKadaluarsa;
    }

}
