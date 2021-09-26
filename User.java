package exam1;

public class User {
	
	private String phoneNm;
	private String name;
	private String age;
	
	public User(String name, String age, String phoneNm) {
		setphoneNm(phoneNm);
		setName(name);
		setAge(age);
	}
	
	public String phone_format(String number) {
		String regEx = "(\\d{3})(\\d{3,4})(\\d{4})"; 
		return number.replaceAll(regEx, "$1-$2-$3");
		}
	
	
	   public String getphoneNm() {
	        return phoneNm;
	    }
	    public void setphoneNm(String phoneNm) {
	        this.phoneNm = phoneNm;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getAge() {
	        return age;
	    }
	    public void setAge(String age) {
	        this.age = age;
	    }

}
