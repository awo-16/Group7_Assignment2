package com.csis3275.model;

/**
 * Model_eri_77 is a model class representing an individual with an image name
 * and a personal description. It is used to encapsulate data for an individual
 * member, including their image and a brief bio or description.
 */
public class Model_eri_77 {

	private String imageName;
	private String description;

	/**
	 * Constructs a new Model_eri_77 instance with the specified image name and
	 * description.
	 *
	 * @param imageName   The name of the image associated with the individual.
	 * @param description A brief textual description of the individual.
	 */
	public Model_eri_77() {
		setImageName("Elson");
		setDescription(
				"Hello! I'm Elson Ricafrente, a dedicated IT professional from the Philippines, currently enriching my expertise in cyber security through the PBD Cyber Security program. With a strong foundation in technology, I work as an IT Support Specialist, applying my skills to troubleshoot, maintain, and enhance IT systems. Passionate about staying ahead in the ever-evolving field of information technology, I'm committed to leveraging my knowledge and experience to protect digital assets and infrastructure.");
	}

	/**
	 * Returns the image name associated with the individual.
	 *
	 * @return A string representing the image name.
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * Sets the image name for this individual.
	 *
	 * @param imageName The new image name to be set.
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * Returns the description of the individual.
	 *
	 * @return A string representing the personal description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description for this individual.
	 *
	 * @param description The new description to be set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
