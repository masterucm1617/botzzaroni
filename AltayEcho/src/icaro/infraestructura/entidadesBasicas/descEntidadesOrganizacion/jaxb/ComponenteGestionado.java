//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.07.04 at 04:19:28 PM CEST
//

package icaro.infraestructura.entidadesBasicas.descEntidadesOrganizacion.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ComponenteGestionado complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ComponenteGestionado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tipoComponente" use="required" type="{urn:icaro:aplicaciones:descripcionOrganizaciones}TipoComponente" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponenteGestionado")
public class ComponenteGestionado {

	@XmlAttribute(name = "refId", required = true)
	protected String refId;
	@XmlAttribute(name = "refDescripcion")
	protected String refDescripcion;
	@XmlAttribute(name = "tipoComponente", required = true)
	protected TipoComponente tipoComponente;

	/**
	 * Gets the value of the refId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * Sets the value of the refId property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setRefId(String value) {
		this.refId = value;
	}

	/**
	 * Gets the value of the refDescripcion property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getRefDescripcion() {
		return refDescripcion;
	}

	/**
	 * Sets the value of the refDescripcion property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setRefDescripcion(String value) {
		this.refDescripcion = value;
	}

	/**
	 * Gets the value of the tipoComponente property.
	 *
	 * @return possible object is {@link TipoComponente }
	 *
	 */
	public TipoComponente getTipoComponente() {
		return tipoComponente;
	}

	/**
	 * Sets the value of the tipoComponente property.
	 *
	 * @param value
	 *            allowed object is {@link TipoComponente }
	 *
	 */
	public void setTipoComponente(TipoComponente value) {
		this.tipoComponente = value;
	}

}
