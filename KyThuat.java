package Day5a.KiemTra;

public class KyThuat extends NhanVien{
    private String specialize;

    public KyThuat() {

    }
    public KyThuat(String specialize) {
        this.specialize = specialize;
    }

    public KyThuat(String id, String name, String year, String address, String specialize) {
        super(id, name, year, address);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }
    @Override
    public String moTaCongViec(){
        return specialize+" Viet chuong trinh!";

    }

    @Override
    public String toString() {
        return "KyThuat{" +
                "Ho Ten='" + getName() + '\'' +
                " Nam Sinh='" + getYear() + '\'' +
                " Dia Chi='" + getAddress() + '\'' +
                " Chuyen nganh='" + specialize + '\'' +
                " Mo ta='" + moTaCongViec() + '\'' +

                '}';
    }
}
