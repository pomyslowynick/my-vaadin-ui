package ui.vaadin.example.myvaadinui.repository.CustomerRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import ui.vaadin.example.myvaadinui.models.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}