/**
 * BXM V5 - IO Java Source Generator
 */

package bxm.dft.smp.online.service.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 책임자승인처리 Input
 */
@XmlType(propOrder={
	"cashCmt"
}, name="SSMP1010A001InDto")
@XmlRootElement(name="SSMP1010A001InDto")
@BxmCategory(logicalName="", description="책임자승인처리 Input") 
public class SSMP1010A001InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -505288047L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "책임자승인처리 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 지급액
	 */
	@XmlElement
	@JsonProperty("cashCmt")
	@BxmOmm_Field(length=15, decimal=0, description="지급액", align="right", fill="")
	private BigDecimal cashCmt= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cashCmt= false;
	protected final boolean isSet_cashCmt(){
		return this.isSet_cashCmt;
	}
	private void setIsSet_cashCmt(boolean value){
		this.isSet_cashCmt= value;
	}
	/**
	 * 지급액
	 * BigDecimal - Double value setter
	 *
	 * @Param cashCmt 지급액
	 */
	public void setCashCmt(double cashCmt) {
		setCashCmt(BigDecimal.valueOf(cashCmt));
	}
	/**
	 * 지급액
	 * BigDecimal - Long value setter
	 *
	 * @Param cashCmt 지급액
	 */
	public void setCashCmt(long cashCmt) {
		setCashCmt(BigDecimal.valueOf(cashCmt));
	}
	/**
	 * 지급액
	 * BigDecimal - String value setter
	 *
	 * @Param cashCmt 지급액
	 */
	public void setCashCmt(String cashCmt) {
		setCashCmt(new BigDecimal(cashCmt));
	}
	/**
	 * 지급액
	 */
	@XmlTransient
	public BigDecimal getCashCmt(){
		return this.cashCmt;
	}
	
	/**
	 * 지급액
	 * 
	 * @param cashCmt 지급액
	 */
	@JsonSetter("cashCmt")
	public void setCashCmt(BigDecimal cashCmt){
		this.cashCmt= cashCmt;
		this.setIsSet_cashCmt(true);
	}
	
	@Override
	public SSMP1010A001InDto clone(){
		try{
			SSMP1010A001InDto object= (SSMP1010A001InDto)super.clone();
			return object;
		}
		catch(CloneNotSupportedException e){
			throw new CloneFailedException(e);
		}
	}
	
	@Override
	public int hashCode(){
		final int prime=31;
		int result= 1;
		
		result= prime * result + ((this.cashCmt==null)?0:this.cashCmt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1010A001InDto other= (SSMP1010A001InDto)obj;
		{
			Object _cashCmt= getCashCmt();
			Object __cashCmt= other.getCashCmt();
			if ( _cashCmt== null ) { if ( __cashCmt!= null ) return false; }
			else if ( !_cashCmt.equals(__cashCmt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1010A001InDto.class.getName()).append(":\n");
		sb.append("\tcashCmt: ");
		sb.append(cashCmt==null?"null":getCashCmt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* cashCmt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("cashCmt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cashCmt", get("cashCmt"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 554949911:/* cashCmt */
			return getCashCmt();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 554949911:/* cashCmt */
			if ( value instanceof String ){
				setCashCmt((String)value);
			}
			else if ( value instanceof Double ){
				setCashCmt((Double)value);
			}
			else if ( value instanceof Long ){
				setCashCmt((Long)value);
			}
			else{
				setCashCmt((BigDecimal)value);
			}
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
