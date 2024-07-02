package com.socola.out.socolaSpringBoot.controller.General;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.socola.out.socolaSpringBoot.entity.General.*;
import com.socola.out.socolaSpringBoot.service.Interface.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("General/POST")
public class GeneralControllerPOST {

    @Autowired
    private IGeneralService iGeneralService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping("SaveAlmacen")
    public Almacen saveAlmacen(@RequestBody String jsonAlmacen)throws JsonProcessingException {
        Almacen almacen = objectMapper.readValue(jsonAlmacen,Almacen.class);
        return iGeneralService.saveAlmacen(almacen);
    }

    @PostMapping("SaveFactura")
    public Factura saveFactura(@RequestBody String jsonFactura) throws JsonProcessingException {
        Factura factura = objectMapper.readValue(jsonFactura, Factura.class);
        return iGeneralService.saveFactura(factura);
    }

    @PostMapping("SaveFichaTecnica")
    public FichaTecnica saveFichaTecnica(@RequestBody String jsonFichaTecnica) throws JsonProcessingException {
        FichaTecnica fichaTecnica = objectMapper.readValue(jsonFichaTecnica,FichaTecnica.class);
        return iGeneralService.saveFichaTecnica(fichaTecnica);
    }

    @PostMapping("SaveInventario")
    public Inventario saveInventario(@RequestBody String jsonInventario) throws JsonProcessingException {
        Inventario inventario = objectMapper.readValue(jsonInventario, Inventario.class);
        return iGeneralService.saveInventario(inventario);
    }

    @PostMapping("SavePago")
    public Pago savePago(@RequestBody String jsonPago) throws JsonProcessingException {
        Pago pago = objectMapper.readValue(jsonPago, Pago.class);
        return iGeneralService.savePago(pago);
    }

    @PostMapping("SavePedido")
    public Pedido savePedido(@RequestBody String jsonPedido) throws JsonProcessingException {
        Pedido pedido = objectMapper.readValue(jsonPedido, Pedido.class);
        return iGeneralService.savePedido(pedido);
    }

    @PostMapping("SavePedidoDetalle")
    public PedidoDetalle savePedidoDetalle(@RequestBody String jsonPedidoDetalle) throws JsonProcessingException {
        PedidoDetalle pedidoDetalle = objectMapper.readValue(jsonPedidoDetalle,PedidoDetalle.class);
        return iGeneralService.savePedidoDetalle(pedidoDetalle);
    }

    @PostMapping("SaveProducto")
    public Producto saveProducto(@RequestBody String jsonProducto) throws JsonProcessingException {
        Producto producto = objectMapper.readValue(jsonProducto,Producto.class);
        return iGeneralService.saveProducto(producto);
    }

    @PostMapping("SaveSede")
    public Sede saveSede(@RequestBody String jsonSede) throws JsonProcessingException {
        Sede sede = objectMapper.readValue(jsonSede, Sede.class);
        return iGeneralService.saveSede(sede);
    }
}
