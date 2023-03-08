package Day5a.KiemTra;

import java.util.Locale;
import java.util.StringTokenizer;

public class VanBan {
    private String st;
    public VanBan() {
    }
    public VanBan(String st) {
        this.st = st;
    }

    public int demsotu(){

        StringTokenizer stringTokenizer= new StringTokenizer(st);
        int count=stringTokenizer.countTokens();
        return count;
    }
    public String chuanHoa(){
     st=st.trim();
     return st;
    }
    public String hoachudau1() {


        String[] str = st.split("   ");
        String st1 = "";
        for (String s:str) {

            st1 = st1 + (s.substring(0, 1).toUpperCase() + s.substring(1));

            st1 = st1 + " ";
        }
        return st1;
    }
    public String inHoa(){

        st=st.toUpperCase(Locale.ROOT);
        return st;
    }
    public String inThuong() {
        st=st.toLowerCase(Locale.ROOT);
        return st;
    }
    public String hoachudau() {
        String[] str = st.split("");
        String st1 = "";
        for (int i = 0; i < str.length; i++) {

                st1 = st1 + str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
                st1 = st1 + " ";

        }
        return st1;
    }


    @Override
    public String toString() {
        return "VanBan{" +
                "Chuoi ban dau='" + st + '\'' +
                "\nSo tu trong chuoi='" + demsotu() + '\'' +
                "\nChuan hoa='" + chuanHoa() + '\'' +
                "\nIn hoa='" + inHoa() + '\'' +
                "\nIn thuong='" + inThuong() + '\'' +
                "\nViet hoa chu cai dau='" + hoachudau1() + '\'' +
                '}';
    }
}
