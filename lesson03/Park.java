public class Park {
    private String name;
    private String address;
    private String size;

    public Park(String name, String address, String size) {
        this.name = name;
        this.address = address;
        this.size = size;
    }

    private class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction (String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }
    }
}
