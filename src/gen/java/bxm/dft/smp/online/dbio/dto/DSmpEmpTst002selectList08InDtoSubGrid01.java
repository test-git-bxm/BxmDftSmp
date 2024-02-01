/**
 * BXM V5 - IO Java Source Generator
 */

package bxm.dft.smp.online.dbio.dto;

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
 * Employee Info TST SUB
 */
@XmlType(propOrder={
	"feduEmpNo"
}, name="DSmpEmpTst002selectList08InDtoSubGrid01")
@XmlRootElement(name="DSmpEmpTst002selectList08InDtoSubGrid01")
@BxmCategory(logicalName="", description="Employee Info TST SUB") 
public class DSmpEmpTst002selectList08InDtoSubGrid01 implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -65816391L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "Employee Info TST SUB";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * Employee id
	 */
	@XmlElement
	@JsonProperty("feduEmpNo")
	@BxmOmm_Field(length=4, decimal=0, description="Employee id", align="right", fill="")
	private Integer feduEmpNo= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduEmpNo= false;
	protected final boolean isSet_feduEmpNo(){
		return this.isSet_feduEmpNo;
	}
	private void setIsSet_feduEmpNo(boolean value){
		this.isSet_feduEmpNo= value;
	}
	/**
	 * Employee id
	 */
	@XmlTransient
	public Integer getFeduEmpNo(){
		return this.feduEmpNo;
	}
	
	/**
	 * Employee id
	 * 
	 * @param feduEmpNo Employee id
	 */
	public void setFeduEmpNo(Integer feduEmpNo){
		this.feduEmpNo= feduEmpNo;
		this.setIsSet_feduEmpNo(true);
	}
	
	@Override
	public DSmpEmpTst002selectList08InDtoSubGrid01 clone(){
		try{
			DSmpEmpTst002selectList08InDtoSubGrid01 object= (DSmpEmpTst002selectList08InDtoSubGrid01)super.clone();
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
		
		result= prime * result + ((this.feduEmpNo==null)?0:this.feduEmpNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final DSmpEmpTst002selectList08InDtoSubGrid01 other= (DSmpEmpTst002selectList08InDtoSubGrid01)obj;
		{
			Object _feduEmpNo= getFeduEmpNo();
			Object __feduEmpNo= other.getFeduEmpNo();
			if ( _feduEmpNo== null ) { if ( __feduEmpNo!= null ) return false; }
			else if ( !_feduEmpNo.equals(__feduEmpNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(DSmpEmpTst002selectList08InDtoSubGrid01.class.getName()).append(":\n");
		sb.append("\tfeduEmpNo: ");
		sb.append(feduEmpNo==null?"null":getFeduEmpNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* feduEmpNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("feduEmpNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("feduEmpNo", get("feduEmpNo"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -2068798215:/* feduEmpNo */
			return getFeduEmpNo();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -2068798215:/* feduEmpNo */
			setFeduEmpNo((Integer)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
