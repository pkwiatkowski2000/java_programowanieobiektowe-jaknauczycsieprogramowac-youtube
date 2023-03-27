package pl.rectorapator2;

import pl.rectorapator2.drive.HDDDrive;
import pl.rectorapator2.drive.SSDDrive;
import pl.rectorapator2.file.File;
import pl.rectorapator2.file.imagefile.GIFImageFile;
import pl.rectorapator2.file.imagefile.JPGImageFile;
import pl.rectorapator2.file.musicfile.MP3MusicFile;
import pl.usbdevice.MemoryStick;
import pl.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);

        SSDDrive drive = new SSDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

//        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(mp3file.getSize());
    }
}