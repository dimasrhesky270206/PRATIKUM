    public class SmartHomeDevice {
         String nama;
         double konsumsiPower;
         double StanbyPower;

        public SmartHomeDevice(String nama, double konsumsiPower, double stanbyPower) {
            this.nama = nama;
            this.konsumsiPower = konsumsiPower;
            this.StanbyPower = stanbyPower;
        }
        public double totalEnergiAktual() {
            return konsumsiPower + StanbyPower;
        }
        public double rasioEfisiensi() {
            return (StanbyPower / totalEnergiAktual())*100;
        }
        public String getNama() {
            return nama;
        }
        public double getkonsumsiPower() {
            return konsumsiPower;
        }
        public void printData() {
            System.out.println("Nama: nama");
            System.out.println("Total EnergiAktual");
            System.out.println("Rasio Efisiensi: " + rasioEfisiensi() + "%");
        }
    }