package ex.example;

import javax.validation.constraints.NotBlank;

public class UserForm {
	@NotBlank(message="入力してください")
	private String name;
	@NotBlank(message="入力してください")
	private String age;
	@NotBlank(message="入力してください")
	private String comment;

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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
