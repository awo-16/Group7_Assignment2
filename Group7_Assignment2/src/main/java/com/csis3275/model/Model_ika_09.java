package com.csis3275.model;

public class Model_ika_09 {

	// Fields
	private String imageName;
	private String description;

	// Constructor
	public Model_ika_09() {
		setImageName("Ian");
		setDescription(
				"I am a passionate and driven individual with a deep fascination for technology and a strong desire to make a meaningful impact through software engineering."
						+ "My ultimate goal is to leverage my passion for software engineering to create impactful and user-centric solutions that address real-world problems. I am excited about the endless possibilities that technology offers and am dedicated to continuously improving my skills to become a proficient and versatile software engineer.");
	}

	// Getters and Setters

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
