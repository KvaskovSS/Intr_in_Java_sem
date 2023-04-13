public class Laptop {
    private String brand;
    private String model;
    private double price;
    private int ram;
    private int storage;
    private double screenSize;
    private String processor;
    private String graphicsCard;
    

    public Laptop(String brand, String model, double price, int ram, int storage, double screenSize, String processor, String graphicsCard) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor){
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard){
        this.graphicsCard = graphicsCard;
    }

    public int compareByPrice(Laptop other) {
        if (this.price < other.price) {
            return -1;
        } else if (this.price > other.price) {
            return 1;
        } else {
            return 0;
        }
    }

    public int compareByScreenSize(Laptop other) {
        if (this.screenSize < other.screenSize) {
            return -1;
        } else if (this.screenSize > other.screenSize) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int compareByRAM(Laptop other) {
        if (this.ram < other.ram) {
            return -1;
        } else if (this.ram > other.ram) {
            return 1;
        } else {
            return 0;
        }
    }

    public int compareByStorage(Laptop other) {
        if (this.storage < other.storage) {
            return -1;
        } else if (this.storage > other.storage) {
            return 1;
        } else {
            return 0;
        }
    }
    
    

    public void printInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + price);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Накопитель: " + storage);
        System.out.println("Размер экрана: " + screenSize);
        System.out.println("Процессор: " + processor);
        System.out.println("Видеокарта: " + graphicsCard);
    }
}
