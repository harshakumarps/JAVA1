public class WashingMachineStoreMain {
    public static void main(String[] args) {
        WashingMachineStore.addWashingMachine("Samsung EcoBubble", "Samsung", 8, true, true, 50000);
        WashingMachineStore.addWashingMachine("LG TurboWash", "LG", 9, true, false, 55000);
        WashingMachineStore.addWashingMachine("Bosch Series 6", "Bosch", 7, false, true, 42000);
        WashingMachineStore.addWashingMachine("IFB Senator WXS", "IFB", 8, true, true, 48000);

        WashingMachineStore.displayWashingMachines();

        WashingMachineStore.searchWashingMachine("LG TurboWash");

        WashingMachineStore.updatePrice("Samsung EcoBubble", 48000);

        WashingMachineStore.displayWashingMachines();
    }
}
