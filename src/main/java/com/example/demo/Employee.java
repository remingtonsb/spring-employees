package com.example.demo;

// Creating an entity Employee
public class Employee {

	public Employee() {}

	// Parameterized Constructor
	// to assign the values
	// to the properties of
	// the entity
	public Employee(
		Integer id, Integer api, String firstName,
		String lastName, String email)
	{

		super();

		this.id = id;

        this.api = api;

		this.firstName = firstName;

		this.lastName = lastName;

		this.email = email;


		 
	}

	 private Integer id;

     private Integer api;

	 private String firstName;

	 private String lastName;

	 private String email;

     

	// Overriding the toString method
	// to find all the values
	@Override
 public String toString()
	{

		return "Employee [id="
			+ id + ", api="
            + api + ",firstName="
			+ firstName + ", lastName="
			+ lastName + ", email="
			+ email + "]";

		 
	}

	// Getters and setters of
	// the properties
	public Integer getId()
	{

		return id;
	}



	public void setId(Integer id)
	{

		this.id = id;
	}

    public Integer getApi()
	{

		return api;
	}

    

	public void setApi(Integer api)
	{

		this.api = api;
	}

   




	public String getFirstName()
	{

		return firstName;
	}

	public void setFirstName(
		String firstName)
	{

		this.firstName = firstName;
	}

	public String getLastName()
	{

		return lastName;
	}

	public void setLastName(
		String lastName)
	{

		this.lastName = lastName;
	}

	public String getEmail()
	{

		return email;
	}

	public void setEmail(String email)
	{

		this.email = email;
	}

    
}
