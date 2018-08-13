package pvt.springboot1.springboot1.service;

import java.util.List;

import pvt.springboot1.springboot1.modelo.Usuario;

public interface UsuarioService {
	
	void save(Usuario usuario);

	List<Usuario> findAll();

	void deleteUsuario(long id);
}
