package com.stiven.Concesionario.app.controlador;

import com.stiven.Concesionario.app.entity.Concesionario;
import com.stiven.Concesionario.app.implementacion.ConcesionarioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/Concesionario")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})

public class ConcesionarioController {
    @Autowired
    ConcesionarioImpl concesionarioimpl;

    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<Map<String,Object>> encontrarTodos(){
        List<Concesionario> listaConcesionario= this.concesionarioimpl.encontrarTodos();

        Map<String,Object> res=new HashMap<>();
        res.put("status","ok");
        res.put("data",listaConcesionario);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
