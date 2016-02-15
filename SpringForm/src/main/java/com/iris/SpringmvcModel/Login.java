package com.iris.SpringmvcModel;

public class Login {
		
		private String userId;
	    private String password;
	    private String name;
	    private String gender;
	    private String course;
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getuserId() {
			return userId;
		}
		public void setuserId(String userId) {
			this.userId = userId;
		}
		public String getpassword() {
			return password;
		}
		public void setpassword(String password) {
			this.password = password;
		}
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name = name;
		}
		public String getGender() {  
	        return gender;  
	    }  
	  
	    public void setGender(String gender) {  
	        this.gender = gender;  
	    }  
	}

