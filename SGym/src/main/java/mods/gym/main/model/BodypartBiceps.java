package mods.gym.main.model;

public class BodypartBiceps {

	private String BodypartBicepsId;
	private String workoutname;
	private int reps;
	private int sets;
	private String type;
	
	public BodypartBiceps(String bodypartBicepsId, String workoutname, int reps, int sets, String type) {
		super();
		BodypartBicepsId = bodypartBicepsId;
		this.workoutname = workoutname;
		this.reps = reps;
		this.sets = sets;
		this.type = type;
	}
	
	
	public String getBodypartBicepsId() {
		return BodypartBicepsId;
	}
	public void setBodypartBicepsId(String bodypartBicepsId) {
		BodypartBicepsId = bodypartBicepsId;
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
