import Arrays.BaseProduct;
import Arrays.Clothing;
import Arrays.Electronics;
import ClassAccesModifiers.Bank;
import ClassAccesModifiers.OfficeCase;
import Enums.DayOfWeek;
import Generics.ValueHolder;
import Interfaces.CreditCard;
import Store.*;
import Transportation.Car;
import Transportation.SubVehicle;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        *** Bank ***
//        Bank bank = new Bank("yarin", 123456, 100.00);
//
//        System.out.println(bank.getBalance());
//        bank.depositToBalance(1000);
//        System.out.println(bank.getBalance());
//        bank.withdrawalFromBalance(850.31);
//        System.out.println(bank.getBalance());

//        *** Office Case ***
//        OfficeCase officeCase = new OfficeCase("contract", "contract with invester", "classified");
//
//        System.out.println(officeCase.getConfidentialityLevel());
//        System.out.println(officeCase.getDescription());
//        officeCase.setConfidentialityLevel("public");
//        System.out.println(officeCase.getConfidentialityLevel());

//        *** Store ***
//        Store store = new Store();
//
//        Product milk = new Product();
//
//        milk.setProductName("milk");
//        milk.setPrice(5.75);
//        ProductSale milkSale = new ProductSale();
//        milkSale.setDiscount(1.75);
//        store.addProduct(milk);
//        System.out.println("Milk price:");
//        System.out.println(milk.getPrice() + "$\n");
//        System.out.println("Milk price after discount:");
//        System.out.println(milkSale.calcFinalPrice(milk.getPrice()) + "$");

//        *** Transportaitation ***
//        SubVehicle vehicle = new SubVehicle(95, 320, 2000);
//
//        Car car = new Car((byte)3, vehicle);
//
//        vehicle.printVehicleDetails();
//        System.out.println();
//        car.printVehicleDetails();
//        System.out.println();
//        car.increaseACLevel();
//        System.out.println();
//        car.printVehicleDetails();

//        *** Generics ***
//        ValueHolder value = new ValueHolder();
//        value.setValue(1);
//        System.out.println(value.getValue());
//        value.setValue("test");
//        System.out.println(value.getValue());
//        value.setValue(true);
//        System.out.println(value.getValue());
//
//        ValueHolder<Integer> intValue = new ValueHolder<>();
//        intValue.setValue(5);
//        System.out.println(intValue.getValue());
//
//        ValueHolder<String> stringValue = new ValueHolder<>();
//        stringValue.setValue("test");
//        System.out.println(stringValue.getValue());
//
//        ValueHolder<Boolean> boolValue = new ValueHolder<>();
//        boolValue.setValue(false);
//        System.out.println(boolValue.getValue());

//        *** Enums ***
//        DayOfWeek[] daysArray = DayOfWeek.values();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Pealse pick on day from the week (1-7): ");
//        int userNumber = scanner.nextInt();
//        System.out.println("You picked "+daysArray[userNumber-1]);

//        *** Arrays ***
//        Clothing Tshirt = new Clothing("Tshirt", "Good quality", 12.5, 'M', "Cottons");
//        Electronics Iphone = new Electronics("IPhone", "14X", 999.99, "Apple", "5000mah");
//
//        List<BaseProduct> products = new ArrayList<>();
//        products.add(Tshirt);
//        products.add(Iphone);
//
//        BaseProduct.checkInstanceBeforePrinting(products.get(0));
//        System.out.println();
//        BaseProduct.checkInstanceBeforePrinting(products.get(1));
    }
}