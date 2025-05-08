import java.util.ArrayList;

class SmartHomeDevice {
    private String nama;
    private double konsumsiPower; // dalam watt
    private double waktuPenggunaan; // dalam jam

    public SmartHomeDevice(String nama, double konsumsiPower, double waktuPenggunaan) {
        this.nama = nama;
        this.konsumsiPower = konsumsiPower;
        this.waktuPenggunaan = waktuPenggunaan;
    }

    public double rasioEfisiensi() {
        return konsumsiPower / waktuPenggunaan;
    }

    public double getKonsumsiPower() {
        return konsumsiPower;
    }

    public double totalEnergiAktual() {
        return konsumsiPower * waktuPenggunaan;
    }

    public void printData() {
        System.out.println("Nama Device: " + nama);
        System.out.println("Konsumsi Power: " + konsumsiPower + " watt");
        System.out.println("Waktu Penggunaan: " + waktuPenggunaan + " jam");
        System.out.println("Total Energi Aktual: " + totalEnergiAktual() + " Wh");
        System.out.println("Rasio Efisiensi: " + rasioEfisiensi());
    }
}

class SmartHomeMain {
    private ArrayList<SmartHomeDevice> devices;

    public SmartHomeMain() {
        devices = new ArrayList<>();
    }

    public void tambahDevice(SmartHomeDevice device) {
        devices.add(device);
    }

    public void tampilkanDevicePalingEfisien() {
        if (devices.isEmpty()) {
            System.out.println("Tidak ada device yang tersedia.");
            return;
        }

        SmartHomeDevice efisien = devices.get(0);
        for (SmartHomeDevice device : devices) {
            if (device.rasioEfisiensi() < efisien.rasioEfisiensi()) {
                efisien = device;
            }
        }

        System.out.println("\nDevice paling efisien:");
        efisien.printData();
    }

    public void hitungRataRataEnergiAktual() {
        double totalEnergi = 0;
        int count = 0;

        for (SmartHomeDevice device : devices) {
            if (device.getKonsumsiPower() > 10) {
                totalEnergi += device.totalEnergiAktual();
                count++;
            }
        }

        if (count > 0) {
            double rataRata = totalEnergi / count;
            System.out.println("\nRata-rata total energi aktual untuk device dengan konsumsi > 10: " + rataRata + " Wh");
        } else {
            System.out.println("\nTidak ada device dengan konsumsi power > 10.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SmartHomeMain home = new SmartHomeMain();

        home.tambahDevice(new SmartHomeDevice("Lampu", 5, 2));
        home.tambahDevice(new SmartHomeDevice("AC", 15, 3));
        home.tambahDevice(new SmartHomeDevice("Kulkas", 12, 4));

        home.tampilkanDevicePalingEfisien();
        home.hitungRataRataEnergiAktual();
    }
}
