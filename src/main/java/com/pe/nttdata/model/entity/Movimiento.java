package com.pe.nttdata.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pe.nttdata.model.domain.BaseDomain;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Date;

/**
 *<b>Class</b>: {@link Movimiento}<br/>
 *<b>Copyright</b>: &Copy; 2024 NTTDATA Per&uacute;. <br/>
 *<b>Company</b>: NTTDATA del Per&uacute;. <br/>
 *
 *@author NTTDATA Per&uacute;. (EVE) <br/>
 *<u>Developed by</u>: <br/>
 *<ul>
 *<li>Hugo Oliveros Monti</li>
 *</ul>
 *<u>Changes</u>:<br/>
 *<ul>
 *<li>feb. 29, 2024 (acronym) Creation class.</li>
 *</ul>
 *@version 1.0
 */
@Document(collection = "Movimiento")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movimiento extends BaseDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *.
     **/
    @Id
    @JsonSerialize(using = NoObjectIdSerializer.class)
    private ObjectId id;

    /**
     *.
     **/
    private String type;

    /**
     *.
     **/
    private String descrip;

    /**
     *.
     **/
    private String typeCliente;

    /**
     *.
     **/
    private String status;

    /**
     *.
     **/
    private Date fechaMovi;

    /**
     *.
     **/
    private String numberAccount;

    /**
     *.
     **/
    private String lugarMov;
}
