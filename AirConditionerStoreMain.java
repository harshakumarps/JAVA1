public class AirConditionerStoreMain {
    public static void main(String[] args) {
        AirConditionerStore.addAirConditioner("LG DualCool", "LG", 1.5, true, true, 35000);
        AirConditionerStore.addAirConditioner("Daikin FTKM", "Daikin", 1.8, true, false, 42000);
        AirConditionerStore.addAirConditioner("Blue Star IC518EBTU", "Blue Star", 1.5, true, true, 37000);
        AirConditionerStore.addAirConditioner("Hitachi Shizen", "Hitachi", 2.0, false, false, 40000);

        AirConditionerStore.displayAirConditioners();

        AirConditionerStore.searchAirConditioner("Daikin FTKM");

        AirConditionerStore.updatePrice("LG DualCool", 34000);

        AirConditionerStore.displayAirConditioners();
    }
}
