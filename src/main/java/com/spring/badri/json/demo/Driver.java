package com.spring.badri.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

    try {
    	
    	//create object mapper
    	ObjectMapper objMapper = new ObjectMapper();
    	
    	
    	//convert json to java POJO
    	//data/sample-lite.json
       //Student studentData = objMapper.readValue(new File("data/sample-lite.json"), Student.class);
      Student studentData = objMapper.readValue(new File("data/sample-full.json"), Student.class);
    
    	//print the data from json file
       System.out.println("First Name : " + studentData.getFirstName());
       System.out.println("Last Name : " + studentData.getLastName());
       System.out.println("ID : " + studentData.getId());
       System.out.println("Active Status : " + studentData.getActive());
       
       //getting languages
        String langs [] = studentData.getLanguages();
        
       
       System.out.println("All Languages  : " );
       for(String lang : langs ) {
    	   System.out.println(" " +lang );
       }
       
       //for the address printing 
       Address address= studentData.getAddress();
       System.out.println("city is " + address.getCity());
       System.out.println("country is " + address.getCountry());
       
    }

    catch(Exception e) {e.printStackTrace();
    
    }
}

}
