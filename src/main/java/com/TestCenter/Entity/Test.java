package com.TestCenter.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.ForeignKey;

@Entity
public class Test {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "test_id")
	    private int test_id;

	    //@ManyToOne
	   // @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_test_order_user"))
	  //  private User user;

	    //@ManyToOne
	   // @JoinColumn(name = "prescription_id", foreignKey = @ForeignKey(name = "fk_test_order_prescription"))
	  //  private Prescription prescription;

	    @Column(name = "test_name", nullable = false)
	    private String test_name;

	   

	    @Column(name = "test_date", nullable = false)
	    private Date test_date;

	    

	    public Test() {
	        // Default constructor
	    }
	 // Constructors, getters, and setters



		public int getTest_id() {
			return test_id;
		}



		public void setTest_id(int test_id) {
			this.test_id = test_id;
		}



		public String getTest_name() {
			return test_name;
		}



		public void setTest_name(String test_name) {
			this.test_name = test_name;
		}



		public Date getTest_date() {
			return test_date;
		}



		public void setTest_date(Date test_date) {
			this.test_date = test_date;
		}
		

	    // Getters and setters for the fields

	    /*public int getOrderId() {
	        return testId;
	    }

	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }*/

	   /* public User getUsers() {
	        return user;
	    }

	    public void setUsers(User user) {
	        this.user = user;
	    }

	    public Prescription getPrescriptions() {
	        return prescription;
	    }

	    public void setPrescription(Prescription prescription) {
	        this.prescription = prescription;
	    }*/

	   /* public String getTestName() {
	        return testName;
	    }

	    public void setTestName(String testName) {
	        this.testName = testName;
	    }

	    public String getTestDescription() {
	        return testDescription;
	    }

	    public void setTestDescription(String testDescription) {
	        this.testDescription = testDescription;
	    }

	    public Date getOrderDate() {
	        return orderDate;
	    }

	    public void setOrderDate(Date orderDate) {
	        this.orderDate = orderDate;
	    }*/
	    
	    
}
