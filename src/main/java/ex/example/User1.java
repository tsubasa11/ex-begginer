package ex.example;

public class User1 {

	private Integer id;
	private String name;
	private Integer age;
	private Integer dep_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDep_id() {
		return dep_id;
	}

	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", age=" + age + ", dep_id=" + dep_id + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getDep_id()=" + getDep_id()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
