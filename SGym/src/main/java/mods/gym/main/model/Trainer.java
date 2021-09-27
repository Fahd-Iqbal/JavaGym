package mods.gym.main.model;

import java.util.Date;

public class Trainer {


		private long trainerId;
	    private String trainerFirstName;
	    private String trainerLastName;
	    private String gender;
	    private String email;
	    private String encrytedPassword;
	    private int age; 
	    private Date dob; 
	    private int experience;
	    private String associatedGym; 
	    
		public Trainer() {
			//defualt constructor 
	}
	    
	    public Trainer(long trainerId, String trainerFirstName, String trainerLastName, String gender, String email,
			String encrytedPassword, int age, Date dob, int experience, String associatedGym) {
		super();
		this.trainerId = trainerId;
		this.trainerFirstName = trainerFirstName;
		this.trainerLastName = trainerLastName;
		this.gender = gender;
		this.email = email;
		this.encrytedPassword = encrytedPassword;
		this.age = age;
		this.dob = dob;
		this.experience = experience;
		this.associatedGym= associatedGym;
	}
	    
	    
	    
		public long getTrainerId() {
			return trainerId;
		}
		public void setTrainerId(long trainerId) {
			this.trainerId = trainerId;
		}
		public String getTrainerFirstName() {
			return trainerFirstName;
		}
		public void setTrainerFirstName(String trainerFirstName) {
			this.trainerFirstName = trainerFirstName;
		}
		public String getTrainerLastName() {
			return trainerLastName;
		}
		public void setTrainerLastName(String trainerLastName) {
			this.trainerLastName = trainerLastName;
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
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}

		public String getAssociatedGym() {
			return associatedGym;
		}

		public void setAssociatedGym(String associatedGym) {
			this.associatedGym = associatedGym;
		} 
	    
	
	
	
}
