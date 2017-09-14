import java.util.Date;


public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	    student new= getStudent();
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		student new= setStudent();
	}

	@Override
	public Student getStudent(int index) {
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		
	}

	@Override
	public void addFirst(Student student) {
           student new= addStudent();
	}

	@Override
	public void addLast(Student student) {
		student new= addLastStudent();
	}

	@Override
	public void add(Student student, int index) {
		
	}

	@Override
	public void remove(int index) {
		
	}

	@Override
	public void remove(Student student) {
		
	}

	@Override
	public void removeFromIndex(int index) {
		
	}

	@Override
	public void removeFromElement(Student student) {
		
	}

	@Override
	public void removeToIndex(int index) {
		
	}

	@Override
	public void removeToElement(Student student) {
		
	}

	@Override
	public void bubbleSort() {
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		
		return null;
	}
}
