package todo.exm.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tod.exm.repo.Entryrepo;
import todo.exm.Todo;

@Service

public class Entryserv {
@Autowired
Entryrepo erepo;

public void add(Todo todo) {
	erepo.save(todo);
}
}
