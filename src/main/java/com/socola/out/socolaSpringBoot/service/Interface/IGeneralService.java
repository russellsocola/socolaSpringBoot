package com.socola.out.socolaSpringBoot.service.Interface;

import com.socola.out.socolaSpringBoot.entity.General.*;

import java.util.List;

public interface IGeneralService {

    List <Almacen> listarAlmacenes();
    List <Factura> listarFacturas();
    List <FichaTecnica> listarFichasTecnicas();
    List <Inventario> listarInventarios();
    List <Pago> listarPagos();
    List <Pedido> listarPedidos();
    List <PedidoDetalle> listarPedidoDetalles();
    List <Producto> listarProductos();
    List <Sede> listarSedes();


    Almacen findByAlmacen(Long almacen);
    Factura findByFactura(Long factura);
    FichaTecnica findByFichaTecnica(Long ficha);
    Inventario findByInventario(Long inventario);
    Pago findByPago(Long pago);
    Pedido findByPedido(Long pedido);
    PedidoDetalle findByPedidoDetalle(Long pedidoDetalle);
    Producto findByProducto(Long producto);
    Sede findBySede(Long sede);


    String saveAlmacen(Almacen almacen);
    String saveFactura(Factura factura);
    String saveFichaTecnica(FichaTecnica fichaTecnica);
    String saveInventario(Inventario inventario);
    String savePago(Pago pago);
    String savePedido(Pedido pedido);
    String savePedidoDetalle(PedidoDetalle pedidoDetalle);
    String saveProducto(Producto producto);
    String saveSede(Sede sede);

}
