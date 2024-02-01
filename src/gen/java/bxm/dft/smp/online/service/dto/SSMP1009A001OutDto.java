/**
 * BXM V5 - IO Java Source Generator
 */

package bxm.dft.smp.online.service.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 업무로그 Output
 */
@XmlType(propOrder={
}, name="SSMP1009A001OutDto")
@XmlRootElement(name="SSMP1009A001OutDto")
@BxmCategory(logicalName="", description="업무로그 Output") 
public class SSMP1009A001OutDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1721179676L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "업무로그 Output";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	
	@Override
	public SSMP1009A001OutDto clone(){
		try{
			SSMP1009A001OutDto object= (SSMP1009A001OutDto)super.clone();
			return object;
		}
		catch(CloneNotSupportedException e){
			throw new CloneFailedException(e);
		}
	}
	
	@Override
	public int hashCode(){
		int result= 1;
		
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1009A001OutDto.class.getName()).append(":\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
