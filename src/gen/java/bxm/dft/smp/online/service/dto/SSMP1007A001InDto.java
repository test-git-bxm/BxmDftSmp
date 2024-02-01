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
 * 온디맨드배치호출 Input
 */
@XmlType(propOrder={
	"feduDeptNo"
}, name="SSMP1007A001InDto")
@XmlRootElement(name="SSMP1007A001InDto")
@BxmCategory(logicalName="", description="온디맨드배치호출 Input") 
public class SSMP1007A001InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -83931223L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "온디맨드배치호출 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * FW샘플 부서번호
	 */
	@XmlElement
	@JsonProperty("feduDeptNo")
	@BxmOmm_Field(length=2, decimal=0, description="FW샘플 부서번호", align="right", fill="")
	private Integer feduDeptNo= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduDeptNo= false;
	protected final boolean isSet_feduDeptNo(){
		return this.isSet_feduDeptNo;
	}
	private void setIsSet_feduDeptNo(boolean value){
		this.isSet_feduDeptNo= value;
	}
	/**
	 * FW샘플 부서번호
	 */
	@XmlTransient
	public Integer getFeduDeptNo(){
		return this.feduDeptNo;
	}
	
	/**
	 * FW샘플 부서번호
	 * 
	 * @param feduDeptNo FW샘플 부서번호
	 */
	public void setFeduDeptNo(Integer feduDeptNo){
		this.feduDeptNo= feduDeptNo;
		this.setIsSet_feduDeptNo(true);
	}
	
	@Override
	public SSMP1007A001InDto clone(){
		try{
			SSMP1007A001InDto object= (SSMP1007A001InDto)super.clone();
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
		
		result= prime * result + ((this.feduDeptNo==null)?0:this.feduDeptNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1007A001InDto other= (SSMP1007A001InDto)obj;
		{
			Object _feduDeptNo= getFeduDeptNo();
			Object __feduDeptNo= other.getFeduDeptNo();
			if ( _feduDeptNo== null ) { if ( __feduDeptNo!= null ) return false; }
			else if ( !_feduDeptNo.equals(__feduDeptNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1007A001InDto.class.getName()).append(":\n");
		sb.append("\tfeduDeptNo: ");
		sb.append(feduDeptNo==null?"null":getFeduDeptNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* feduDeptNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("feduDeptNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("feduDeptNo", get("feduDeptNo"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 255783062:/* feduDeptNo */
			return getFeduDeptNo();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 255783062:/* feduDeptNo */
			setFeduDeptNo((Integer)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
