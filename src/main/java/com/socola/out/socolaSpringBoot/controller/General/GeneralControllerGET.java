package com.socola.out.socolaSpringBoot.controller.General;

import com.socola.out.socolaSpringBoot.entity.General.*;
import com.socola.out.socolaSpringBoot.service.Interface.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("General/GET")
public class GeneralControllerGET {

    @Autowired
    private IGeneralService iGeneralService;

    //Almacenes
    @GetMapping("ListAlmacenes")
    public ResponseEntity<List <Almacen>> getListAlmacenes(){
        return ResponseEntity.ok(iGeneralService.listarAlmacenes());
    }

    @GetMapping("FindAlmacenes/{idAlmacenes}")
    public ResponseEntity<Almacen> findAlmacen(@PathVariable Long idAlmacenes){
        return ResponseEntity.ok(iGeneralService.findByAlmacen(idAlmacenes));
    }

    //Facturas
    @GetMapping("ListFacturas")
    public ResponseEntity<List<Factura>> getListFacturas(){
        return ResponseEntity.ok(iGeneralService.listarFacturas());
    }

    @GetMapping("FindFactura/{idFactura}")
    public ResponseEntity<Factura> findFactura(@PathVariable Long idFactura){
        return ResponseEntity.ok(iGeneralService.findByFactura(idFactura));
    }

    //FichasTecnicas
    @GetMapping("ListFichasTecnicas")
    public ResponseEntity<List<FichaTecnica>> getListFichasTecnicas(){
        return ResponseEntity.ok(iGeneralService.listarFichasTecnicas());
    }

    @GetMapping("FindFichaTecnica/{idFichaTecnica}")
    public ResponseEntity<FichaTecnica> findFichaTecnica(@PathVariable Long idFichaTecnica){
        return ResponseEntity.ok(iGeneralService.findByFichaTecnica(idFichaTecnica));
    }

    //Inventarios
    @GetMapping("ListInventarios")
    public ResponseEntity<List<Inventario>> getListInventarios(){
        return ResponseEntity.ok(iGeneralService.listarInventarios());
    }

    @GetMapping("FindInventario/{idInventario}")
    public ResponseEntity<Inventario> findInvventario(@PathVariable Long idInventario){
        return ResponseEntity.ok(iGeneralService.findByInventario(idInventario));
    }

    //Pagos
    @GetMapping("ListPagos")
    public ResponseEntity<List<Pago>> getListPagos(){
        return ResponseEntity.ok(iGeneralService.listarPagos());
    }

    @GetMapping("FindPago/{idPago}")
    public ResponseEntity<Pago> findPago(@PathVariable Long idPago){
        return ResponseEntity.ok(iGeneralService.findByPago(idPago));
    }

    //Pedidos
    @GetMapping("ListPedidos")
    public ResponseEntity<List<Pedido>> getListPedidos(){
        return ResponseEntity.ok(iGeneralService.listarPedidos());
    }

    @GetMapping("FindPedidos/{idPedidos}")
    public ResponseEntity<Pedido> findPedido(@PathVariable Long idPedidos){
        return ResponseEntity.ok(iGeneralService.findByPedido(idPedidos));
    }

    //PedidosDetalles
    @GetMapping("ListPedidosDetalles")
    public ResponseEntity<List<PedidoDetalle>> getListPedidosDetalles(){
        return ResponseEntity.ok(iGeneralService.listarPedidoDetalles());
    }

    @GetMapping("FindPedidosDetalles/{isPedidosDetalles}")
    public ResponseEntity<PedidoDetalle> findPedioDetalle(@PathVariable Long isPedidosDetalles){
        return ResponseEntity.ok(iGeneralService.findByPedidoDetalle(isPedidosDetalles));
    }

    //Productos
    @GetMapping("ListProductos")
    public ResponseEntity<List<Producto>> getListProducto(){
        return ResponseEntity.ok(iGeneralService.listarProductos());
    }

    @GetMapping("FindProductos/{idProducto}")
    public ResponseEntity<Producto> findProducto(@PathVariable Long idProducto){
        return ResponseEntity.ok(iGeneralService.findByProducto(idProducto));
    }

    //Sedes
    @GetMapping("ListSedes")
    public ResponseEntity<List<Sede>> getListSedes(){
        return ResponseEntity.ok(iGeneralService.listarSedes());
    }

    @GetMapping("FindSedes/{idSede}")
    public ResponseEntity<Sede> findSede(@PathVariable Long idSede){
        return ResponseEntity.ok(iGeneralService.findBySede(idSede));
    }
}

