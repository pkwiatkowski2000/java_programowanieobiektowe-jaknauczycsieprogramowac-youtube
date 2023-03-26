package pl.rectorapator2;

import pl.rectorapator2.drive.HDDDrive;
import pl.rectorapator2.drive.SSDDrive;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();

        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("Jnsp.jpg"));
        drive.listFiles();
    }
}