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


    Almacen saveAlmacen(Almacen almacen);
    Factura saveFactura(Factura factura);
    FichaTecnica saveFichaTecnica(FichaTecnica fichaTecnica);
    Inventario saveInventario(Inventario inventario);
    Pago savePago(Pago pago);
    Pedido savePedido(Pedido pedido);
    PedidoDetalle savePedidoDetalle(PedidoDetalle pedidoDetalle);
    Producto saveProducto(Producto producto);
    Sede saveSede(Sede sede);


    long getTotalSedes();

}
