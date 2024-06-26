package com.sip.ams.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(length = 64, unique = true, nullable = false)
    private String name;
     
    private float price;
     
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
 
    public Product() {
    }
 
    // getters and setters are not shown for brevity...
 
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	} 
}     
