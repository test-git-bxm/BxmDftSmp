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
import java.math.BigDecimal;
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
	"pageNum", "pageCount", "feduEmpNo", "feduEmpNm", "feduOccpNm", "feduMngrEmpNo", "feduIpsaDt", "feduPayAmt", "feduDeptNo"
}, name="SSMP1003A002InDto")
@XmlRootElement(name="SSMP1003A002InDto")
@BxmCategory(logicalName="", description="페이징조회 Input") 
public class SSMP1003A002InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 730751948L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "페이징조회 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 페이지넘버
	 */
	@XmlElement
	@JsonProperty("pageNum")
	@BxmOmm_Field(length=5, decimal=0, description="페이지넘버", align="right", fill="")
	private Integer pageNum= 0;
	
	
	/**
	 * 페이지카운트
	 */
	@XmlElement
	@JsonProperty("pageCount")
	@BxmOmm_Field(length=5, decimal=0, description="페이지카운트", align="right", fill="")
	private Integer pageCount= 0;
	
	
	/**
	 * FW샘플 임직원번호
	 */
	@XmlElement
	@JsonProperty("feduEmpNo")
	@BxmOmm_Field(length=4, decimal=0, description="FW샘플 임직원번호", align="right", fill="")
	private Integer feduEmpNo= 0;
	
	
	/**
	 * FW샘플 임직원명
	 */
	@XmlElement
	@JsonProperty("feduEmpNm")
	@BxmOmm_Field(length=10, decimal=0, description="FW샘플 임직원명", align="left", fill="")
	private String feduEmpNm= "";
	
	
	/**
	 * FW샘플 직업명
	 */
	@XmlElement
	@JsonProperty("feduOccpNm")
	@BxmOmm_Field(length=9, decimal=0, description="FW샘플 직업명", align="left", fill="")
	private String feduOccpNm= "";
	
	
	/**
	 * FW샘플 관리자임직원번호
	 */
	@XmlElement
	@JsonProperty("feduMngrEmpNo")
	@BxmOmm_Field(length=4, decimal=0, description="FW샘플 관리자임직원번호", align="right", fill="")
	private Integer feduMngrEmpNo= 0;
	
	
	/**
	 * FW샘플 입사일자
	 */
	@XmlElement
	@JsonProperty("feduIpsaDt")
	@BxmOmm_Field(length=8, decimal=0, description="FW샘플 입사일자", align="left", fill="")
	private String feduIpsaDt= "";
	
	
	/**
	 * FW샘플 급여금액
	 */
	@XmlElement
	@JsonProperty("feduPayAmt")
	@BxmOmm_Field(length=19, decimal=2, description="FW샘플 급여금액", align="right", fill="")
	private BigDecimal feduPayAmt= new BigDecimal("0");
	
	
	/**
	 * FW샘플 부서번호
	 */
	@XmlElement
	@JsonProperty("feduDeptNo")
	@BxmOmm_Field(length=2, decimal=0, description="FW샘플 부서번호", align="right", fill="")
	private Integer feduDeptNo= 0;
	
	
	
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
	 * 페이지넘버
	 */
	@XmlTransient
	public Integer getPageNum(){
		return this.pageNum;
	}
	
	/**
	 * 페이지넘버
	 * 
	 * @param pageNum 페이지넘버
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
	 * 페이지카운트
	 */
	@XmlTransient
	public Integer getPageCount(){
		return this.pageCount;
	}
	
	/**
	 * 페이지카운트
	 * 
	 * @param pageCount 페이지카운트
	 */
	public void setPageCount(Integer pageCount){
		this.pageCount= pageCount;
		this.setIsSet_pageCount(true);
	}
	
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
	 * FW샘플 임직원번호
	 */
	@XmlTransient
	public Integer getFeduEmpNo(){
		return this.feduEmpNo;
	}
	
	/**
	 * FW샘플 임직원번호
	 * 
	 * @param feduEmpNo FW샘플 임직원번호
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
	private boolean isSet_feduOccpNm= false;
	protected final boolean isSet_feduOccpNm(){
		return this.isSet_feduOccpNm;
	}
	private void setIsSet_feduOccpNm(boolean value){
		this.isSet_feduOccpNm= value;
	}
	/**
	 * FW샘플 직업명
	 */
	@XmlTransient
	public String getFeduOccpNm(){
		return this.feduOccpNm;
	}
	
	/**
	 * FW샘플 직업명
	 * 
	 * @param feduOccpNm FW샘플 직업명
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
	 * FW샘플 관리자임직원번호
	 */
	@XmlTransient
	public Integer getFeduMngrEmpNo(){
		return this.feduMngrEmpNo;
	}
	
	/**
	 * FW샘플 관리자임직원번호
	 * 
	 * @param feduMngrEmpNo FW샘플 관리자임직원번호
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
	 * FW샘플 입사일자
	 */
	@XmlTransient
	public String getFeduIpsaDt(){
		return this.feduIpsaDt;
	}
	
	/**
	 * FW샘플 입사일자
	 * 
	 * @param feduIpsaDt FW샘플 입사일자
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
	 * FW샘플 급여금액
	 * BigDecimal - Double value setter
	 *
	 * @Param feduPayAmt FW샘플 급여금액
	 */
	public void setFeduPayAmt(double feduPayAmt) {
		setFeduPayAmt(BigDecimal.valueOf(feduPayAmt));
	}
	/**
	 * FW샘플 급여금액
	 * BigDecimal - Long value setter
	 *
	 * @Param feduPayAmt FW샘플 급여금액
	 */
	public void setFeduPayAmt(long feduPayAmt) {
		setFeduPayAmt(BigDecimal.valueOf(feduPayAmt));
	}
	/**
	 * FW샘플 급여금액
	 * BigDecimal - String value setter
	 *
	 * @Param feduPayAmt FW샘플 급여금액
	 */
	public void setFeduPayAmt(String feduPayAmt) {
		setFeduPayAmt(new BigDecimal(feduPayAmt));
	}
	/**
	 * FW샘플 급여금액
	 */
	@XmlTransient
	public BigDecimal getFeduPayAmt(){
		return this.feduPayAmt;
	}
	
	/**
	 * FW샘플 급여금액
	 * 
	 * @param feduPayAmt FW샘플 급여금액
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
	public SSMP1003A002InDto clone(){
		try{
			SSMP1003A002InDto object= (SSMP1003A002InDto)super.clone();
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
		result= prime * result + ((this.feduEmpNo==null)?0:this.feduEmpNo.hashCode());
		result= prime * result + ((this.feduEmpNm==null)?0:this.feduEmpNm.hashCode());
		result= prime * result + ((this.feduOccpNm==null)?0:this.feduOccpNm.hashCode());
		result= prime * result + ((this.feduMngrEmpNo==null)?0:this.feduMngrEmpNo.hashCode());
		result= prime * result + ((this.feduIpsaDt==null)?0:this.feduIpsaDt.hashCode());
		result= prime * result + ((this.feduPayAmt==null)?0:this.feduPayAmt.hashCode());
		result= prime * result + ((this.feduDeptNo==null)?0:this.feduDeptNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1003A002InDto other= (SSMP1003A002InDto)obj;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1003A002InDto.class.getName()).append(":\n");
		sb.append("\tpageNum: ");
		sb.append(pageNum==null?"null":getPageNum());
		sb.append("\n");
		sb.append("\tpageCount: ");
		sb.append(pageCount==null?"null":getPageCount());
		sb.append("\n");
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
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 5; /* pageNum */
		messageLen+= 5; /* pageCount */
		messageLen+= 4; /* feduEmpNo */
		messageLen+= 10; /* feduEmpNm */
		messageLen+= 9; /* feduOccpNm */
		messageLen+= 4; /* feduMngrEmpNo */
		messageLen+= 8; /* feduIpsaDt */
		messageLen+= 19; /* feduPayAmt */
		messageLen+= 2; /* feduDeptNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("pageNum");
		list.add("pageCount");
		list.add("feduEmpNo");
		list.add("feduEmpNm");
		list.add("feduOccpNm");
		list.add("feduMngrEmpNo");
		list.add("feduIpsaDt");
		list.add("feduPayAmt");
		list.add("feduDeptNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pageNum", get("pageNum"));
		map.put("pageCount", get("pageCount"));
		map.put("feduEmpNo", get("feduEmpNo"));
		map.put("feduEmpNm", get("feduEmpNm"));
		map.put("feduOccpNm", get("feduOccpNm"));
		map.put("feduMngrEmpNo", get("feduMngrEmpNo"));
		map.put("feduIpsaDt", get("feduIpsaDt"));
		map.put("feduPayAmt", get("feduPayAmt"));
		map.put("feduDeptNo", get("feduDeptNo"));
	
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
		default:
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -803564937:/* pageNum */
			setPageNum((Integer)value);
			break;
		case 857882560:/* pageCount */
			setPageCount((Integer)value);
			break;
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
		default:
			htDynamicVariable.put(key, value);
			break;
		}
	}
	
}
