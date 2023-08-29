package com.mobitel.mobitel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="customer_id")
    private int customerId;

    @Column(name="customer_name",length = 100,nullable = false)
    private String customerName;

    @Column(name="customer_address",length = 200)
    private String customerAddress;

    @Column(name="customer_salary")
    private double customerSalary;

    @Column(name = "nic")
    private String nic;

    @Column(name = "active_state",columnDefinition = "TINYINT default 0")
    private boolean activeStatus;

    public Customer() {

    }

    public Customer(int customerId, String customerName, String customerAddress, double customerSalary, String nic, boolean activeStatus) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerSalary = customerSalary;
        this.nic = nic;
        this.activeStatus = activeStatus;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public double getCustomerSalary() {
        return customerSalary;
    }

    public String getNic() {
        return nic;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerSalary(double customerSalary) {
        this.customerSalary = customerSalary;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerSalary=" + customerSalary +
                ", nic='" + nic + '\'' +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
