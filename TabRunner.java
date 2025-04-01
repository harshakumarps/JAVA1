class TabRunner {
    public static void main(String[] args) {
        Tab t1 = new Tab(201, "TabA", "BrandX", "ModelX", "Snapdragon 888", 8, 128, "AMOLED", 11.0, "Black", 
                         799.99, true, "Android", 8000, true, true, 13, true, "Stereo", "Wi-Fi, 5G");

        Tab t2 = new Tab(202, "TabB", "BrandY", "ModelY", "MediaTek Helio G90", 4, 64, "LCD", 10.1, "Silver", 
                         499.99, false, "Android", 6000, false, true, 8, false, "Mono", "Wi-Fi");

        Tab t3 = new Tab(203, "TabC", "BrandZ", "ModelZ", "Apple M1", 16, 256, "Retina", 12.9, "Gray", 
                         1299.99, true, "iOS", 10000, true, false, 12, true, "Quad Stereo", "Wi-Fi, 5G");

        System.out.println("Tab 1");
        t1.displayTabDetails();

        System.out.println("Tab 2");
        t2.displayTabDetails();

        System.out.println("Tab 3");
        t3.displayTabDetails();
    }
}
