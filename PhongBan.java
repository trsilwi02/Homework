package JAVA.Chuong6;

import java.util.LinkedList;

public class PhongBan {
    private String tenPhongBan; // department name
    private LinkedList<NhanVien> danhSachNhanVien; // list of employees

    // constructor with necessary parameters
    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        this.danhSachNhanVien = new LinkedList<NhanVien>();
    }

    // method to add an employee
    public void themNhanVien(NhanVien nhanVien) {
        danhSachNhanVien.add(nhanVien);
    }

    // method to remove an employee
    public void xoaNhanVien(NhanVien nhanVien) {
        danhSachNhanVien.remove(nhanVien);
    }

    // method to calculate total salary of employees
    public double tongLuong() {
        double totalSalary = 0;
        for (NhanVien nhanVien : danhSachNhanVien) {
            totalSalary += nhanVien.getLuong();
        }
        return totalSalary;
    }

    // method to display department information and employee information
    public void inTTin() {
        System.out.println("Department: " + tenPhongBan);
        for (NhanVien nhanVien : danhSachNhanVien) {
            nhanVien.inTTin();
        }
    }
}
