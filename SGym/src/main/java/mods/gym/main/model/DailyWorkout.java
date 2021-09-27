package mods.gym.main.model;


public class DailyWorkout {



	private long dailyWorkoutId;
	private int day;
	private BodypartBack back[];
	private BodypartShoulders shoulders[];
	
	private BodypartChest chest[];
	private BodypartBiceps biceps[];
	private BodypartTriceps triceps[];
	private BodypartLegs legs[];
	
	public DailyWorkout(long dailyWorkoutId, int day, BodypartBack[] back, BodypartShoulders[] shoulders,
			BodypartChest[] chest, BodypartBiceps[] biceps, BodypartTriceps[] triceps, BodypartLegs[] legs) {
		super();
		this.dailyWorkoutId = dailyWorkoutId;
		this.day = day;
		this.back = back;
		this.shoulders = shoulders;
		this.chest = chest;
		this.biceps = biceps;
		this.triceps = triceps;
		this.legs = legs;
	}
	
	
	public long getDailyWorkoutId() {
		return dailyWorkoutId;
	}
	public void setDailyWorkoutId(long dailyWorkoutId) {
		this.dailyWorkoutId = dailyWorkoutId;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public BodypartBack[] getBack() {
		return back;
	}
	public void setBack(BodypartBack[] back) {
		this.back = back;
	}
	public BodypartShoulders[] getShoulders() {
		return shoulders;
	}
	public void setShoulders(BodypartShoulders[] shoulders) {
		this.shoulders = shoulders;
	}
	public BodypartChest[] getChest() {
		return chest;
	}
	public void setChest(BodypartChest[] chest) {
		this.chest = chest;
	}
	public BodypartBiceps[] getBiceps() {
		return biceps;
	}
	public void setBiceps(BodypartBiceps[] biceps) {
		this.biceps = biceps;
	}
	public BodypartTriceps[] getTriceps() {
		return triceps;
	}
	public void setTriceps(BodypartTriceps[] triceps) {
		this.triceps = triceps;
	}
	public BodypartLegs[] getLegs() {
		return legs;
	}
	public void setLegs(BodypartLegs[] legs) {
		this.legs = legs;
	}

}
