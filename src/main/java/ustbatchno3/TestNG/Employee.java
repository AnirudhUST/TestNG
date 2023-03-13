package ustbatchno3.TestNG;

/**
 * Hello world!
 *
 */
public class Employee 
{
    private String name;
    private int age;
    private String deptmnt;
	/**
	 * @param name
	 * @param age
	 * @param deptmnt
	 */
	public Employee(String name, int age, String deptmnt) {
		super();
		this.name = name;
		this.age = age;
		this.deptmnt = deptmnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDeptmnt() {
		return deptmnt;
	}
	public void setDeptmnt(String deptmnt) {
		this.deptmnt = deptmnt;
	}
    
}
