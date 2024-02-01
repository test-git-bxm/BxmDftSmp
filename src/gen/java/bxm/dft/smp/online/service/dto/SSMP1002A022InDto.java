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
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 다건수정2 Input
 */
@XmlType(propOrder={
	"grid01_COUNT", "grid01_STARTLINE", "grid01"
}, name="SSMP1002A022InDto")
@XmlRootElement(name="SSMP1002A022InDto")
@BxmCategory(logicalName="", description="다건수정2 Input") 
public class SSMP1002A022InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1592694481L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "다건수정2 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 반복횟수
	 */
	@JsonProperty("grid01_COUNT")
	@BxmOmm_Field(length=5, decimal=0, description="반복횟수", align="right", fill="")
	private Integer grid01_COUNT= 0;
	
	
	/**
	 * 시작라인
	 */
	@XmlElement
	@JsonProperty("grid01_STARTLINE")
	@BxmOmm_Field(length=2, decimal=0, description="시작라인", align="right", fill="")
	private Integer grid01_STARTLINE= 0;
	
	
	/**
	 * grid01
	 */
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid01")
	@BxmOmm_Field(length=0, decimal=0, description="grid01", align="left", fill="", arrayReference="grid01_COUNT")
	private List<SSMP1002A022InDtoSubGrid01> grid01= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid01_COUNT= false;
	protected final boolean isSet_grid01_COUNT(){
		return this.isSet_grid01_COUNT;
	}
	private void setIsSet_grid01_COUNT(boolean value){
		this.isSet_grid01_COUNT= value;
	}
	/**
	 * 반복횟수
	 */
	@XmlElement
	public Integer getGrid01_COUNT(){
		if ( isSet_grid01_COUNT )	return grid01_COUNT;
		else{
			if ( grid01 == null || grid01.size() == 0 ) return 0;
			else return grid01.size();
		}
	}
	
	/**
	 * 반복횟수
	 * 
	 * @param grid01_COUNT 반복횟수
	 */
	public void setGrid01_COUNT(Integer grid01_COUNT){
		this.grid01_COUNT= grid01_COUNT;
		this.setIsSet_grid01_COUNT(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid01_STARTLINE= false;
	protected final boolean isSet_grid01_STARTLINE(){
		return this.isSet_grid01_STARTLINE;
	}
	private void setIsSet_grid01_STARTLINE(boolean value){
		this.isSet_grid01_STARTLINE= value;
	}
	/**
	 * 시작라인
	 */
	@XmlTransient
	public Integer getGrid01_STARTLINE(){
		return this.grid01_STARTLINE;
	}
	
	/**
	 * 시작라인
	 * 
	 * @param grid01_STARTLINE 시작라인
	 */
	public void setGrid01_STARTLINE(Integer grid01_STARTLINE){
		this.grid01_STARTLINE= grid01_STARTLINE;
		this.setIsSet_grid01_STARTLINE(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid01= false;
	protected final boolean isSet_grid01(){
		return this.isSet_grid01;
	}
	private void setIsSet_grid01(boolean value){
		this.isSet_grid01= value;
	}
	/**
	 * grid01
	 */
	@XmlTransient
	public List<SSMP1002A022InDtoSubGrid01> getGrid01(){
		return grid01;
	}
	
	/**
	 * grid01
	 * 
	 * @param grid01 grid01
	 */
	@JsonSetter("grid01")
	public void setGrid01(List<SSMP1002A022InDtoSubGrid01> grid01){
		this.grid01= grid01;
		this.setIsSet_grid01(true);
	}
	
	public void setGrid01(SSMP1002A022InDtoSubGrid01... items){
		List<SSMP1002A022InDtoSubGrid01> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( SSMP1002A022InDtoSubGrid01 item: items ){
				_items.add(item);
			}
		}
		this.setGrid01(_items);
	}
	
	@Override
	public SSMP1002A022InDto clone(){
		try{
			SSMP1002A022InDto object= (SSMP1002A022InDto)super.clone();
			if ( this.grid01== null ) object.grid01= null;
			else{
				List<SSMP1002A022InDtoSubGrid01> clonedList= new ArrayList<>(this.grid01.size());
				for( SSMP1002A022InDtoSubGrid01 item : grid01 ){
					clonedList.add((SSMP1002A022InDtoSubGrid01)item.clone());
				}
				object.grid01= clonedList;
			}
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
		
		result= prime * result + ((this.grid01_COUNT==null)?0:this.grid01_COUNT.hashCode());
		result= prime * result + ((this.grid01_STARTLINE==null)?0:this.grid01_STARTLINE.hashCode());
		result= prime * result + ((this.grid01==null)?0:this.grid01.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1002A022InDto other= (SSMP1002A022InDto)obj;
		{
			Object _grid01_COUNT= getGrid01_COUNT();
			Object __grid01_COUNT= other.getGrid01_COUNT();
			if ( _grid01_COUNT== null ) { if ( __grid01_COUNT!= null ) return false; }
			else if ( !_grid01_COUNT.equals(__grid01_COUNT) ) return false;
		}
		{
			Object _grid01_STARTLINE= getGrid01_STARTLINE();
			Object __grid01_STARTLINE= other.getGrid01_STARTLINE();
			if ( _grid01_STARTLINE== null ) { if ( __grid01_STARTLINE!= null ) return false; }
			else if ( !_grid01_STARTLINE.equals(__grid01_STARTLINE) ) return false;
		}
		{
			Object _grid01= getGrid01();
			Object __grid01= other.getGrid01();
			if ( _grid01== null ) { if ( __grid01!= null ) return false; }
			else if ( !_grid01.equals(__grid01) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1002A022InDto.class.getName()).append(":\n");
		sb.append("\tgrid01_COUNT: ");
		sb.append(grid01_COUNT==null?"null":getGrid01_COUNT());
		sb.append("\n");
		sb.append("\tgrid01_STARTLINE: ");
		sb.append(grid01_STARTLINE==null?"null":getGrid01_STARTLINE());
		sb.append("\n");
		sb.append("\tgrid01: ");
		if ( grid01== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(grid01.size());
			sb.append("(items)\n");
	
			int max= (10<grid01.size())?10:grid01.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tgrid01[");
				sb.append(i);
				sb.append("] : ");
				sb.append(grid01.get(i));
				sb.append("\n");
			}
	
			if ( max < grid01.size() ){
				sb.append("\tgrid01[.] : ").append("more ").append((grid01.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* grid01_COUNT */
		messageLen+= 2; /* grid01_STARTLINE */
		{/*grid01*/
			int size=getGrid01_COUNT();
			int count= grid01 == null ? 0 : grid01.size();
			int min= size > count?count:size;
			SSMP1002A022InDtoSubGrid01 emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					SSMP1002A022InDtoSubGrid01 element= grid01.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("grid01_COUNT");
		list.add("grid01_STARTLINE");
		list.add("grid01");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("grid01_COUNT", get("grid01_COUNT"));
		map.put("grid01_STARTLINE", get("grid01_STARTLINE"));
		map.put("grid01", get("grid01"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1016634761:/* grid01_COUNT */
			return getGrid01_COUNT();
		case 1411025086:/* grid01_STARTLINE */
			return getGrid01_STARTLINE();
		case -1237657657:/* grid01 */
			return getGrid01();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1016634761:/* grid01_COUNT */
			setGrid01_COUNT((Integer)value);
			break;
		case 1411025086:/* grid01_STARTLINE */
			setGrid01_STARTLINE((Integer)value);
			break;
		case -1237657657:/* grid01 */
			setGrid01((List<SSMP1002A022InDtoSubGrid01>)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
