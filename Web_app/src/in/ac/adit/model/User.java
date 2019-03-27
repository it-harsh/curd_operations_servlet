package in.ac.adit.model;

public class User {
		private String uname;
		private String pass;
		
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		
		@Override
		public String toString() {
			return "user [uname=" + uname + ", pass=" + pass + "]";
		}
		
		
}
