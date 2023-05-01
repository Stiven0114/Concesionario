package com.stiven.Concesionario.app.controlador;

import com.stiven.Concesionario.app.entity.Empleado;
import com.stiven.Concesionario.app.implementacion.EmpleadoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/Empleado")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class EmpleadoController {
    @Autowired
    EmpleadoImpl empleadoimpl;

    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<Map<String,Object>> encontrarTodos(){
        List<Empleado> listaEmpleado= this.empleadoimpl.encontrarTodos();
        System.out.println(listaEmpleado.toString());
        Map<String,Object> res=new HashMap<>();
        res.put("status","ok");
        res.put("data",listaEmpleado);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
