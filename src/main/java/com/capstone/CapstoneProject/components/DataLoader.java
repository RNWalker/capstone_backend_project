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
                "imageofIphone.png", "A14",false, false, true);

        Product product2 = new Product("baseball cap",4,
                "adults navy cap", Category.ACCESSORIES ,
                Size.SMALL, "baseballCap2.png","D1",false, false, false);

        Product product3 = new Product("Samsung frame Tv",3,
                "65inch comes with stand and wall attachment", Category.ELECTRONICS ,
                Size.LARGE,"samsungTvBox.png","B28",true, true, false);

        productRepository.saveAll(List.of(product1, product2, product3));

        Order order1 = new Order(List.of(product1, product2), true, LocalDate.of(2023, 9, 20));

        Order order2 = new Order(List.of(product2, product3), false, LocalDate.of(2023, 9, 21));

        orderRepository.saveAll(List.of(order1, order2));






    }
}
