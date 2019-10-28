package chapter14_4;

import java.util.ArrayList;

/**
 * @author lhang
 * @create 2019-10-26 10:29
 */
public class DeviceFactory {
    private ArrayList<NetworkDevice> devices = new ArrayList<NetworkDevice>();
    private int totalterminal = 0;

    public DeviceFactory() {
        devices.add(new Switch("交换机"));
        devices.add(new Hub("集线器"));
    }

    public NetworkDevice getNetworkDevice(String type) {

        return null;
    }

    public int getTotalDevice() {
        return devices.size();
    }

    public int getTotalterminal() {
        return totalterminal;
    }


}
