package Aplicacion.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Aplicacion.Modelo.Equipos;
import Aplicacion.Modelo.Repositorio.EquiposRepo;

@RestController
public class Controolaor{

	
	@Autowired 
	EquiposRepo equiposDAO;
	
	@GetMapping("/equipos")
	public List<Equipos> listar(){
		System.out.println("listar");
		return this.equiposDAO.findAll();
	}
	
	@GetMapping("/equipos/{nombre}")
	public Equipos listaUnequipo(@PathVariable String nombre) {
		return this.equiposDAO.findById(nombre).orElse(new Equipos());
	}
	
	@DeleteMapping("/equipos/delete/{nombre}")
	public Equipos eliminarUnEquipo(@PathVariable String nombre) {
		if(this.equiposDAO.existsById(nombre)) {
			Equipos eliminado=this.equiposDAO.findById(nombre).get();
			this.equiposDAO.deleteById(nombre);
			return eliminado;
		}else return new Equipos();
		
	}
	
	@PutMapping("/equipos/modificar")
	public boolean modificar(@RequestBody Equipos modi) {
		if(this.equiposDAO.existsById(modi.getCiudad())){
			this.equiposDAO.save(modi);
			return true;
		}else return false;
		
	}
	
	@PostMapping("/equipos/nuevo")
	public boolean nuevoEquipo(@RequestBody Equipos nuevo) {
		if(this.equiposDAO.existsById(nuevo.getNombre())) {
			this.equiposDAO.save(nuevo);
			return true;
		}else return false;
	}
	
}
