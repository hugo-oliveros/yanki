package com.pe.nttdata.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pe.nttdata.model.domain.BaseDomain;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *<b>Class</b>: {@link Empresarial}<br/>
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
@Document(collection = "Empresarial")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Empresarial extends BaseDomain implements Serializable {

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
  private String razonSocial;

  /**
   *.
   **/
  private String ruc;

  /**
   *.
   **/
  private String direccion;

  /**
   *.
   **/
  private String descrip;


  /**
   *.
   **/
  private Activo activo;
}
