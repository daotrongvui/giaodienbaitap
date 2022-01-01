package baitap3;

public class ThiSinhKhoiC extends ThiSinh {

    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public ThiSinhKhoiC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{"
                + "So bao danh: " + id
                + ", Ho ten: " + name
                + ", Dia chi: " + address
                + ", Muc uu tien: " + priority + ", Bo mon: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA
                + '}';
    }
}
