package todo.exm;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Todo {
private String task;
private String tasktype;
public String getTask() {
	return task;
}
public void setTask(String task) {
	this.task = task;
}
public String getTasktype() {
	return tasktype;
}
public void setTasktype(String tasktype) {
	this.tasktype = tasktype;
}


}
