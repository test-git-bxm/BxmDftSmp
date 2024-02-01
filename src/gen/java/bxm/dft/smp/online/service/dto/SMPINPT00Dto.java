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
 * 업무 공통부
 */
@XmlType(propOrder={
	"commEmpNo", "commEmpNm"
}, name="SMPINPT00Dto")
@XmlRootElement(name="SMPINPT00Dto")
@BxmCategory(logicalName="", description="업무 공통부") 
public class SMPINPT00Dto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1355423640L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "업무 공통부";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 직원번호
	 */
	@XmlElement
	@JsonProperty("commEmpNo")
	@BxmOmm_Field(length=4, decimal=0, description="직원번호", align="right", fill="")
	private Integer commEmpNo= 0;
	
	
	/**
	 * 직원명
	 */
	@XmlElement
	@JsonProperty("commEmpNm")
	@BxmOmm_Field(length=10, decimal=0, description="직원명", align="left", fill="")
	private String commEmpNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_commEmpNo= false;
	protected final boolean isSet_commEmpNo(){
		return this.isSet_commEmpNo;
	}
	private void setIsSet_commEmpNo(boolean value){
		this.isSet_commEmpNo= value;
	}
	/**
	 * 직원번호
	 */
	@XmlTransient
	public Integer getCommEmpNo(){
		return this.commEmpNo;
	}
	
	/**
	 * 직원번호
	 * 
	 * @param commEmpNo 직원번호
	 */
	public void setCommEmpNo(Integer commEmpNo){
		this.commEmpNo= commEmpNo;
		this.setIsSet_commEmpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_commEmpNm= false;
	protected final boolean isSet_commEmpNm(){
		return this.isSet_commEmpNm;
	}
	private void setIsSet_commEmpNm(boolean value){
		this.isSet_commEmpNm= value;
	}
	/**
	 * 직원명
	 */
	@XmlTransient
	public String getCommEmpNm(){
		return this.commEmpNm;
	}
	
	/**
	 * 직원명
	 * 
	 * @param commEmpNm 직원명
	 */
	public void setCommEmpNm(String commEmpNm){
		this.commEmpNm= commEmpNm;
		this.setIsSet_commEmpNm(true);
	}
	
	@Override
	public SMPINPT00Dto clone(){
		try{
			SMPINPT00Dto object= (SMPINPT00Dto)super.clone();
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
		
		result= prime * result + ((this.commEmpNo==null)?0:this.commEmpNo.hashCode());
		result= prime * result + ((this.commEmpNm==null)?0:this.commEmpNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SMPINPT00Dto other= (SMPINPT00Dto)obj;
		{
			Object _commEmpNo= getCommEmpNo();
			Object __commEmpNo= other.getCommEmpNo();
			if ( _commEmpNo== null ) { if ( __commEmpNo!= null ) return false; }
			else if ( !_commEmpNo.equals(__commEmpNo) ) return false;
		}
		{
			Object _commEmpNm= getCommEmpNm();
			Object __commEmpNm= other.getCommEmpNm();
			if ( _commEmpNm== null ) { if ( __commEmpNm!= null ) return false; }
			else if ( !_commEmpNm.equals(__commEmpNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SMPINPT00Dto.class.getName()).append(":\n");
		sb.append("\tcommEmpNo: ");
		sb.append(commEmpNo==null?"null":getCommEmpNo());
		sb.append("\n");
		sb.append("\tcommEmpNm: ");
		sb.append(commEmpNm==null?"null":getCommEmpNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* commEmpNo */
		messageLen+= 10; /* commEmpNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("commEmpNo");
		list.add("commEmpNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("commEmpNo", get("commEmpNo"));
		map.put("commEmpNm", get("commEmpNm"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1524602627:/* commEmpNo */
			return getCommEmpNo();
		case -1524602629:/* commEmpNm */
			return getCommEmpNm();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1524602627:/* commEmpNo */
			setCommEmpNo((Integer)value);
			break;
		case -1524602629:/* commEmpNm */
			setCommEmpNm((String)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
