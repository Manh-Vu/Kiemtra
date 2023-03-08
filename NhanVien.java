package Day5a.KiemTra;

public abstract class NhanVien {

    private String id,name,year,address;

    public NhanVien() {
    }

    public NhanVien(String id, String name, String year, String address) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public abstract String moTaCongViec();
}
