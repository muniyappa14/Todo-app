package tod.exm.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import todo.exm.Todo;

public interface Entryrepo extends MongoRepository<Todo, String> {
	
}
