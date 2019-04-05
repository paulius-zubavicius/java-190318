package l15_db_jdbc;

public class AppJDBCInsertData {

	public static void main(String[] args) {

		PersonToDB ins = new PersonToDB("jdbc:postgresql://cloud:5432/appdb", "postgres", "postgre");

		Person jonas = new Person("Jonas", "Jonauskas");

		ins.personInsert(jonas);
		ins.personInsert(jonas);

		ins.personInsert(new Person("Algirdas", "Brazauskas"));

		
		System.out.println("done");
	}
}

class Person {

	private String name;
	private String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
