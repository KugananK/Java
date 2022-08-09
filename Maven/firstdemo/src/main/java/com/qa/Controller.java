package com.qa;

public class Controller {
	
	private PetShop petShop;


	public Controller(PetShop petShop) {
		super();
		this.petShop = petShop;
	}
	

	public Bird createBird(Bird bird) {
		Bird addedBird = petShop.addBird(bird); // Telling our petShop to run the addBird() 
		System.out.println(bird.getName() + " added to petshop!");
		return addedBird;
	}
	

	public Bird readBirdById(int id) {
		Bird bird = petShop.getBirdById(id); // passing in our id to the petshop.getBirdById()
		return bird; 
	}
	

	public boolean deleteBird(int id) {
		boolean deleted = petShop.deleteBirdById(id);
		System.out.println("bird of id: " + id + " has been removed :( ");
		return deleted;
	}
	

	public Bird updateBird(int id, Bird bird) {
		Bird updatedBird = petShop.updateBirdById(id, bird);
		System.out.println(bird.getName() + " has been updated!");
		return updatedBird;
	}
	

}

