package pl.rectorapator2;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        System.out.println(monitor.getResolution());

        monitor.setLowResouliton();
        System.out.println(monitor.getResolution());
    }
}
