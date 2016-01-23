package exceptionDemo2;


	public class Paramters {
		
		String name;
		String number;
		String phone;
		String gender;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public Paramters() {
			super();
		}
		public Paramters(String name, String number) {
			super();
			this.name = name;
			this.number = number;
		}
}
