package baitap3;

import java.util.ArrayList;
import java.util.List;

public class QuanLyThiSinh {

    List<ThiSinh> candidates;

    public QuanLyThiSinh() {
        this.candidates = new ArrayList<>();
    }

    public void add(ThiSinh candidate) {
        this.candidates.add(candidate);
    }

    public void showInfor() {
        this.candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }

    public ThiSinh searchById(String id) {
        return this.candidates.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }

}
