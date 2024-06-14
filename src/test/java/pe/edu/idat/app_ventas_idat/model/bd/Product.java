package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.security.PrivateKey;
@Getter
@Setter
@Entity
@Table( name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productid;

 //@Column(name = "productname")

    private String productname;

    private String quantityperunit;

    private double unitprice;

    private Integer unitsinstock;

    private Integer unitsonorder;

    private Integer reorderlevel;

    private boolean discontinued;

    private Integer categoriid;
}
