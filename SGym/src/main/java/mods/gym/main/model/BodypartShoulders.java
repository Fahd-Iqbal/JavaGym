package mods.gym.main.model;

public class BodypartShoulders {
	public BodypartShoulders(String bodypartShouldersId, String workoutname, int reps, int sets, String type) {
		super();
		BodypartShouldersId = bodypartShouldersId;
		this.workoutname = workoutname;
		this.reps = reps;
		this.sets = sets;
		this.type = type;
	}
	private String BodypartShouldersId;
	private String workoutname;
	private int reps;
	private int sets;
	private String type;
	public String getBodypartShouldersId() {
		return BodypartShouldersId;
	}
	public void setBodypartShouldersId(String bodypartShouldersId) {
		BodypartShouldersId = bodypartShouldersId;
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
	@Override
	public String toString() {
		return "BodypartShoulders [BodypartShouldersId=" + BodypartShouldersId + ", workoutname=" + workoutname
				+ ", reps=" + reps + ", sets=" + sets + ", type=" + type + "]";
	}
}
