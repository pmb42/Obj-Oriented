/**
 * 
 */

public class Person {
	private long serialVersionUID;

	public long getSerialVersionUID() {
		// begin-user-code
		return serialVersionUID;
		// end-user-code
	}

	public void setSerialVersionUID(long serialVersionUID) {
		// begin-user-code
		this.serialVersionUID = serialVersionUID;
		// end-user-code
	}

	private String mFirstName;

	public String getmFirstName() {
		// begin-user-code
		return mFirstName;
		// end-user-code
	}

	public void setmFirstName(String mFirstName) {
		// begin-user-code
		this.mFirstName = mFirstName;
		// end-user-code
	}

	private String mMiddleName;

	public String getmMiddleName() {
		// begin-user-code
		return mMiddleName;
		// end-user-code
	}

	public void setmMiddleName(String mMiddleName) {
		// begin-user-code
		this.mMiddleName = mMiddleName;
		// end-user-code
	}

	private String mLastName;

	public String getmLastName() {
		// begin-user-code
		return mLastName;
		// end-user-code
	}

	public void setmLastName(String mLastName) {
		// begin-user-code
		this.mLastName = mLastName;
		// end-user-code
	}

	public Person() {
		// begin-user-code
		this.mFirstName = "Sally";
		this.mMiddleName = "Jane";
		this.mLastName = "Williams";
		// end-user-code
	}
	
	public Person(String FirstName, String MiddleName, String LastName)
	{	
	   this.mFirstName = FirstName;
	   this.mMiddleName = MiddleName;
	   this.mLastName = LastName;
	}
}