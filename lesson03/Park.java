public class Park {
    private String name;
    private String address;
    private String size;
    private Attraction attraction;

    public Park(String name, String address, String size) {
        this.name = name;
        this.address = address;
        this.size = size;
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void getAttractionInfo() {
            System.out.println("Название аттракциона: " + this.attractionName + "\n" + "Часы работы: " + this.workingHours + "\n" + "Цена билета аттракциона: " + this.price + "\n");
        }
    }

    public void getParkInfo() {
        System.out.println("Название парка: " + this.name + "\n" + "Адрес: " + this.address + "\n" + "Размер парка: " + this.size + "\n");
    }
}
