package baitap3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyThiSinh managerCandidate = new QuanLyThiSinh();
        while (true) {
            System.out.println("Quan ly thi sinh thi dai hoc:");
            System.out.println("Chon 1: Them moi thi sinh");
            System.out.println("Chon 2: Hien thi thong tin va khoi thi cua thi sinh ");
            System.out.println("Chon 3: Tim kiem theo so bao danh thi sinh");
            System.out.println("Chon 4: Thoat khoi chuong trinh");
            String line = scanner.nextLine();
            System.out.println("--------------------------------------------------------");
            switch (line) {
                case "1": {
                    System.out.println("Chon 1: Nhap thi sinh thi khoi A");
                    System.out.println("Chon 2: Nhap thi sinh thi khoi B");
                    System.out.println("Chon 3: Nhap thi sinh thi khoi C");
                    String type = scanner.nextLine();
                    System.out.println("----------------------------------------");
                    switch (type) {
                        case "1": {
                            managerCandidate.add(createCadidate(scanner, "1"));
                            break;

                        }
                        case "2": {
                            managerCandidate.add(createCadidate(scanner, "2"));
                            break;
                        }
                        case "3": {
                            managerCandidate.add(createCadidate(scanner, "3"));
                            break;
                        }
                        default:
                            System.out.println("Khong hop le. Vui long chon lai!");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerCandidate.showInfor();
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                }
                case "3": {
                    System.out.print("Nhap so bao danh thi sinh: ");
                    String id = scanner.nextLine();
                    ThiSinh candidate = managerCandidate.searchById(id);
                    if (candidate == null) {
                        System.out.println("Khong hop le. Vui long chon lai!");
                        System.out.println("----------------------------------------");
                    } else {
                        System.out.println(candidate.toString());
                        System.out.println("------------------------------------------------------------------------------");
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Khong hop le. Vui long chon lai!");
                    continue;
            }

        }
    }

    public static ThiSinh createCadidate(Scanner scanner, String cate) {
        System.out.print("So bao danh thi sinh: ");
        String id = scanner.nextLine();
        System.out.print("Ho ten thi sinh: ");
        String name = scanner.nextLine();
        System.out.print("Dia chi thi sinh: ");
        String address = scanner.nextLine();
        System.out.print("Muc uu tien: ");
        int priority = scanner.nextInt();
        System.out.println("----------------------------------------");
        scanner.nextLine();
        if (cate.equals("1")) {
            return new ThiSinhKhoiA(id, name, address, priority);
        } else if (cate.equals("2")) {
            return new ThiSinhKhoiB(id, name, address, priority);
        } else {
            return new ThiSinhKhoiC(id, name, address, priority);
        }
    }
}
