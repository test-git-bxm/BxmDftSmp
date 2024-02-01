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
 * 다건조회1 Input
 */
@XmlType(propOrder={
	"feduEmpNm"
}, name="SSMP1002A001InDto")
@XmlRootElement(name="SSMP1002A001InDto")
@BxmCategory(logicalName="", description="다건조회1 Input") 
public class SSMP1002A001InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 898636302L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "다건조회1 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * FW교육임직원명
	 */
	@XmlElement
	@JsonProperty("feduEmpNm")
	@BxmOmm_Field(length=10, decimal=0, description="FW교육임직원명", align="left", fill="")
	private String feduEmpNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduEmpNm= false;
	protected final boolean isSet_feduEmpNm(){
		return this.isSet_feduEmpNm;
	}
	private void setIsSet_feduEmpNm(boolean value){
		this.isSet_feduEmpNm= value;
	}
	/**
	 * FW교육임직원명
	 */
	@XmlTransient
	public String getFeduEmpNm(){
		return this.feduEmpNm;
	}
	
	/**
	 * FW교육임직원명
	 * 
	 * @param feduEmpNm FW교육임직원명
	 */
	public void setFeduEmpNm(String feduEmpNm){
		this.feduEmpNm= feduEmpNm;
		this.setIsSet_feduEmpNm(true);
	}
	
	@Override
	public SSMP1002A001InDto clone(){
		try{
			SSMP1002A001InDto object= (SSMP1002A001InDto)super.clone();
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
		
		result= prime * result + ((this.feduEmpNm==null)?0:this.feduEmpNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1002A001InDto other= (SSMP1002A001InDto)obj;
		{
			Object _feduEmpNm= getFeduEmpNm();
			Object __feduEmpNm= other.getFeduEmpNm();
			if ( _feduEmpNm== null ) { if ( __feduEmpNm!= null ) return false; }
			else if ( !_feduEmpNm.equals(__feduEmpNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1002A001InDto.class.getName()).append(":\n");
		sb.append("\tfeduEmpNm: ");
		sb.append(feduEmpNm==null?"null":getFeduEmpNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* feduEmpNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("feduEmpNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("feduEmpNm", get("feduEmpNm"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -2068798217:/* feduEmpNm */
			return getFeduEmpNm();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -2068798217:/* feduEmpNm */
			setFeduEmpNm((String)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
