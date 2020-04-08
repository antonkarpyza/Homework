package classwork.Week4.Usb;

import java.util.Scanner;

public class Computer2 {


    public boolean usbDriveExist;

    void printFromUsbDrive(UsbDrive fleshka) {

        System.out.println(fleshka.data);

    }

    void writeToUsbDrive(UsbDrive fleshka) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        fleshka.data = str;

        String str2 = scan.nextLine();




    }

    public class UsbInterface {

        void putIn() {

            Computer2.this.usbDriveExist = true;

        }

        void putOut() {

            Computer2.this.usbDriveExist = false;

        }

    }
}