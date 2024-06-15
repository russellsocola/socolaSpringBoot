package com.socola.out.socolaSpringBoot.controller.Administracion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.socola.out.socolaSpringBoot.entity.Administracion.*;
import com.socola.out.socolaSpringBoot.service.Interface.IAdministracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Administracion/POST")
public class AdministracionControllerPOST {

    @Autowired
    private IAdministracionService iAdministracionService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping("SaveAdministrador")
    public Administrador saveAdministrador(@RequestBody String jsonAdministrador) throws JsonProcessingException {
        Administrador admin = objectMapper.readValue(jsonAdministrador,Administrador.class);
        return iAdministracionService.saveAdministrador(admin);
    }

    @PostMapping("saveCliente")
    public Cliente saveCliente(@RequestBody String jsonCliente) throws JsonProcessingException {
        Cliente client = objectMapper.readValue(jsonCliente,Cliente.class);
        return iAdministracionService.saveCliente(client);
    }

    @PostMapping("saveEmpleado")
    public Empleado saveEmpleado(@RequestBody String jsonEmpleado) throws JsonProcessingException {
        Empleado empleado = objectMapper.readValue(jsonEmpleado,Empleado.class);
        return iAdministracionService.saveEmpleado(empleado);
    }

    @PostMapping("saveProveedor")
    public Proveedor saveProveedor(@RequestBody String jsonProveedor) throws JsonProcessingException {
        Proveedor proveedor = objectMapper.readValue(jsonProveedor,Proveedor.class);
        return iAdministracionService.saveProveedor(proveedor);
    }

    @PostMapping("saveUsuario")
    public Usuario saveUsuario(@RequestBody String jsonUsuario) throws JsonProcessingException {
        Usuario usuario = objectMapper.readValue(jsonUsuario,Usuario.class);
        return iAdministracionService.savaUsuario(usuario);
    }
}
