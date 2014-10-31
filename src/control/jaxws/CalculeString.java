
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calculeString", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculeString", namespace = "http://control/", propOrder = {
    "numero1",
    "oprador",
    "numero2"
})
public class CalculeString {

    @XmlElement(name = "numero1", namespace = "")
    private String numero1;
    @XmlElement(name = "oprador", namespace = "")
    private String oprador;
    @XmlElement(name = "numero2", namespace = "")
    private String numero2;

    /**
     * 
     * @return
     *     returns String
     */
    public String getNumero1() {
        return this.numero1;
    }

    /**
     * 
     * @param numero1
     *     the value for the numero1 property
     */
    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getOprador() {
        return this.oprador;
    }

    /**
     * 
     * @param oprador
     *     the value for the oprador property
     */
    public void setOprador(String oprador) {
        this.oprador = oprador;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getNumero2() {
        return this.numero2;
    }

    /**
     * 
     * @param numero2
     *     the value for the numero2 property
     */
    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

}
