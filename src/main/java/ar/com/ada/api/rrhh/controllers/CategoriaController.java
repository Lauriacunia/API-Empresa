package main.java.ar.com.ada.api.rrhh.controllers;

import ar.com.ada.api.rrhh.services.CategoriaService;

@RestController
public class CategoriaController {

@Autowired
CategoriaService categoriaService;

// hacer los metodos get, set, put, etc

// get categorias Todas . sin empleados

@GetMapping("/categorias")
    public List<Categorias> getCategorias(@RequestParam(value = "nombre", required = false) String nombre) {
        List<Categorias> lc;

            lc = categoriaService.buscarTodasLasCategorias();

        return lc;
    }
    
}