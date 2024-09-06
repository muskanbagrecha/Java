package src.LLD.interview.carrentalsystem.service;


import src.LLD.interview.carrentalsystem.models.User;
import src.oops.SOLID.SRP.Customer;

import java.util.HashMap;

public class UserService {
    HashMap<String, User> customers;

    public UserService() {
        this.customers = new HashMap<>();
    }

    public boolean addCustomer(User user){
        if(customers.containsKey(user.getUserId())){
            return false;
        }
        customers.put(user.getUserId(), user);
        return true;
    }

    public User getCustomerbyId(String customerId){
        return customers.get(customerId);
    }
}

