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
 * 
 */
@XmlType(propOrder={
	"empInfo"
}, name="SSMP1006A003InDto")
@XmlRootElement(name="SSMP1006A003InDto")
@BxmCategory(logicalName="", description="") 
public class SSMP1006A003InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 169840584L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 
	 */
	@XmlElement
	@JsonProperty("empInfo")
	@BxmOmm_Field(length=0, decimal=0, align="left", fill="")
	private SSMP1006A002SubDto empInfo= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_empInfo= false;
	protected final boolean isSet_empInfo(){
		return this.isSet_empInfo;
	}
	private void setIsSet_empInfo(boolean value){
		this.isSet_empInfo= value;
	}
	/**
	 * 
	 */
	@XmlTransient
	public SSMP1006A002SubDto getEmpInfo(){
		return this.empInfo;
	}
	
	/**
	 * 
	 * 
	 * @param empInfo 
	 */
	public void setEmpInfo(SSMP1006A002SubDto empInfo){
		this.empInfo= empInfo;
		this.setIsSet_empInfo(true);
	}
	
	@Override
	public SSMP1006A003InDto clone(){
		try{
			SSMP1006A003InDto object= (SSMP1006A003InDto)super.clone();
			if ( this.empInfo== null ) object.empInfo= null;
			else object.empInfo= (SSMP1006A002SubDto)this.empInfo.clone();
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
		
		result= prime * result + ((this.empInfo==null)?0:this.empInfo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1006A003InDto other= (SSMP1006A003InDto)obj;
		{
			Object _empInfo= getEmpInfo();
			Object __empInfo= other.getEmpInfo();
			if ( _empInfo== null ) { if ( __empInfo!= null ) return false; }
			else if ( !_empInfo.equals(__empInfo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1006A003InDto.class.getName()).append(":\n");
		sb.append("\tempInfo: ");
		sb.append(empInfo==null?"null":getEmpInfo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		if ( empInfo != null && !(empInfo instanceof Predictable) )
			throw new IllegalStateException( "Message length can not be predicted.");
		{
			SSMP1006A002SubDto temp= empInfo;
			if ( temp== null ) temp= new SSMP1006A002SubDto();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* empInfo */
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("empInfo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("empInfo", get("empInfo"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1625113194:/* empInfo */
			return getEmpInfo();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1625113194:/* empInfo */
			setEmpInfo((SSMP1006A002SubDto)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
