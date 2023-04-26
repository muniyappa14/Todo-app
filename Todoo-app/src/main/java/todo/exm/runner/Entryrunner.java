package todo.exm.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import todo.exm.Todo;
import todo.exm.serv.Entryserv;

@RestController
public class Entryrunner {
@Autowired
Entryserv Entryserv ;
@PostMapping("/todoadd")
public void todoadd(@RequestBody Todo todo) {
	Entryserv.add(todo);
}

}
