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
	"reqCount", "nextFeduEmpNo", "nextFeduEmpNm", "hasNext", "grid01_COUNT", "grid01_STARTLINE", "grid01"
}, name="SSMP1003A003OutDto")
@XmlRootElement(name="SSMP1003A003OutDto")
@BxmCategory(logicalName="", description="페이징조회 Output") 
public class SSMP1003A003OutDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2049366048L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "페이징조회 Output";
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
	
	
	/**
	 * 다음데이터존재여부
	 */
	@XmlElement
	@JsonProperty("hasNext")
	@BxmOmm_Field(length=1, decimal=0, description="다음데이터존재여부", align="left", fill="")
	private String hasNext= "";
	
	
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
	private List<SSMP1003A003OutDtoSubGrid01> grid01= new ArrayList<>();
	
	
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hasNext= false;
	protected final boolean isSet_hasNext(){
		return this.isSet_hasNext;
	}
	private void setIsSet_hasNext(boolean value){
		this.isSet_hasNext= value;
	}
	/**
	 * 다음데이터존재여부
	 */
	@XmlTransient
	public String getHasNext(){
		return this.hasNext;
	}
	
	/**
	 * 다음데이터존재여부
	 * 
	 * @param hasNext 다음데이터존재여부
	 */
	public void setHasNext(String hasNext){
		this.hasNext= hasNext;
		this.setIsSet_hasNext(true);
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
	public List<SSMP1003A003OutDtoSubGrid01> getGrid01(){
		return grid01;
	}
	
	/**
	 * grid01
	 * 
	 * @param grid01 grid01
	 */
	@JsonSetter("grid01")
	public void setGrid01(List<SSMP1003A003OutDtoSubGrid01> grid01){
		this.grid01= grid01;
		this.setIsSet_grid01(true);
	}
	
	public void setGrid01(SSMP1003A003OutDtoSubGrid01... items){
		List<SSMP1003A003OutDtoSubGrid01> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( SSMP1003A003OutDtoSubGrid01 item: items ){
				_items.add(item);
			}
		}
		this.setGrid01(_items);
	}
	
	@Override
	public SSMP1003A003OutDto clone(){
		try{
			SSMP1003A003OutDto object= (SSMP1003A003OutDto)super.clone();
			if ( this.grid01== null ) object.grid01= null;
			else{
				List<SSMP1003A003OutDtoSubGrid01> clonedList= new ArrayList<>(this.grid01.size());
				for( SSMP1003A003OutDtoSubGrid01 item : grid01 ){
					clonedList.add((SSMP1003A003OutDtoSubGrid01)item.clone());
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
		
		result= prime * result + ((this.reqCount==null)?0:this.reqCount.hashCode());
		result= prime * result + ((this.nextFeduEmpNo==null)?0:this.nextFeduEmpNo.hashCode());
		result= prime * result + ((this.nextFeduEmpNm==null)?0:this.nextFeduEmpNm.hashCode());
		result= prime * result + ((this.hasNext==null)?0:this.hasNext.hashCode());
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
		
		final SSMP1003A003OutDto other= (SSMP1003A003OutDto)obj;
		{
			Object _reqCount= getReqCount();
			Object __reqCount= other.getReqCount();
			if ( _reqCount== null ) { if ( __reqCount!= null ) return false; }
			else if ( !_reqCount.equals(__reqCount) ) return false;
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
		{
			Object _hasNext= getHasNext();
			Object __hasNext= other.getHasNext();
			if ( _hasNext== null ) { if ( __hasNext!= null ) return false; }
			else if ( !_hasNext.equals(__hasNext) ) return false;
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
	
		sb.append("\n[").append(SSMP1003A003OutDto.class.getName()).append(":\n");
		sb.append("\treqCount: ");
		sb.append(reqCount==null?"null":getReqCount());
		sb.append("\n");
		sb.append("\tnextFeduEmpNo: ");
		sb.append(nextFeduEmpNo==null?"null":getNextFeduEmpNo());
		sb.append("\n");
		sb.append("\tnextFeduEmpNm: ");
		sb.append(nextFeduEmpNm==null?"null":getNextFeduEmpNm());
		sb.append("\n");
		sb.append("\thasNext: ");
		sb.append(hasNext==null?"null":getHasNext());
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
		
		messageLen+= 5; /* reqCount */
		messageLen+= 4; /* nextFeduEmpNo */
		messageLen+= 8; /* nextFeduEmpNm */
		messageLen+= 1; /* hasNext */
		messageLen+= 5; /* grid01_COUNT */
		messageLen+= 2; /* grid01_STARTLINE */
		{/*grid01*/
			int size=getGrid01_COUNT();
			int count= grid01 == null ? 0 : grid01.size();
			int min= size > count?count:size;
			SSMP1003A003OutDtoSubGrid01 emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					SSMP1003A003OutDtoSubGrid01 element= grid01.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.smp.online.service.dto.SSMP1003A003OutDtoSubGrid01();
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
	
		list.add("reqCount");
		list.add("nextFeduEmpNo");
		list.add("nextFeduEmpNm");
		list.add("hasNext");
		list.add("grid01_COUNT");
		list.add("grid01_STARTLINE");
		list.add("grid01");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("reqCount", get("reqCount"));
		map.put("nextFeduEmpNo", get("nextFeduEmpNo"));
		map.put("nextFeduEmpNm", get("nextFeduEmpNm"));
		map.put("hasNext", get("hasNext"));
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
		case -439133423:/* reqCount */
			return getReqCount();
		case -33498298:/* nextFeduEmpNo */
			return getNextFeduEmpNo();
		case -33498300:/* nextFeduEmpNm */
			return getNextFeduEmpNm();
		case 696759469:/* hasNext */
			return getHasNext();
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
		case -439133423:/* reqCount */
			setReqCount((Integer)value);
			break;
		case -33498298:/* nextFeduEmpNo */
			setNextFeduEmpNo((Integer)value);
			break;
		case -33498300:/* nextFeduEmpNm */
			setNextFeduEmpNm((String)value);
			break;
		case 696759469:/* hasNext */
			setHasNext((String)value);
			break;
		case -1016634761:/* grid01_COUNT */
			setGrid01_COUNT((Integer)value);
			break;
		case 1411025086:/* grid01_STARTLINE */
			setGrid01_STARTLINE((Integer)value);
			break;
		case -1237657657:/* grid01 */
			setGrid01((List<SSMP1003A003OutDtoSubGrid01>)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
