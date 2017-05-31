
package ee.ttu.idu0075._2017.ws.restaurant2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderDishType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderDishType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dish" type="{http://www.ttu.ee/idu0075/2017/ws/restaurant2}dishType"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dishPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderDishType", propOrder = {
    "dish",
    "amount",
    "dishPrice"
})
public class OrderDishType {

    @XmlElement(required = true)
    protected DishType dish;
    @XmlElement(required = true)
    protected BigInteger amount;
    protected double dishPrice;

    /**
     * Gets the value of the dish property.
     * 
     * @return
     *     possible object is
     *     {@link DishType }
     *     
     */
    public DishType getDish() {
        return dish;
    }

    /**
     * Sets the value of the dish property.
     * 
     * @param value
     *     allowed object is
     *     {@link DishType }
     *     
     */
    public void setDish(DishType value) {
        this.dish = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
    }

    /**
     * Gets the value of the dishPrice property.
     * 
     */
    public double getDishPrice() {
        return dishPrice;
    }

    /**
     * Sets the value of the dishPrice property.
     * 
     */
    public void setDishPrice(double value) {
        this.dishPrice = value;
    }

}
