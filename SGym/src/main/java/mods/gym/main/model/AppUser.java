package mods.gym.main.model;
import java.util.Date;
import mods.gym.main.model.address;
import mods.gym.main.model.Trainer;
import mods.gym.main.model.TrainingSchedule;
public class AppUser {
    
	 
    private long userId;
    private String userName;
    private String firstName;
    private String lastName;
    private boolean enabled; // still need to decide on this based on fuctionality 
    private String gender;
    private String email;
    private String encrytedPassword;
    private int age; 
    private Date dob; 
    private double height;
    private double weight;
    private address Addr; // create a class where it0 will be an address
    private String goal; 
    private TrainingSchedule schedule; 
    private Trainer trainer; 
    private float bmi;
    public AppUser() {
 
    	
    }
 
    public AppUser(long userId, String userName, String firstName, String lastName, //
            boolean enabled, String gender, //
            String email, String encrytedPassword,Date dob, double height, address addr, String goal, TrainingSchedule schedule, //
            Trainer trainer, double weight) {
        super();
        this.setUserId(userId);
        this.setUserName(userName);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEnabled(enabled);
        this.setGender(gender);
        this.setEmail(email);
        this.setEncrytedPassword(encrytedPassword);
       // this.setAge(age);
        this.setDob(dob);
        this.setHeight(height);
        this.setAddress(addr);
        this.setGoal(goal);
        this.setSchedule(schedule);
        this.setTrainer(trainer);
        this.setWeight(weight);
    }

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public address getAddress() {
		return Addr;
	}

	public void setAddress(address Addr) {
		this.Addr = Addr;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public TrainingSchedule getSchedule() {
		return schedule;
	}

	public void setSchedule(TrainingSchedule schedule) {
		this.schedule = schedule;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public float getBmi() {
		return bmi;
	}

	public void setBmi(float bmi) {
		this.bmi = bmi;
	}
}