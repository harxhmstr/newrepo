package prac;

public class Task {
	private String title;
	private String priority;
	Task(String title, String priority){
		this.title = title;
		this.priority=priority;
	}
	Task(){}
	
	public String getTitle() {
		return this.title;
	}
	public String getPriority() {
		return this.priority;
	}
}
