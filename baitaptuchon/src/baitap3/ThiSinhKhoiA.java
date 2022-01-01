package baitap3;

public class ThiSinhKhoiA extends ThiSinh {

    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";

    public ThiSinhKhoiA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{"
                + "So bao danh: " + id
                + ", Ho ten: " + name
                + ", Dia chi: " + address
                + ", Muc uu tien: " + priority + ", Bo mon: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA
                + '}';
    }
}
