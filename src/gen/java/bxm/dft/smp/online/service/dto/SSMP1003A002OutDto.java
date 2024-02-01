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
 * 페이징조회 Output
 */
@XmlType(propOrder={
	"pageNum", "pageCount", "totalCount", "grid01_COUNT", "grid01_STARTLINE", "grid01"
}, name="SSMP1003A002OutDto")
@XmlRootElement(name="SSMP1003A002OutDto")
@BxmCategory(logicalName="", description="페이징조회 Output") 
public class SSMP1003A002OutDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1358097567L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "페이징조회 Output";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * pageNum
	 */
	@XmlElement
	@JsonProperty("pageNum")
	@BxmOmm_Field(length=5, decimal=0, description="pageNum", align="right", fill="")
	private Integer pageNum= 0;
	
	
	/**
	 * pageCount
	 */
	@XmlElement
	@JsonProperty("pageCount")
	@BxmOmm_Field(length=5, decimal=0, description="pageCount", align="right", fill="")
	private Integer pageCount= 0;
	
	
	/**
	 * totalCount
	 */
	@XmlElement
	@JsonProperty("totalCount")
	@BxmOmm_Field(length=8, decimal=0, description="totalCount", align="right", fill="")
	private Integer totalCount= 0;
	
	
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
	private List<SSMP1003A002OutDtoSubGrid01> grid01= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageNum= false;
	protected final boolean isSet_pageNum(){
		return this.isSet_pageNum;
	}
	private void setIsSet_pageNum(boolean value){
		this.isSet_pageNum= value;
	}
	/**
	 * pageNum
	 */
	@XmlTransient
	public Integer getPageNum(){
		return this.pageNum;
	}
	
	/**
	 * pageNum
	 * 
	 * @param pageNum pageNum
	 */
	public void setPageNum(Integer pageNum){
		this.pageNum= pageNum;
		this.setIsSet_pageNum(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageCount= false;
	protected final boolean isSet_pageCount(){
		return this.isSet_pageCount;
	}
	private void setIsSet_pageCount(boolean value){
		this.isSet_pageCount= value;
	}
	/**
	 * pageCount
	 */
	@XmlTransient
	public Integer getPageCount(){
		return this.pageCount;
	}
	
	/**
	 * pageCount
	 * 
	 * @param pageCount pageCount
	 */
	public void setPageCount(Integer pageCount){
		this.pageCount= pageCount;
		this.setIsSet_pageCount(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totalCount= false;
	protected final boolean isSet_totalCount(){
		return this.isSet_totalCount;
	}
	private void setIsSet_totalCount(boolean value){
		this.isSet_totalCount= value;
	}
	/**
	 * totalCount
	 */
	@XmlTransient
	public Integer getTotalCount(){
		return this.totalCount;
	}
	
	/**
	 * totalCount
	 * 
	 * @param totalCount totalCount
	 */
	public void setTotalCount(Integer totalCount){
		this.totalCount= totalCount;
		this.setIsSet_totalCount(true);
	}
	
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
	public List<SSMP1003A002OutDtoSubGrid01> getGrid01(){
		return grid01;
	}
	
	/**
	 * grid01
	 * 
	 * @param grid01 grid01
	 */
	@JsonSetter("grid01")
	public void setGrid01(List<SSMP1003A002OutDtoSubGrid01> grid01){
		this.grid01= grid01;
		this.setIsSet_grid01(true);
	}
	
	public void setGrid01(SSMP1003A002OutDtoSubGrid01... items){
		List<SSMP1003A002OutDtoSubGrid01> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( SSMP1003A002OutDtoSubGrid01 item: items ){
				_items.add(item);
			}
		}
		this.setGrid01(_items);
	}
	
	@Override
	public SSMP1003A002OutDto clone(){
		try{
			SSMP1003A002OutDto object= (SSMP1003A002OutDto)super.clone();
			if ( this.grid01== null ) object.grid01= null;
			else{
				List<SSMP1003A002OutDtoSubGrid01> clonedList= new ArrayList<>(this.grid01.size());
				for( SSMP1003A002OutDtoSubGrid01 item : grid01 ){
					clonedList.add((SSMP1003A002OutDtoSubGrid01)item.clone());
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
		
		result= prime * result + ((this.pageNum==null)?0:this.pageNum.hashCode());
		result= prime * result + ((this.pageCount==null)?0:this.pageCount.hashCode());
		result= prime * result + ((this.totalCount==null)?0:this.totalCount.hashCode());
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
		
		final SSMP1003A002OutDto other= (SSMP1003A002OutDto)obj;
		{
			Object _pageNum= getPageNum();
			Object __pageNum= other.getPageNum();
			if ( _pageNum== null ) { if ( __pageNum!= null ) return false; }
			else if ( !_pageNum.equals(__pageNum) ) return false;
		}
		{
			Object _pageCount= getPageCount();
			Object __pageCount= other.getPageCount();
			if ( _pageCount== null ) { if ( __pageCount!= null ) return false; }
			else if ( !_pageCount.equals(__pageCount) ) return false;
		}
		{
			Object _totalCount= getTotalCount();
			Object __totalCount= other.getTotalCount();
			if ( _totalCount== null ) { if ( __totalCount!= null ) return false; }
			else if ( !_totalCount.equals(__totalCount) ) return false;
		}
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
	
		sb.append("\n[").append(SSMP1003A002OutDto.class.getName()).append(":\n");
		sb.append("\tpageNum: ");
		sb.append(pageNum==null?"null":getPageNum());
		sb.append("\n");
		sb.append("\tpageCount: ");
		sb.append(pageCount==null?"null":getPageCount());
		sb.append("\n");
		sb.append("\ttotalCount: ");
		sb.append(totalCount==null?"null":getTotalCount());
		sb.append("\n");
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
		
		messageLen+= 5; /* pageNum */
		messageLen+= 5; /* pageCount */
		messageLen+= 8; /* totalCount */
		messageLen+= 5; /* grid01_COUNT */
		messageLen+= 2; /* grid01_STARTLINE */
		{/*grid01*/
			int size=getGrid01_COUNT();
			int count= grid01 == null ? 0 : grid01.size();
			int min= size > count?count:size;
			SSMP1003A002OutDtoSubGrid01 emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					SSMP1003A002OutDtoSubGrid01 element= grid01.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.smp.online.service.dto.SSMP1003A002OutDtoSubGrid01();
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
	
		list.add("pageNum");
		list.add("pageCount");
		list.add("totalCount");
		list.add("grid01_COUNT");
		list.add("grid01_STARTLINE");
		list.add("grid01");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pageNum", get("pageNum"));
		map.put("pageCount", get("pageCount"));
		map.put("totalCount", get("totalCount"));
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
		case -803564937:/* pageNum */
			return getPageNum();
		case 857882560:/* pageCount */
			return getPageCount();
		case -731385813:/* totalCount */
			return getTotalCount();
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
		case -803564937:/* pageNum */
			setPageNum((Integer)value);
			break;
		case 857882560:/* pageCount */
			setPageCount((Integer)value);
			break;
		case -731385813:/* totalCount */
			setTotalCount((Integer)value);
			break;
		case -1016634761:/* grid01_COUNT */
			setGrid01_COUNT((Integer)value);
			break;
		case 1411025086:/* grid01_STARTLINE */
			setGrid01_STARTLINE((Integer)value);
			break;
		case -1237657657:/* grid01 */
			setGrid01((List<SSMP1003A002OutDtoSubGrid01>)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
