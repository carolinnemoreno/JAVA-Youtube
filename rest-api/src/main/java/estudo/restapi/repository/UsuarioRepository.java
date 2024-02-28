package estudo.restapi.repository;

import estudo.restapi.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UserModel,Integer> {
}


