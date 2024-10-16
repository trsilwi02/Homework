package JAVA.Chuong6;

public class NhanVien{
        private String hoTen; // full name
        private double luong; // salary
    
        // constructor with necessary parameters
        public NhanVien(String hoTen, double luong) {
            this.hoTen = hoTen;
            this.luong = luong;
        }
    
        // getter and setter methods
        public String getHoTen() {
            return hoTen;
        }
    
        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }
    
        public double getLuong() {
            return luong;
        }
    
        public void setLuong(double luong) {
            this.luong = luong;
        }
    
        // method to display employee information
        public void inTTin() {
            System.out.println("Employee: " + hoTen);
            System.out.println("Salary: " + luong);
        }
    
}
