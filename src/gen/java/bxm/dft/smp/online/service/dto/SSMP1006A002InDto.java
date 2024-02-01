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
 * 
 */
@XmlType(propOrder={
	"size", "empList"
}, name="SSMP1006A002InDto")
@XmlRootElement(name="SSMP1006A002InDto")
@BxmCategory(logicalName="", description="") 
public class SSMP1006A002InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 141211433L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 
	 */
	@JsonProperty("size")
	@BxmOmm_Field(length=9, decimal=0, align="right", fill="", validationRule="BXMVD0008[1]")
	private Integer size= 0;
	
	
	/**
	 * 
	 */
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("empList")
	@BxmOmm_Field(length=0, decimal=0, align="left", fill="", arrayReference="size")
	private List<SSMP1006A002SubDto> empList= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_size= false;
	protected final boolean isSet_size(){
		return this.isSet_size;
	}
	private void setIsSet_size(boolean value){
		this.isSet_size= value;
	}
	/**
	 * 
	 */
	@XmlElement
	public Integer getSize(){
		if ( isSet_size )	return size;
		else{
			if ( empList == null || empList.size() == 0 ) return 0;
			else return empList.size();
		}
	}
	
	/**
	 * 
	 * 
	 * @param size 
	 */
	public void setSize(Integer size){
		this.size= size;
		this.setIsSet_size(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_empList= false;
	protected final boolean isSet_empList(){
		return this.isSet_empList;
	}
	private void setIsSet_empList(boolean value){
		this.isSet_empList= value;
	}
	/**
	 * 
	 */
	@XmlTransient
	public List<SSMP1006A002SubDto> getEmpList(){
		return empList;
	}
	
	/**
	 * 
	 * 
	 * @param empList 
	 */
	@JsonSetter("empList")
	public void setEmpList(List<SSMP1006A002SubDto> empList){
		this.empList= empList;
		this.setIsSet_empList(true);
	}
	
	public void setEmpList(SSMP1006A002SubDto... items){
		List<SSMP1006A002SubDto> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( SSMP1006A002SubDto item: items ){
				_items.add(item);
			}
		}
		this.setEmpList(_items);
	}
	
	@Override
	public SSMP1006A002InDto clone(){
		try{
			SSMP1006A002InDto object= (SSMP1006A002InDto)super.clone();
			if ( this.empList== null ) object.empList= null;
			else{
				List<SSMP1006A002SubDto> clonedList= new ArrayList<>(this.empList.size());
				for( SSMP1006A002SubDto item : empList ){
					clonedList.add((SSMP1006A002SubDto)item.clone());
				}
				object.empList= clonedList;
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
		
		result= prime * result + ((this.size==null)?0:this.size.hashCode());
		result= prime * result + ((this.empList==null)?0:this.empList.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1006A002InDto other= (SSMP1006A002InDto)obj;
		{
			Object _size= getSize();
			Object __size= other.getSize();
			if ( _size== null ) { if ( __size!= null ) return false; }
			else if ( !_size.equals(__size) ) return false;
		}
		{
			Object _empList= getEmpList();
			Object __empList= other.getEmpList();
			if ( _empList== null ) { if ( __empList!= null ) return false; }
			else if ( !_empList.equals(__empList) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1006A002InDto.class.getName()).append(":\n");
		sb.append("\tsize: ");
		sb.append(size==null?"null":getSize());
		sb.append("\n");
		sb.append("\tempList: ");
		if ( empList== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(empList.size());
			sb.append("(items)\n");
	
			int max= (10<empList.size())?10:empList.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tempList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(empList.get(i));
				sb.append("\n");
			}
	
			if ( max < empList.size() ){
				sb.append("\tempList[.] : ").append("more ").append((empList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* size */
		{/*empList*/
			int size=getSize();
			int count= empList == null ? 0 : empList.size();
			int min= size > count?count:size;
			SSMP1006A002SubDto emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					SSMP1006A002SubDto element= empList.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.smp.online.service.dto.SSMP1006A002SubDto();
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
	
		list.add("size");
		list.add("empList");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("size", get("size"));
		map.put("empList", get("empList"));
	
		return map;
	}
	
	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable= new Hashtable<>();
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3530753:/* size */
			return getSize();
		case -1625028218:/* empList */
			return getEmpList();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3530753:/* size */
			setSize((Integer)value);
			break;
		case -1625028218:/* empList */
			setEmpList((List<SSMP1006A002SubDto>)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
