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
 * 페이징조회 Input
 */
@XmlType(propOrder={
	"reqCount", "feduEmpNm", "nextFeduEmpNo", "nextFeduEmpNm"
}, name="SSMP1003A003InDto")
@XmlRootElement(name="SSMP1003A003InDto")
@BxmCategory(logicalName="", description="페이징조회 Input") 
public class SSMP1003A003InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 759381099L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "페이징조회 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 조회요청건수
	 */
	@XmlElement
	@JsonProperty("reqCount")
	@BxmOmm_Field(length=5, decimal=0, description="조회요청건수", align="right", fill="")
	private Integer reqCount= 0;
	
	
	/**
	 * FW샘플 임직원명
	 */
	@XmlElement
	@JsonProperty("feduEmpNm")
	@BxmOmm_Field(length=10, decimal=0, description="FW샘플 임직원명", align="left", fill="")
	private String feduEmpNm= "";
	
	
	/**
	 * FW샘플 임직원번호
	 */
	@XmlElement
	@JsonProperty("nextFeduEmpNo")
	@BxmOmm_Field(length=4, decimal=0, description="FW샘플 임직원번호", align="right", fill="")
	private Integer nextFeduEmpNo= 0;
	
	
	/**
	 * FW샘플 임직원명
	 */
	@XmlElement
	@JsonProperty("nextFeduEmpNm")
	@BxmOmm_Field(length=8, decimal=0, description="FW샘플 임직원명", align="left", fill="")
	private String nextFeduEmpNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_reqCount= false;
	protected final boolean isSet_reqCount(){
		return this.isSet_reqCount;
	}
	private void setIsSet_reqCount(boolean value){
		this.isSet_reqCount= value;
	}
	/**
	 * 조회요청건수
	 */
	@XmlTransient
	public Integer getReqCount(){
		return this.reqCount;
	}
	
	/**
	 * 조회요청건수
	 * 
	 * @param reqCount 조회요청건수
	 */
	public void setReqCount(Integer reqCount){
		this.reqCount= reqCount;
		this.setIsSet_reqCount(true);
	}
	
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
	 * FW샘플 임직원명
	 */
	@XmlTransient
	public String getFeduEmpNm(){
		return this.feduEmpNm;
	}
	
	/**
	 * FW샘플 임직원명
	 * 
	 * @param feduEmpNm FW샘플 임직원명
	 */
	public void setFeduEmpNm(String feduEmpNm){
		this.feduEmpNm= feduEmpNm;
		this.setIsSet_feduEmpNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nextFeduEmpNo= false;
	protected final boolean isSet_nextFeduEmpNo(){
		return this.isSet_nextFeduEmpNo;
	}
	private void setIsSet_nextFeduEmpNo(boolean value){
		this.isSet_nextFeduEmpNo= value;
	}
	/**
	 * FW샘플 임직원번호
	 */
	@XmlTransient
	public Integer getNextFeduEmpNo(){
		return this.nextFeduEmpNo;
	}
	
	/**
	 * FW샘플 임직원번호
	 * 
	 * @param nextFeduEmpNo FW샘플 임직원번호
	 */
	public void setNextFeduEmpNo(Integer nextFeduEmpNo){
		this.nextFeduEmpNo= nextFeduEmpNo;
		this.setIsSet_nextFeduEmpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nextFeduEmpNm= false;
	protected final boolean isSet_nextFeduEmpNm(){
		return this.isSet_nextFeduEmpNm;
	}
	private void setIsSet_nextFeduEmpNm(boolean value){
		this.isSet_nextFeduEmpNm= value;
	}
	/**
	 * FW샘플 임직원명
	 */
	@XmlTransient
	public String getNextFeduEmpNm(){
		return this.nextFeduEmpNm;
	}
	
	/**
	 * FW샘플 임직원명
	 * 
	 * @param nextFeduEmpNm FW샘플 임직원명
	 */
	public void setNextFeduEmpNm(String nextFeduEmpNm){
		this.nextFeduEmpNm= nextFeduEmpNm;
		this.setIsSet_nextFeduEmpNm(true);
	}
	
	@Override
	public SSMP1003A003InDto clone(){
		try{
			SSMP1003A003InDto object= (SSMP1003A003InDto)super.clone();
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
		
		result= prime * result + ((this.reqCount==null)?0:this.reqCount.hashCode());
		result= prime * result + ((this.feduEmpNm==null)?0:this.feduEmpNm.hashCode());
		result= prime * result + ((this.nextFeduEmpNo==null)?0:this.nextFeduEmpNo.hashCode());
		result= prime * result + ((this.nextFeduEmpNm==null)?0:this.nextFeduEmpNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1003A003InDto other= (SSMP1003A003InDto)obj;
		{
			Object _reqCount= getReqCount();
			Object __reqCount= other.getReqCount();
			if ( _reqCount== null ) { if ( __reqCount!= null ) return false; }
			else if ( !_reqCount.equals(__reqCount) ) return false;
		}
		{
			Object _feduEmpNm= getFeduEmpNm();
			Object __feduEmpNm= other.getFeduEmpNm();
			if ( _feduEmpNm== null ) { if ( __feduEmpNm!= null ) return false; }
			else if ( !_feduEmpNm.equals(__feduEmpNm) ) return false;
		}
		{
			Object _nextFeduEmpNo= getNextFeduEmpNo();
			Object __nextFeduEmpNo= other.getNextFeduEmpNo();
			if ( _nextFeduEmpNo== null ) { if ( __nextFeduEmpNo!= null ) return false; }
			else if ( !_nextFeduEmpNo.equals(__nextFeduEmpNo) ) return false;
		}
		{
			Object _nextFeduEmpNm= getNextFeduEmpNm();
			Object __nextFeduEmpNm= other.getNextFeduEmpNm();
			if ( _nextFeduEmpNm== null ) { if ( __nextFeduEmpNm!= null ) return false; }
			else if ( !_nextFeduEmpNm.equals(__nextFeduEmpNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1003A003InDto.class.getName()).append(":\n");
		sb.append("\treqCount: ");
		sb.append(reqCount==null?"null":getReqCount());
		sb.append("\n");
		sb.append("\tfeduEmpNm: ");
		sb.append(feduEmpNm==null?"null":getFeduEmpNm());
		sb.append("\n");
		sb.append("\tnextFeduEmpNo: ");
		sb.append(nextFeduEmpNo==null?"null":getNextFeduEmpNo());
		sb.append("\n");
		sb.append("\tnextFeduEmpNm: ");
		sb.append(nextFeduEmpNm==null?"null":getNextFeduEmpNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* reqCount */
		messageLen+= 10; /* feduEmpNm */
		messageLen+= 4; /* nextFeduEmpNo */
		messageLen+= 8; /* nextFeduEmpNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("reqCount");
		list.add("feduEmpNm");
		list.add("nextFeduEmpNo");
		list.add("nextFeduEmpNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("reqCount", get("reqCount"));
		map.put("feduEmpNm", get("feduEmpNm"));
		map.put("nextFeduEmpNo", get("nextFeduEmpNo"));
		map.put("nextFeduEmpNm", get("nextFeduEmpNm"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -439133423:/* reqCount */
			return getReqCount();
		case -2068798217:/* feduEmpNm */
			return getFeduEmpNm();
		case -33498298:/* nextFeduEmpNo */
			return getNextFeduEmpNo();
		case -33498300:/* nextFeduEmpNm */
			return getNextFeduEmpNm();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -439133423:/* reqCount */
			setReqCount((Integer)value);
			break;
		case -2068798217:/* feduEmpNm */
			setFeduEmpNm((String)value);
			break;
		case -33498298:/* nextFeduEmpNo */
			setNextFeduEmpNo((Integer)value);
			break;
		case -33498300:/* nextFeduEmpNm */
			setNextFeduEmpNm((String)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
