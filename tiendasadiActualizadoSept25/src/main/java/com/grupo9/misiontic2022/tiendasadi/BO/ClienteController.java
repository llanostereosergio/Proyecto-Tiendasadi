package com.grupo9.misiontic2022.tiendasadi.BO;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo9.misiontic2022.tiendasadi.DAO.ClienteDAO;
import com.grupo9.misiontic2022.tiendasadi.DTO.ClienteVO;


@RestController
public class ClienteController {
	
	/*
	 * @GetMapping obtener o buscar
	 * @PostMapping insertar o agregar
	 * @PutMapping modificar o actualizar
	 * @DeleteMapping eliminar o borrar
	 * */

	@PostMapping("/registrarcliente")
	public void registrarCliente(ClienteVO clien) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.registrarCliente(clien);
	}

	@GetMapping("/consultarcliente")
	public ArrayList<ClienteVO> consultarClientes(String cliente) {
		ClienteDAO Dao = new ClienteDAO();
		return Dao.consultarCliente(cliente);
	}

	@GetMapping("/listarclientes")
	public ArrayList<ClienteVO> listaDeClientes() {
		ClienteDAO Dao = new ClienteDAO();
		return Dao.listaDeClientes();
	}
	
	@DeleteMapping("/eliminarcliente")
	public void eliminarCliente(Integer cedula_cliente) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.eliminarCliente(cedula_cliente);
	}
	
	@PutMapping("/actualizarclientes")
	public void actualizarCliente(ClienteVO clien) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.actualizarCliente(clien);
	}
	
	

}
