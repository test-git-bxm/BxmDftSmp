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
 * 속보메세지 Input
 */
@XmlType(propOrder={
	"brno", "trmno", "chanU", "messsage"
}, name="SSMP1008A001InDto")
@XmlRootElement(name="SSMP1008A001InDto")
@BxmCategory(logicalName="", description="속보메세지 Input") 
public class SSMP1008A001InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -280444728L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "속보메세지 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 점번호
	 */
	@XmlElement
	@JsonProperty("brno")
	@BxmOmm_Field(length=4, decimal=0, description="점번호", align="right", fill="")
	private Integer brno= 0;
	
	
	/**
	 * 단말기번
	 */
	@XmlElement
	@JsonProperty("trmno")
	@BxmOmm_Field(length=4, decimal=0, description="단말기번", align="right", fill="")
	private Integer trmno= 0;
	
	
	/**
	 * 채널유형
	 */
	@XmlElement
	@JsonProperty("chanU")
	@BxmOmm_Field(length=2, decimal=0, description="채널유형", align="left", fill="")
	private String chanU= "";
	
	
	/**
	 * 속도메세지
	 */
	@XmlElement
	@JsonProperty("messsage")
	@BxmOmm_Field(length=100, decimal=0, description="속도메세지", align="left", fill="")
	private String messsage= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_brno= false;
	protected final boolean isSet_brno(){
		return this.isSet_brno;
	}
	private void setIsSet_brno(boolean value){
		this.isSet_brno= value;
	}
	/**
	 * 점번호
	 */
	@XmlTransient
	public Integer getBrno(){
		return this.brno;
	}
	
	/**
	 * 점번호
	 * 
	 * @param brno 점번호
	 */
	public void setBrno(Integer brno){
		this.brno= brno;
		this.setIsSet_brno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trmno= false;
	protected final boolean isSet_trmno(){
		return this.isSet_trmno;
	}
	private void setIsSet_trmno(boolean value){
		this.isSet_trmno= value;
	}
	/**
	 * 단말기번
	 */
	@XmlTransient
	public Integer getTrmno(){
		return this.trmno;
	}
	
	/**
	 * 단말기번
	 * 
	 * @param trmno 단말기번
	 */
	public void setTrmno(Integer trmno){
		this.trmno= trmno;
		this.setIsSet_trmno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chanU= false;
	protected final boolean isSet_chanU(){
		return this.isSet_chanU;
	}
	private void setIsSet_chanU(boolean value){
		this.isSet_chanU= value;
	}
	/**
	 * 채널유형
	 */
	@XmlTransient
	public String getChanU(){
		return this.chanU;
	}
	
	/**
	 * 채널유형
	 * 
	 * @param chanU 채널유형
	 */
	public void setChanU(String chanU){
		this.chanU= chanU;
		this.setIsSet_chanU(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_messsage= false;
	protected final boolean isSet_messsage(){
		return this.isSet_messsage;
	}
	private void setIsSet_messsage(boolean value){
		this.isSet_messsage= value;
	}
	/**
	 * 속도메세지
	 */
	@XmlTransient
	public String getMesssage(){
		return this.messsage;
	}
	
	/**
	 * 속도메세지
	 * 
	 * @param messsage 속도메세지
	 */
	public void setMesssage(String messsage){
		this.messsage= messsage;
		this.setIsSet_messsage(true);
	}
	
	@Override
	public SSMP1008A001InDto clone(){
		try{
			SSMP1008A001InDto object= (SSMP1008A001InDto)super.clone();
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
		
		result= prime * result + ((this.brno==null)?0:this.brno.hashCode());
		result= prime * result + ((this.trmno==null)?0:this.trmno.hashCode());
		result= prime * result + ((this.chanU==null)?0:this.chanU.hashCode());
		result= prime * result + ((this.messsage==null)?0:this.messsage.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1008A001InDto other= (SSMP1008A001InDto)obj;
		{
			Object _brno= getBrno();
			Object __brno= other.getBrno();
			if ( _brno== null ) { if ( __brno!= null ) return false; }
			else if ( !_brno.equals(__brno) ) return false;
		}
		{
			Object _trmno= getTrmno();
			Object __trmno= other.getTrmno();
			if ( _trmno== null ) { if ( __trmno!= null ) return false; }
			else if ( !_trmno.equals(__trmno) ) return false;
		}
		{
			Object _chanU= getChanU();
			Object __chanU= other.getChanU();
			if ( _chanU== null ) { if ( __chanU!= null ) return false; }
			else if ( !_chanU.equals(__chanU) ) return false;
		}
		{
			Object _messsage= getMesssage();
			Object __messsage= other.getMesssage();
			if ( _messsage== null ) { if ( __messsage!= null ) return false; }
			else if ( !_messsage.equals(__messsage) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1008A001InDto.class.getName()).append(":\n");
		sb.append("\tbrno: ");
		sb.append(brno==null?"null":getBrno());
		sb.append("\n");
		sb.append("\ttrmno: ");
		sb.append(trmno==null?"null":getTrmno());
		sb.append("\n");
		sb.append("\tchanU: ");
		sb.append(chanU==null?"null":getChanU());
		sb.append("\n");
		sb.append("\tmesssage: ");
		sb.append(messsage==null?"null":getMesssage());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* brno */
		messageLen+= 4; /* trmno */
		messageLen+= 2; /* chanU */
		messageLen+= 100; /* messsage */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("brno");
		list.add("trmno");
		list.add("chanU");
		list.add("messsage");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("brno", get("brno"));
		map.put("trmno", get("trmno"));
		map.put("chanU", get("chanU"));
		map.put("messsage", get("messsage"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3032593:/* brno */
			return getBrno();
		case 110632880:/* trmno */
			return getTrmno();
		case 94623555:/* chanU */
			return getChanU();
		case -461563484:/* messsage */
			return getMesssage();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3032593:/* brno */
			setBrno((Integer)value);
			break;
		case 110632880:/* trmno */
			setTrmno((Integer)value);
			break;
		case 94623555:/* chanU */
			setChanU((String)value);
			break;
		case -461563484:/* messsage */
			setMesssage((String)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
