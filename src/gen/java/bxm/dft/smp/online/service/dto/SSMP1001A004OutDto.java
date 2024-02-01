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
 * 단건삭제 Output
 */
@XmlType(propOrder={
	"succYn"
}, name="SSMP1001A004OutDto")
@XmlRootElement(name="SSMP1001A004OutDto")
@BxmCategory(logicalName="", description="단건삭제 Output") 
public class SSMP1001A004OutDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1862926945L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "단건삭제 Output";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 성공여부
	 */
	@XmlElement
	@JsonProperty("succYn")
	@BxmOmm_Field(length=1, decimal=0, description="성공여부", align="left", fill="")
	private String succYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_succYn= false;
	protected final boolean isSet_succYn(){
		return this.isSet_succYn;
	}
	private void setIsSet_succYn(boolean value){
		this.isSet_succYn= value;
	}
	/**
	 * 성공여부
	 */
	@XmlTransient
	public String getSuccYn(){
		return this.succYn;
	}
	
	/**
	 * 성공여부
	 * 
	 * @param succYn 성공여부
	 */
	public void setSuccYn(String succYn){
		this.succYn= succYn;
		this.setIsSet_succYn(true);
	}
	
	@Override
	public SSMP1001A004OutDto clone(){
		try{
			SSMP1001A004OutDto object= (SSMP1001A004OutDto)super.clone();
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
		
		result= prime * result + ((this.succYn==null)?0:this.succYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1001A004OutDto other= (SSMP1001A004OutDto)obj;
		{
			Object _succYn= getSuccYn();
			Object __succYn= other.getSuccYn();
			if ( _succYn== null ) { if ( __succYn!= null ) return false; }
			else if ( !_succYn.equals(__succYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1001A004OutDto.class.getName()).append(":\n");
		sb.append("\tsuccYn: ");
		sb.append(succYn==null?"null":getSuccYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* succYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("succYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("succYn", get("succYn"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -891515657:/* succYn */
			return getSuccYn();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -891515657:/* succYn */
			setSuccYn((String)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
