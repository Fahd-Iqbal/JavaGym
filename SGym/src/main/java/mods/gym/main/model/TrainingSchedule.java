package mods.gym.main.model;


public class TrainingSchedule {


	private long scheduleId; 
	private DailyWorkout day;
	
	public TrainingSchedule(long scheduleId, DailyWorkout day) {
		super();
		this.scheduleId = scheduleId;
		this.day = day;
	}
	
	
	public long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public DailyWorkout getDay() {
		return day;
	}
	public void setDay(DailyWorkout day) {
		this.day = day;
	} 
	
	
	
}