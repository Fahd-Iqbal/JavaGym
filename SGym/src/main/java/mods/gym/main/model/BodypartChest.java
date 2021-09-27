package mods.gym.main.model;

public class BodypartChest {
	
	private String BodypartChestId;
	private String workoutname;
	private int reps;
	private int sets;
	private String type;
	
	public BodypartChest(String bodypartChestId, String workoutname, int reps, int sets, String type) {
		super();
		BodypartChestId = bodypartChestId;
		this.workoutname = workoutname;
		this.reps = reps;
		this.sets = sets;
		this.type = type;
	}

	public String getBodypartChestId() {
		return BodypartChestId;
	}
	public void setBodypartChestId(String bodypartChestId) {
		BodypartChestId = bodypartChestId;
	}
	public String getWorkoutname() {
		return workoutname;
	}
	public void setWorkoutname(String workoutname) {
		this.workoutname = workoutname;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public int getSets() {
		return sets;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
