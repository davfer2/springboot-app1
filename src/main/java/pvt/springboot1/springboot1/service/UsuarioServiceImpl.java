package pvt.springboot1.springboot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pvt.springboot1.springboot1.modelo.Usuario;
import pvt.springboot1.springboot1.repository.UsuarioRepository;
@Service
public class UsuarioServiceImpl implements UsuarioService {

	
	@Autowired
	protected UsuarioRepository usuarioRepository;
	
	@Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		
		this.usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return this.usuarioRepository.findAll();
	}

	@Override
	public void deleteUsuario(long id) {
		// TODO Auto-generated method stub
		this.usuarioRepository.deleteById(id);
		
}

}
