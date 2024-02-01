package bxm.dft.smp.online.bean;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.dft.app.DefaultApplicationException;
import bxm.common.annotaion.BxmCategory;
import bxm.dft.context.DefaultApplicationContext;
import bxm.container.annotation.BxmBean;
import bxm.dft.smp.online.dbio.DSmpEmpTst002;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList08InDto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList08InDtoSubGrid01;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList08OutDto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList09InDto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList09OutDto;

/**
 * <b>BXM Bean class</b>
 * <p>
 * <b>Revision history</b><br>
 * <pre>
 * 2017.11.14 : New creation
 * </pre>
 *
 * @since 2017.11.14
 * @version 1.0.0
 * @author Education
 */
@BxmBean
@BxmCategory(logicalName = "Employee Info Management 02", description = "MyBatis Dynamic Query")
public class MSmpEmpInfMng02 {
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private DSmpEmpTst002 dSmpEmpTst002;
	
	/**
	 * Dynamic sql - If
	 * 
	 * @param input	 DSmpEmpTst000Dto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - if test")
	public List<DSmpEmpTst000Dto> getEmpByIfTest(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto dbioInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc Input data mapping
		 */
		{
			dbioInput.setFeduEmpNo(input.getFeduEmpNo());
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
			dbioInput.setFeduOccpNm(input.getFeduOccpNm());
			dbioInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			dbioInput.setFeduIpsaDt(input.getFeduIpsaDt());
			dbioInput.setFeduPayAmt(input.getFeduPayAmt());
			dbioInput.setFeduDeptNo(input.getFeduDeptNo());
		}
		
		/**
		 * @BXMType DbioCall
		 */
		output = dSmpEmpTst002.selectList01(dbioInput);
		
		logger.debug("output = {}", output);
		logger.debug("============== END ==============");
		
		return output;
	}
	
	/**
	 * Dynamic sql - choose(when, otherwise)
	 * 
	 * @param input	 DSmpEmpTst000Dto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - choose (when, otherwise)")
	public List<DSmpEmpTst000Dto> getEmpByChoose(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto dbioInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc Input data mapping
		 */
		{
			dbioInput.setFeduEmpNo(input.getFeduEmpNo());
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
			dbioInput.setFeduOccpNm(input.getFeduOccpNm());
			dbioInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			dbioInput.setFeduIpsaDt(input.getFeduIpsaDt());
			dbioInput.setFeduPayAmt(input.getFeduPayAmt());
			dbioInput.setFeduDeptNo(input.getFeduDeptNo());
		}
		
		/**
		 * @BXMType DbioCall
		 */
		output = dSmpEmpTst002.selectList02(dbioInput);
		
		logger.debug("output = {}", output);
		logger.debug("============== END ==============");
		return output;
	}
	
	/**
	 * Dynamic sql - trim
	 *  
	 * @param input	 DSmpEmpTst000Dto
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - trim")
	public int getEmpByTrim(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto dbioInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc Input data mapping
		 */
		{
			dbioInput.setFeduEmpNo(input.getFeduEmpNo());
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
			dbioInput.setFeduOccpNm(input.getFeduOccpNm());
			dbioInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			dbioInput.setFeduIpsaDt(input.getFeduIpsaDt());
			dbioInput.setFeduPayAmt(input.getFeduPayAmt());
			dbioInput.setFeduDeptNo(input.getFeduDeptNo());
		}
		
		/**
		 * @BXMType DbioCall
		 */
		int modifyCnt = dSmpEmpTst002.update03(dbioInput);
		
		logger.debug("modifyCnt = {}", modifyCnt);
		logger.debug("============== END ==============");
		return modifyCnt;
	}
	
	/**
	 * Dynamic sql - set
	 *  
	 * @param input	 DSmpEmpTst000Dto
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - set")
	public int getEmpBySet(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto dbioInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc Input data mapping
		 */
		{
			dbioInput.setFeduEmpNo(input.getFeduEmpNo());
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
			dbioInput.setFeduOccpNm(input.getFeduOccpNm());
			dbioInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			dbioInput.setFeduIpsaDt(input.getFeduIpsaDt());
			dbioInput.setFeduPayAmt(input.getFeduPayAmt());
			dbioInput.setFeduDeptNo(input.getFeduDeptNo());
		}
		
		/**
		 * @BXMType DbioCall
		 */
		int modifyCnt = dSmpEmpTst002.update04(dbioInput);
		
		logger.debug("modifyCnt = {}", modifyCnt);
		logger.debug("============== END ==============");
		return modifyCnt;
	}
	
	/**
	 * Dynamic sql - equalsIgnoreCase
	 *  
	 * @param input	 DSmpEmpTst000Dto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - equalsIgnoreCase")
	public List<DSmpEmpTst000Dto> getEmpByEqualsIgnoreCase(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto dbioInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc Input data mapping
		 */
		{
			dbioInput.setFeduEmpNo(input.getFeduEmpNo());
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
			dbioInput.setFeduOccpNm(input.getFeduOccpNm());
			dbioInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			dbioInput.setFeduIpsaDt(input.getFeduIpsaDt());
			dbioInput.setFeduPayAmt(input.getFeduPayAmt());
			dbioInput.setFeduDeptNo(input.getFeduDeptNo());
		}
		
		/**
		 * @BXMType DbioCall
		 */
		output = dSmpEmpTst002.selectList05(dbioInput);
		
		logger.debug("output = {}", output);
		logger.debug("============== END ==============");
		return output;
	}
	
	/**
	 * Dynamic sql - eq "".toString()
	 *  
	 * @param input	 DSmpEmpTst000Dto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - eq .toString()")
	public List<DSmpEmpTst000Dto> getEmpByEq(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto dbioInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc Input data mapping
		 */
		{
			dbioInput.setFeduEmpNo(input.getFeduEmpNo());
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
			dbioInput.setFeduOccpNm(input.getFeduOccpNm());
			dbioInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			dbioInput.setFeduIpsaDt(input.getFeduIpsaDt());
			dbioInput.setFeduPayAmt(input.getFeduPayAmt());
			dbioInput.setFeduDeptNo(input.getFeduDeptNo());
		}
		
		/**
		 * @BXMType DbioCall
		 */
		output = dSmpEmpTst002.selectList06(dbioInput);
		
		logger.debug("output = {}", output);
		logger.debug("============== END ==============");
		return output;
	}
	
	/**
	 * Dynamic sql - == (constants compare)
	 *  
	 * @param input	 DSmpEmpTst000Dto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - ==")
	public List<DSmpEmpTst000Dto> getEmpByConstant(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto dbioInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc Input data mapping
		 */
		{
			dbioInput.setFeduEmpNo(input.getFeduEmpNo());
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
			dbioInput.setFeduOccpNm(input.getFeduOccpNm());
			dbioInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			dbioInput.setFeduIpsaDt(input.getFeduIpsaDt());
			dbioInput.setFeduPayAmt(input.getFeduPayAmt());
			dbioInput.setFeduDeptNo(input.getFeduDeptNo());
		}
		
		/**
		 * @BXMType DbioCall
		 */
		output = dSmpEmpTst002.selectList07(dbioInput);
		
		logger.debug("output = {}", output);
		logger.debug("============== END ==============");
		return output;
	}
	
	
	/**
	 * Dynamic sql - foreach
	 * 
	 * @param input	 DSmpEmpTst000Dto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - foreach by include Dto")
	public List<DSmpEmpTst000Dto> getEmpByForeachIncludeDto(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		int feduEmpNoCount = 10;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = new ArrayList<DSmpEmpTst000Dto>();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst002selectList08InDto 			dbioInput 	= null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst002selectList08InDtoSubGrid01 detailDto 	= null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst002selectList08OutDto> 	dbioOut 	= null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		dbioInput = new DSmpEmpTst002selectList08InDto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc Input data mapping
		 */
		{
			dbioInput.setDetailCount(feduEmpNoCount);
		}
		
		/**
		 * @BXMType Loop
		 * @Desc Input data mapping
		 */
		for (int i = 0 ; i < feduEmpNoCount ; i++) 
		{
			detailDto = new DSmpEmpTst002selectList08InDtoSubGrid01();
			detailDto.setFeduEmpNo(input.getFeduEmpNo()+i);
			dbioInput.getDetailDto().add(detailDto);
		}
		
		/**
		 * @BXMType DbioCall
		 * @Desc Select multi employee info
		 */
		dbioOut = dSmpEmpTst002.selectList08(dbioInput);
		
		/**
		 * @BXMType Loop
		 * @Desc output data mapping
		 */
		for (DSmpEmpTst002selectList08OutDto fetchDto : dbioOut) {
			DSmpEmpTst000Dto outSub = new DSmpEmpTst000Dto();
			outSub.setRowId(fetchDto.getRowId());
			outSub.setFeduEmpNo(fetchDto.getFeduEmpNo());
			outSub.setFeduEmpNm(fetchDto.getFeduEmpNm());
			outSub.setFeduOccpNm(fetchDto.getFeduOccpNm());
			outSub.setFeduMngrEmpNo(fetchDto.getFeduMngrEmpNo());
			outSub.setFeduIpsaDt(fetchDto.getFeduIpsaDt());
			outSub.setFeduPayAmt(fetchDto.getFeduPayAmt());
			outSub.setFeduDeptNo(fetchDto.getFeduDeptNo());
			// Generated by code generator ]]
			
			output.add(outSub);
		}
		
		logger.debug("output = {}", output);
		logger.debug("============== END ==============");
		return output;
	}
	
	/**
	 * Dynamic sql - foreach
	 * 
	 * @param input	 DSmpEmpTst000Dto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "MyBatis Dynamic Query", description = "Dynamic Query - foreach by String Array")
	public List<DSmpEmpTst000Dto> getEmpByForeachStringArray(DSmpEmpTst000Dto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);
		
		dSmpEmpTst002 = DefaultApplicationContext.getBean(dSmpEmpTst002, DSmpEmpTst002.class);
		
		/**
		 * @BXMType VariableDeclaration
		 */
		int itemCount = 10;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = new ArrayList<DSmpEmpTst000Dto>();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst002selectList09InDto dbioInput 			= null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst002selectList09OutDto> dbioOut 		= null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		dbioInput = new DSmpEmpTst002selectList09InDto();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<Integer> itemArray = new ArrayList<Integer>();

		/**
		 * @BXMType LogicalArea
		 * @Desc input data mapping
		 */
		{
			dbioInput.setItemCount(itemCount);
			dbioInput.setItemArray(itemArray);
		}
		
		/**
		 * @BXMType Loop
		 * @Desc input data mapping
		 */
		for (int i = 0 ; i < itemCount ; i++) {
			itemArray.add(input.getFeduEmpNo()+i);
		}
		
		/**
		 * @BXMType DbioCall
		 * @Desc Select multi employee info
		 */
		dbioOut = dSmpEmpTst002.selectList09(dbioInput);
		
		/**
		 * @BXMType Loop
		 * @Desc output data mapping
		 */
		for (DSmpEmpTst002selectList09OutDto fetchDto : dbioOut) {
			DSmpEmpTst000Dto outSub = new DSmpEmpTst000Dto();
			outSub.setRowId(fetchDto.getRowId());
			outSub.setFeduEmpNo(fetchDto.getFeduEmpNo());
			outSub.setFeduEmpNm(fetchDto.getFeduEmpNm());
			outSub.setFeduOccpNm(fetchDto.getFeduOccpNm());
			outSub.setFeduMngrEmpNo(fetchDto.getFeduMngrEmpNo());
			outSub.setFeduIpsaDt(fetchDto.getFeduIpsaDt());
			outSub.setFeduPayAmt(fetchDto.getFeduPayAmt());
			outSub.setFeduDeptNo(fetchDto.getFeduDeptNo());
			// Generated by code generator ]]
			
			output.add(outSub);
		}
		
		logger.debug("output = {}", output);
		logger.debug("============== END ==============");
		return output;
	}
}

