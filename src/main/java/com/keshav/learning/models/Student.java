package com.keshav.learning.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Student {

	 	@ApiModelProperty(notes = "Name of the Student",name="name",required=true,value="test name")
	    private String name;
	 
	    @ApiModelProperty(notes = "Class of the Student",name="cls",required=true,value="test class")
	    private String cls;
	 
	    @ApiModelProperty(notes = "Country of the Student",name="country",required=true,value="test country")
	    private String country;
	    
	    @Override
	    public String toString() {
	        return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
	    }
}
