package classwork.Week4;

import java.util.Scanner;

public class Computer {

    public boolean usbDriveExist;

    void printFromUsbDrive(UsbDrive fleshka) {

        System.out.println(fleshka.data);

    }

    void writeToUsbDrive(UsbDrive fleshka) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        fleshka.data = str;

    }

    public class UsbInterface {

        void putIn() {

            Computer.this.usbDriveExist = true;

        }

        void putOut() {

            Computer.this.usbDriveExist = false;

        }

    }

}
