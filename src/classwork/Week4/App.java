package classwork.Week4;

public class App {
    public static void main(String[] args) {

        Computer komp = new Computer();
        Computer.UsbInterface usbInt=komp.new UsbInterface();

        UsbDrive usb=new UsbDrive();

        usbInt.putIn();

        if(komp.usbDriveExist){
            komp.writeToUsbDrive(usb);

            komp.printFromUsbDrive(usb);

        }
         else {

            System.out.println("Вставте флэшку ");
        }



    }
}
