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
import com.fasterxml.jackson.annotation.JsonSetter;
import java.math.BigDecimal;
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
 * Employee Info TST
 */
@XmlType(propOrder={
	"feduEmpNo", "feduEmpNm", "feduOccpNm", "feduMngrEmpNo", "feduIpsaDt", "feduPayAmt", "feduDeptNo", "detailCount", "detailDto"
}, name="DSmpEmpTst002selectList08InDto")
@XmlRootElement(name="DSmpEmpTst002selectList08InDto")
@BxmCategory(logicalName="", description="Employee Info TST") 
public class DSmpEmpTst002selectList08InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -233404146L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "Employee Info TST";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * Employee id
	 */
	@XmlElement
	@JsonProperty("feduEmpNo")
	@BxmOmm_Field(length=4, decimal=0, description="Employee id", align="right", fill="")
	private Integer feduEmpNo= 0;
	
	
	/**
	 * Employee name
	 */
	@XmlElement
	@JsonProperty("feduEmpNm")
	@BxmOmm_Field(length=10, decimal=0, description="Employee name", align="left", fill="")
	private String feduEmpNm= "";
	
	
	/**
	 * Employee Occupy
	 */
	@XmlElement
	@JsonProperty("feduOccpNm")
	@BxmOmm_Field(length=9, decimal=0, description="Employee Occupy", align="left", fill="")
	private String feduOccpNm= "";
	
	
	/**
	 * Employee manager id
	 */
	@XmlElement
	@JsonProperty("feduMngrEmpNo")
	@BxmOmm_Field(length=4, decimal=0, description="Employee manager id", align="right", fill="")
	private Integer feduMngrEmpNo= 0;
	
	
	/**
	 * Employee entering date
	 */
	@XmlElement
	@JsonProperty("feduIpsaDt")
	@BxmOmm_Field(length=8, decimal=0, description="Employee entering date", align="left", fill="")
	private String feduIpsaDt= "";
	
	
	/**
	 * Employee salary
	 */
	@XmlElement
	@JsonProperty("feduPayAmt")
	@BxmOmm_Field(length=19, decimal=2, description="Employee salary", align="right", fill="")
	private BigDecimal feduPayAmt= new BigDecimal("0");
	
	
	/**
	 * Employee department
	 */
	@XmlElement
	@JsonProperty("feduDeptNo")
	@BxmOmm_Field(length=2, decimal=0, description="Employee department", align="right", fill="")
	private Integer feduDeptNo= 0;
	
	
	/**
	 * Detail Count
	 */
	@JsonProperty("detailCount")
	@BxmOmm_Field(length=5, decimal=0, description="Detail Count", align="right", fill="")
	private Integer detailCount= 0;
	
	
	/**
	 * Detail List
	 */
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("detailDto")
	@BxmOmm_Field(length=0, decimal=0, description="Detail List", align="left", fill="", arrayReference="detailCount")
	private List<DSmpEmpTst002selectList08InDtoSubGrid01> detailDto= new ArrayList<>();
	
	
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
	 * Employee name
	 */
	@XmlTransient
	public String getFeduEmpNm(){
		return this.feduEmpNm;
	}
	
	/**
	 * Employee name
	 * 
	 * @param feduEmpNm Employee name
	 */
	public void setFeduEmpNm(String feduEmpNm){
		this.feduEmpNm= feduEmpNm;
		this.setIsSet_feduEmpNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduOccpNm= false;
	protected final boolean isSet_feduOccpNm(){
		return this.isSet_feduOccpNm;
	}
	private void setIsSet_feduOccpNm(boolean value){
		this.isSet_feduOccpNm= value;
	}
	/**
	 * Employee Occupy
	 */
	@XmlTransient
	public String getFeduOccpNm(){
		return this.feduOccpNm;
	}
	
	/**
	 * Employee Occupy
	 * 
	 * @param feduOccpNm Employee Occupy
	 */
	public void setFeduOccpNm(String feduOccpNm){
		this.feduOccpNm= feduOccpNm;
		this.setIsSet_feduOccpNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduMngrEmpNo= false;
	protected final boolean isSet_feduMngrEmpNo(){
		return this.isSet_feduMngrEmpNo;
	}
	private void setIsSet_feduMngrEmpNo(boolean value){
		this.isSet_feduMngrEmpNo= value;
	}
	/**
	 * Employee manager id
	 */
	@XmlTransient
	public Integer getFeduMngrEmpNo(){
		return this.feduMngrEmpNo;
	}
	
	/**
	 * Employee manager id
	 * 
	 * @param feduMngrEmpNo Employee manager id
	 */
	public void setFeduMngrEmpNo(Integer feduMngrEmpNo){
		this.feduMngrEmpNo= feduMngrEmpNo;
		this.setIsSet_feduMngrEmpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduIpsaDt= false;
	protected final boolean isSet_feduIpsaDt(){
		return this.isSet_feduIpsaDt;
	}
	private void setIsSet_feduIpsaDt(boolean value){
		this.isSet_feduIpsaDt= value;
	}
	/**
	 * Employee entering date
	 */
	@XmlTransient
	public String getFeduIpsaDt(){
		return this.feduIpsaDt;
	}
	
	/**
	 * Employee entering date
	 * 
	 * @param feduIpsaDt Employee entering date
	 */
	public void setFeduIpsaDt(String feduIpsaDt){
		this.feduIpsaDt= feduIpsaDt;
		this.setIsSet_feduIpsaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduPayAmt= false;
	protected final boolean isSet_feduPayAmt(){
		return this.isSet_feduPayAmt;
	}
	private void setIsSet_feduPayAmt(boolean value){
		this.isSet_feduPayAmt= value;
	}
	/**
	 * Employee salary
	 * BigDecimal - Double value setter
	 *
	 * @Param feduPayAmt Employee salary
	 */
	public void setFeduPayAmt(double feduPayAmt) {
		setFeduPayAmt(BigDecimal.valueOf(feduPayAmt));
	}
	/**
	 * Employee salary
	 * BigDecimal - Long value setter
	 *
	 * @Param feduPayAmt Employee salary
	 */
	public void setFeduPayAmt(long feduPayAmt) {
		setFeduPayAmt(BigDecimal.valueOf(feduPayAmt));
	}
	/**
	 * Employee salary
	 * BigDecimal - String value setter
	 *
	 * @Param feduPayAmt Employee salary
	 */
	public void setFeduPayAmt(String feduPayAmt) {
		setFeduPayAmt(new BigDecimal(feduPayAmt));
	}
	/**
	 * Employee salary
	 */
	@XmlTransient
	public BigDecimal getFeduPayAmt(){
		return this.feduPayAmt;
	}
	
	/**
	 * Employee salary
	 * 
	 * @param feduPayAmt Employee salary
	 */
	@JsonSetter("feduPayAmt")
	public void setFeduPayAmt(BigDecimal feduPayAmt){
		this.feduPayAmt= feduPayAmt;
		this.setIsSet_feduPayAmt(true);
	}
	
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
	 * Employee department
	 */
	@XmlTransient
	public Integer getFeduDeptNo(){
		return this.feduDeptNo;
	}
	
	/**
	 * Employee department
	 * 
	 * @param feduDeptNo Employee department
	 */
	public void setFeduDeptNo(Integer feduDeptNo){
		this.feduDeptNo= feduDeptNo;
		this.setIsSet_feduDeptNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_detailCount= false;
	protected final boolean isSet_detailCount(){
		return this.isSet_detailCount;
	}
	private void setIsSet_detailCount(boolean value){
		this.isSet_detailCount= value;
	}
	/**
	 * Detail Count
	 */
	@XmlElement
	public Integer getDetailCount(){
		if ( isSet_detailCount )	return detailCount;
		else{
			if ( detailDto == null || detailDto.size() == 0 ) return 0;
			else return detailDto.size();
		}
	}
	
	/**
	 * Detail Count
	 * 
	 * @param detailCount Detail Count
	 */
	public void setDetailCount(Integer detailCount){
		this.detailCount= detailCount;
		this.setIsSet_detailCount(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_detailDto= false;
	protected final boolean isSet_detailDto(){
		return this.isSet_detailDto;
	}
	private void setIsSet_detailDto(boolean value){
		this.isSet_detailDto= value;
	}
	/**
	 * Detail List
	 */
	@XmlTransient
	public List<DSmpEmpTst002selectList08InDtoSubGrid01> getDetailDto(){
		return detailDto;
	}
	
	/**
	 * Detail List
	 * 
	 * @param detailDto Detail List
	 */
	@JsonSetter("detailDto")
	public void setDetailDto(List<DSmpEmpTst002selectList08InDtoSubGrid01> detailDto){
		this.detailDto= detailDto;
		this.setIsSet_detailDto(true);
	}
	
	public void setDetailDto(DSmpEmpTst002selectList08InDtoSubGrid01... items){
		List<DSmpEmpTst002selectList08InDtoSubGrid01> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( DSmpEmpTst002selectList08InDtoSubGrid01 item: items ){
				_items.add(item);
			}
		}
		this.setDetailDto(_items);
	}
	
	@Override
	public DSmpEmpTst002selectList08InDto clone(){
		try{
			DSmpEmpTst002selectList08InDto object= (DSmpEmpTst002selectList08InDto)super.clone();
			if ( this.detailDto== null ) object.detailDto= null;
			else{
				List<DSmpEmpTst002selectList08InDtoSubGrid01> clonedList= new ArrayList<>(this.detailDto.size());
				for( DSmpEmpTst002selectList08InDtoSubGrid01 item : detailDto ){
					clonedList.add((DSmpEmpTst002selectList08InDtoSubGrid01)item.clone());
				}
				object.detailDto= clonedList;
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
		
		result= prime * result + ((this.feduEmpNo==null)?0:this.feduEmpNo.hashCode());
		result= prime * result + ((this.feduEmpNm==null)?0:this.feduEmpNm.hashCode());
		result= prime * result + ((this.feduOccpNm==null)?0:this.feduOccpNm.hashCode());
		result= prime * result + ((this.feduMngrEmpNo==null)?0:this.feduMngrEmpNo.hashCode());
		result= prime * result + ((this.feduIpsaDt==null)?0:this.feduIpsaDt.hashCode());
		result= prime * result + ((this.feduPayAmt==null)?0:this.feduPayAmt.hashCode());
		result= prime * result + ((this.feduDeptNo==null)?0:this.feduDeptNo.hashCode());
		result= prime * result + ((this.detailCount==null)?0:this.detailCount.hashCode());
		result= prime * result + ((this.detailDto==null)?0:this.detailDto.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final DSmpEmpTst002selectList08InDto other= (DSmpEmpTst002selectList08InDto)obj;
		{
			Object _feduEmpNo= getFeduEmpNo();
			Object __feduEmpNo= other.getFeduEmpNo();
			if ( _feduEmpNo== null ) { if ( __feduEmpNo!= null ) return false; }
			else if ( !_feduEmpNo.equals(__feduEmpNo) ) return false;
		}
		{
			Object _feduEmpNm= getFeduEmpNm();
			Object __feduEmpNm= other.getFeduEmpNm();
			if ( _feduEmpNm== null ) { if ( __feduEmpNm!= null ) return false; }
			else if ( !_feduEmpNm.equals(__feduEmpNm) ) return false;
		}
		{
			Object _feduOccpNm= getFeduOccpNm();
			Object __feduOccpNm= other.getFeduOccpNm();
			if ( _feduOccpNm== null ) { if ( __feduOccpNm!= null ) return false; }
			else if ( !_feduOccpNm.equals(__feduOccpNm) ) return false;
		}
		{
			Object _feduMngrEmpNo= getFeduMngrEmpNo();
			Object __feduMngrEmpNo= other.getFeduMngrEmpNo();
			if ( _feduMngrEmpNo== null ) { if ( __feduMngrEmpNo!= null ) return false; }
			else if ( !_feduMngrEmpNo.equals(__feduMngrEmpNo) ) return false;
		}
		{
			Object _feduIpsaDt= getFeduIpsaDt();
			Object __feduIpsaDt= other.getFeduIpsaDt();
			if ( _feduIpsaDt== null ) { if ( __feduIpsaDt!= null ) return false; }
			else if ( !_feduIpsaDt.equals(__feduIpsaDt) ) return false;
		}
		{
			Object _feduPayAmt= getFeduPayAmt();
			Object __feduPayAmt= other.getFeduPayAmt();
			if ( _feduPayAmt== null ) { if ( __feduPayAmt!= null ) return false; }
			else if ( !_feduPayAmt.equals(__feduPayAmt) ) return false;
		}
		{
			Object _feduDeptNo= getFeduDeptNo();
			Object __feduDeptNo= other.getFeduDeptNo();
			if ( _feduDeptNo== null ) { if ( __feduDeptNo!= null ) return false; }
			else if ( !_feduDeptNo.equals(__feduDeptNo) ) return false;
		}
		{
			Object _detailCount= getDetailCount();
			Object __detailCount= other.getDetailCount();
			if ( _detailCount== null ) { if ( __detailCount!= null ) return false; }
			else if ( !_detailCount.equals(__detailCount) ) return false;
		}
		{
			Object _detailDto= getDetailDto();
			Object __detailDto= other.getDetailDto();
			if ( _detailDto== null ) { if ( __detailDto!= null ) return false; }
			else if ( !_detailDto.equals(__detailDto) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(DSmpEmpTst002selectList08InDto.class.getName()).append(":\n");
		sb.append("\tfeduEmpNo: ");
		sb.append(feduEmpNo==null?"null":getFeduEmpNo());
		sb.append("\n");
		sb.append("\tfeduEmpNm: ");
		sb.append(feduEmpNm==null?"null":getFeduEmpNm());
		sb.append("\n");
		sb.append("\tfeduOccpNm: ");
		sb.append(feduOccpNm==null?"null":getFeduOccpNm());
		sb.append("\n");
		sb.append("\tfeduMngrEmpNo: ");
		sb.append(feduMngrEmpNo==null?"null":getFeduMngrEmpNo());
		sb.append("\n");
		sb.append("\tfeduIpsaDt: ");
		sb.append(feduIpsaDt==null?"null":getFeduIpsaDt());
		sb.append("\n");
		sb.append("\tfeduPayAmt: ");
		sb.append(feduPayAmt==null?"null":getFeduPayAmt());
		sb.append("\n");
		sb.append("\tfeduDeptNo: ");
		sb.append(feduDeptNo==null?"null":getFeduDeptNo());
		sb.append("\n");
		sb.append("\tdetailCount: ");
		sb.append(detailCount==null?"null":getDetailCount());
		sb.append("\n");
		sb.append("\tdetailDto: ");
		if ( detailDto== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(detailDto.size());
			sb.append("(items)\n");
	
			int max= (10<detailDto.size())?10:detailDto.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tdetailDto[");
				sb.append(i);
				sb.append("] : ");
				sb.append(detailDto.get(i));
				sb.append("\n");
			}
	
			if ( max < detailDto.size() ){
				sb.append("\tdetailDto[.] : ").append("more ").append((detailDto.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* feduEmpNo */
		messageLen+= 10; /* feduEmpNm */
		messageLen+= 9; /* feduOccpNm */
		messageLen+= 4; /* feduMngrEmpNo */
		messageLen+= 8; /* feduIpsaDt */
		messageLen+= 19; /* feduPayAmt */
		messageLen+= 2; /* feduDeptNo */
		messageLen+= 5; /* detailCount */
		{/*detailDto*/
			int size=getDetailCount();
			int count= detailDto == null ? 0 : detailDto.size();
			int min= size > count?count:size;
			DSmpEmpTst002selectList08InDtoSubGrid01 emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					DSmpEmpTst002selectList08InDtoSubGrid01 element= detailDto.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList08InDtoSubGrid01();
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
	
		list.add("feduEmpNo");
		list.add("feduEmpNm");
		list.add("feduOccpNm");
		list.add("feduMngrEmpNo");
		list.add("feduIpsaDt");
		list.add("feduPayAmt");
		list.add("feduDeptNo");
		list.add("detailCount");
		list.add("detailDto");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("feduEmpNo", get("feduEmpNo"));
		map.put("feduEmpNm", get("feduEmpNm"));
		map.put("feduOccpNm", get("feduOccpNm"));
		map.put("feduMngrEmpNo", get("feduMngrEmpNo"));
		map.put("feduIpsaDt", get("feduIpsaDt"));
		map.put("feduPayAmt", get("feduPayAmt"));
		map.put("feduDeptNo", get("feduDeptNo"));
		map.put("detailCount", get("detailCount"));
		map.put("detailDto", get("detailDto"));
	
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
		case -2068798217:/* feduEmpNm */
			return getFeduEmpNm();
		case 568465552:/* feduOccpNm */
			return getFeduOccpNm();
		case 716301837:/* feduMngrEmpNo */
			return getFeduMngrEmpNo();
		case 409158357:/* feduIpsaDt */
			return getFeduIpsaDt();
		case 595858864:/* feduPayAmt */
			return getFeduPayAmt();
		case 255783062:/* feduDeptNo */
			return getFeduDeptNo();
		case -2076060866:/* detailCount */
			return getDetailCount();
		case -1973106738:/* detailDto */
			return getDetailDto();
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -2068798215:/* feduEmpNo */
			setFeduEmpNo((Integer)value);
			break;
		case -2068798217:/* feduEmpNm */
			setFeduEmpNm((String)value);
			break;
		case 568465552:/* feduOccpNm */
			setFeduOccpNm((String)value);
			break;
		case 716301837:/* feduMngrEmpNo */
			setFeduMngrEmpNo((Integer)value);
			break;
		case 409158357:/* feduIpsaDt */
			setFeduIpsaDt((String)value);
			break;
		case 595858864:/* feduPayAmt */
			if ( value instanceof String ){
				setFeduPayAmt((String)value);
			}
			else if ( value instanceof Double ){
				setFeduPayAmt((Double)value);
			}
			else if ( value instanceof Long ){
				setFeduPayAmt((Long)value);
			}
			else{
				setFeduPayAmt((BigDecimal)value);
			}
			break;
		case 255783062:/* feduDeptNo */
			setFeduDeptNo((Integer)value);
			break;
		case -2076060866:/* detailCount */
			setDetailCount((Integer)value);
			break;
		case -1973106738:/* detailDto */
			setDetailDto((List<DSmpEmpTst002selectList08InDtoSubGrid01>)value);
			break;
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
