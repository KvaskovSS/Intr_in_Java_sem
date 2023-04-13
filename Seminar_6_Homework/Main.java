import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Lenovo", "IdeaPad 5", 899.99, 16, 512, 15.6, "Intel Core i5-1135G7", "NVIDIA GeForce MX450"));
        laptops.add(new Laptop("HP", "Envy x360", 1099.99, 16, 1_000, 13.3, "AMD Ryzen 7 5700U", "AMD Radeon Graphics"));
        laptops.add(new Laptop("Dell", "XPS 13", 1399.99, 16, 512, 13.4, "Intel Core i7-1165G7", "Intel Iris Xe Graphics"));
        laptops.add(new Laptop("Apple", "MacBook Pro", 1999.99, 16, 512, 13.3, "M1 Pro", "Apple M1 Pro GPU"));
        
        for (Laptop laptop : laptops) {
            laptop.printInfo();
            System.out.println();
        }

        filterLaptops(laptops);
    }
    public static void filterLaptops(ArrayList<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - Бренд\n" +
                "2 - Модель\n" +
                "3 - Цена\n" +
                "4 - RAM\n" +
                "5 - Хранение\n" +
                "6 - Размер экрана\n" +
                "7 - Процессор\n" +
                "8 - Видеокарта");
    
        int criterion = scanner.nextInt();
        scanner.nextLine();
        String value = scanner.nextLine();
    
        List<Laptop> filteredLaptops = new ArrayList<>();
    
        for (Laptop laptop : laptops) {
            switch (criterion) {
                case 1:
                    if (laptop.getBrand().equalsIgnoreCase(value)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case 2:
                    if (laptop.getModel().equalsIgnoreCase(value)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case 3:
                    if (laptop.getPrice() <= Double.parseDouble(value)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case 4:
                    if (laptop.getRam() >= Integer.parseInt(value)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case 5:
                    if (laptop.getStorage() >= Integer.parseInt(value)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case 6:
                    if (laptop.getScreenSize() >= Double.parseDouble(value)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case 7:
                    if (laptop.getProcessor().equalsIgnoreCase(value)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                case 8:
                    if (laptop.getGraphicsCard().equalsIgnoreCase(value)) {
                        filteredLaptops.add(laptop);
                    }
                    break;
                default:
                    System.out.println("Неправильный критерий фильтрации.");
                    return;
            }
        }
    
        if (filteredLaptops.isEmpty()) {
            System.out.println("Нет ноутбуков, отвечающих фильтру.");
        } else {
            System.out.println("Ноутбуки, отвечающие фильтру:");
            for (Laptop laptop : filteredLaptops) {
                laptop.printInfo();
            }
        }
        scanner.close();
    }
}
