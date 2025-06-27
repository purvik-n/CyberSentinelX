public class NetworkMonitor {
    public static void simulateIPScan() {
        String[] outgoingIPs = {
            "192.168.1.1", "8.8.8.8", "172.217.167.78", "203.0.113.10"
        };

        for (String ip : outgoingIPs) {
            if (!ip.startsWith("192.") && !ip.startsWith("172.")) {
                LoggerUtil.log("⚠️ Suspicious IP connection detected: " + ip);
            }
        }
    }
}
