package com.capstone.CapstoneProject.components;

import com.capstone.CapstoneProject.models.Employee;
import com.capstone.CapstoneProject.models.Order;
import com.capstone.CapstoneProject.models.Product;
import com.capstone.CapstoneProject.models.Truck;
import com.capstone.CapstoneProject.models.enums.Category;
import com.capstone.CapstoneProject.models.enums.Position;
import com.capstone.CapstoneProject.models.enums.Size;
import com.capstone.CapstoneProject.repositories.EmployeeRepository;
import com.capstone.CapstoneProject.repositories.OrderRepository;
import com.capstone.CapstoneProject.repositories.ProductRepository;
import com.capstone.CapstoneProject.repositories.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    TruckRepository truckRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Employee employee1 = new Employee("Sandra", "sandra1", "12345", Position.WAREHOUSE_PACKER);

        employeeRepository.save(employee1);

        Truck truck1 = new Truck(100);
        Truck truck2 = new Truck(100);
        Truck truck3 = new Truck(100);
        Truck truck4 = new Truck(100);

        truckRepository.saveAll(List.of(truck1, truck2, truck3, truck4));

        Product product1 = new Product("Apple Iphone 15",15,
                "black Iphone with 128GB",
                Category.ELECTRONICS, Size.SMALL,
                "iphone.png", "A14",false, false, true);

        Product product2 = new Product("baseball cap",4,
                "adults navy cap", Category.ACCESSORIES ,
                Size.SMALL, "baseballCap.png","D1",false, false, false);

        Product product3 = new Product("Samsung frame Tv",3,
                "65inch with stand and wall attachment", Category.ELECTRONICS ,
                Size.LARGE,"samsungTvBox.png","B28",true, false, true);

        Product product4 = new Product(
                "Desk Lamp", 5, "Adjustable desk lamp with bulb included",
                Category.HOME_DECOR, Size.MEDIUM,
                "deskLamp.png", "A12", true, true, false);

        Product product5 = new Product(
                "Krups Coffee Machine", 4, "Coffee machine for Nespresso pods",
                Category.HOME_APPLIANCES, Size.MEDIUM,
                "coffeeMachine.png", "D2", false, false, false);

        Product product6 = new Product(
                "Tote Bag", 9, "Beige cotton tote bag",
                Category.ACCESSORIES, Size.SMALL,
                "toteBag.png", "C32", false, false, false);

        Product product7 = new Product(
                "Skin Care Gift Set",4 , "skin care set with 5 full-size products inside",
                Category.BEAUTY, Size.MEDIUM,
                "skincareSet.png", "A1", false, false, false);

        Product product8 = new Product(
                "Apple Airpods", 6, "wireless white earbuds with charging case",
                Category.ELECTRONICS, Size.SMALL,
                "airpods.png", "E23", false, false, false);

        Product product9 = new Product(
                "Bath Mat", 3, "cream bathroom mat 90x50cm",
                Category.HOME_DECOR, Size.SMALL,
                "bathMat.png", "B5", false, false, false);

        Product product10 = new Product(
                "Garmin Smartwatch", 12, "Fitness tracking smartwatch",
                Category.ELECTRONICS, Size.MEDIUM,
                "smartwatch.png", "C16", false, false, false);

        productRepository.saveAll(List.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10));

        Order order1 = new Order(List.of(product1, product2), true, LocalDate.of(2023, 9, 20));

        Order order2 = new Order(List.of(product2, product3), false, LocalDate.of(2023, 9, 21));

        Order order3 = new Order(List.of(product4, product3, product4, product5, product6), false, LocalDate.of(2023, 9, 22));

        Order order4 = new Order(List.of(product1, product9, product6, product8), true, LocalDate.of(2023, 9, 20));

        Order order5 = new Order(List.of(product10, product6, product2, product7), true, LocalDate.of(2023, 9, 21));

        orderRepository.saveAll(List.of(order1, order2, order3, order4, order5));






    }
}
