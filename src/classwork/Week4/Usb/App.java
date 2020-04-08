package classwork.Week4.Usb;


public class App {

    public static void main(String[] args) {

        Computer2 komp = new Computer2();
        Computer2.UsbInterface usbInt=komp.new UsbInterface();

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
