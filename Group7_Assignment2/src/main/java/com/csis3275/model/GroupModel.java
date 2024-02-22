package com.csis3275.model;

import java.util.List;

/**
 * GroupModel is a model class representing a group with a list of image names and a description.
 * It encapsulates the data for a group, including its members and a description about the group.
 */
public class GroupModel {

	private List<String> imageNames;
	private String groupDescription;

    /**
     * Constructs a new GroupModel with the specified list of image names and group description.
     *
     * @param imageNames A list of strings representing the names of the images for the group members.
     * @param groupDescription A string representing the description of the group.
     */
	public GroupModel(List<String> imageNames, String groupDescription) {
		this.imageNames = imageNames;
		this.groupDescription = groupDescription;
	}

    /**
     * Returns the list of image names for the group members.
     *
     * @return A list of strings representing the image names.
     */
	public List<String> getImageNames() {
		return imageNames;
	}
	
    /**
     * Sets the list of image names for the group members.
     *
     * @param imageNames A list of strings representing the new image names to be set.
     */
	public void setImageNames(List<String> imageNames) {
		this.imageNames = imageNames;
	}

    /**
     * Returns the description of the group.
     *
     * @return A string representing the group description.
     */
	public String getGroupDescription() {
		return groupDescription;
	}

    /**
     * Sets the description of the group.
     *
     * @param groupDescription A string representing the new description of the group.
     */
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

}
