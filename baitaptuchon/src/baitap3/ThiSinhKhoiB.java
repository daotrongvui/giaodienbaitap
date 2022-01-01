package baitap3;

public class ThiSinhKhoiB extends ThiSinh {

    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public ThiSinhKhoiB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{"
                + "So bao danh: " + id
                + ", Ho ten: " + name
                + ", Dia chi: " + address
                + ", Muc uu tien: " + priority + ", Bo mon: " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA
                + '}';
    }
}
