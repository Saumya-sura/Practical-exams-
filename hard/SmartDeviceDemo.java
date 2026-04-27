// Q6. Design a Smart Device Control System using interfaces to achieve multiple inheritance in Java:
// 1. Interface WiFiEnabled (provides WiFi functionality)
//    - connectToWiFi(String network): Connects to a WiFi network
//    - disconnectWiFi(): Disconnects from WiFi
// 2. Interface BluetoothEnabled (provides Bluetooth functionality)
//    - pairDevice(String deviceName): Pairs with a Bluetooth device
//    - unpairDevice(): Unpairs from the Bluetooth device
// 3. Class SmartSpeaker (implements both WiFiEnabled and BluetoothEnabled)
//    - Implements WiFi and Bluetooth methods
//    - Additional method playMusic(String songName)
// 4. Class SmartDeviceDemo (Main class)
//    - Creates a SmartSpeaker object and performs various operations

// WiFiEnabled interface
interface WiFiEnabled {
    void connectToWiFi(String network);
    void disconnectWiFi();
}

// BluetoothEnabled interface
interface BluetoothEnabled {
    void pairDevice(String deviceName);
    void unpairDevice();
}

// SmartSpeaker class implementing both interfaces
class SmartSpeaker implements WiFiEnabled, BluetoothEnabled {
    private String wifiNetwork;
    private String pairedDevice;

    @Override
    public void connectToWiFi(String network) {
        wifiNetwork = network;
        System.out.println("Connected to WiFi network: " + wifiNetwork);
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("Disconnected from WiFi network: " + wifiNetwork);
        wifiNetwork = null;
    }

    @Override
    public void pairDevice(String deviceName) {
        pairedDevice = deviceName;
        System.out.println("Paired with Bluetooth device: " + pairedDevice);
    }

    @Override
    public void unpairDevice() {
        System.out.println("Unpaired from Bluetooth device: " + pairedDevice);
        pairedDevice = null;
    }

    public void playMusic(String songName) {
        System.out.println("Playing song: " + songName);
    }
}

// Main class
public class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker();
        speaker.connectToWiFi("HomeWiFi");
        speaker.pairDevice("Phone");
        speaker.playMusic("Shape of You");
        speaker.disconnectWiFi();
        speaker.unpairDevice();
    }
}
