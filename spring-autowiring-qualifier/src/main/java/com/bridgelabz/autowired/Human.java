package com.bridgelabz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octapusHeart")
	private Heart heart;
	
	public void startPumping() {
		if(heart!=null) {
		heart.pump();
		System.out.println("name of the animal is : "+ heart.getNameOfAnimal()+"\n no of heart is :" +heart.getNoOfHeart());
		}
		else {
			System.out.println("you are dead");
		}
	}

}
