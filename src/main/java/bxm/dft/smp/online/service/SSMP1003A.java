package bxm.dft.smp.online.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.dft.app.DefaultApplicationException;
import bxm.common.annotaion.BxmCategory;
import bxm.dft.context.DefaultApplicationContext;
import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.smp.online.bean.MSmpEmpInfMng01;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst001selectPage01OutDto;
import bxm.dft.smp.online.service.dto.SSMP1003A001InDto;
import bxm.dft.smp.online.service.dto.SSMP1003A001OutDto;
import bxm.dft.smp.online.service.dto.SSMP1003A001OutDtoSubGrid01;
import bxm.dft.smp.online.service.dto.SSMP1003A002InDto;
import bxm.dft.smp.online.service.dto.SSMP1003A002OutDto;
import bxm.dft.smp.online.service.dto.SSMP1003A003InDto;
import bxm.dft.smp.online.service.dto.SSMP1003A003OutDto;

/**
 * <b>BXM Service class</b>
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
@BxmService("SSMP1003A")
@BxmCategory(logicalName = "Paging select", description = "Paging select")
public class SSMP1003A {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	private MSmpEmpInfMng01 mSmpEmpInfMng01;

	@BxmServiceOperation("ssmp1003a001")
	@BxmCategory(logicalName = "Paging select", description = "Paging select(Top-N)")
	public SSMP1003A001OutDto ssmp1003a001(SSMP1003A001InDto input) throws DefaultApplicationException {

		logger.debug("============== SERVICE START==============");
		logger.debug("input = {}", input);

		mSmpEmpInfMng01 = DefaultApplicationContext.getBean(mSmpEmpInfMng01, MSmpEmpInfMng01.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1003A001OutDto output = new SSMP1003A001OutDto();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1003A001OutDtoSubGrid01 outDtoSub1 = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst001selectPage01OutDto> beanOutput = null;

		/**
		 * @BXMType VariableDeclaration
		 */
		int pageNum;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		int pageCount;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto beanInput = new DSmpEmpTst000Dto();
		
		
		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			pageNum   = input.getPageNum();
			pageCount = input.getPageCount();
			beanInput.setFeduEmpNm(input.getFeduEmpNm());
		}


		/**
		 * @BXMType BeanCall
		 * @Desc Call bean method to select employee information
		 */
		beanOutput = mSmpEmpInfMng01.getEmpInfPagzingTopN(beanInput, pageNum, pageCount);
		
		/**
		 * @BXMType Loop
		 * @Desc mapping output dto
		 */
		for (DSmpEmpTst001selectPage01OutDto fetchDto : beanOutput) {

			outDtoSub1 = new SSMP1003A001OutDtoSubGrid01();
			// Generated by code generator [[
			outDtoSub1.setFeduEmpNo(fetchDto.getFeduEmpNo());
			outDtoSub1.setFeduEmpNm(fetchDto.getFeduEmpNm());
			outDtoSub1.setFeduOccpNm(fetchDto.getFeduOccpNm());
			outDtoSub1.setFeduMngrEmpNo(fetchDto.getFeduMngrEmpNo());
			outDtoSub1.setFeduIpsaDt(fetchDto.getFeduIpsaDt());
			outDtoSub1.setFeduPayAmt(fetchDto.getFeduPayAmt());
			outDtoSub1.setFeduDeptNo(fetchDto.getFeduDeptNo());
			// Generated by code generator ]]

			output.getGrid01().add(outDtoSub1);
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc output data mapping
		 */
		{
			output.setPageNum(input.getPageNum());
			output.setPageCount(input.getPageCount());
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc add message
		 */
		{
			DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] { });
		}

		logger.debug("output = {}", output);
		logger.debug("============== SERVICE END ==============");

		return output;
	}

	@BxmServiceOperation("ssmp1003a002")
	@BxmCategory(logicalName = "Paging select", description = "Paging select")
	public SSMP1003A002OutDto ssmp1003a002(SSMP1003A002InDto input) throws DefaultApplicationException {

		logger.debug("============== SERVICE START==============");
		logger.debug("input = {}", input);

		mSmpEmpInfMng01 = DefaultApplicationContext.getBean(mSmpEmpInfMng01, MSmpEmpInfMng01.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1003A002OutDto output = new SSMP1003A002OutDto();

		/**
		 * @BXMType BeanCall
		 * @Desc Call bean method to select employee information
		 */
		output = mSmpEmpInfMng01.getEmpInfPagzingTopNWithPage(input, output);

		/**
		 * @BXMType LogicalArea
		 * @Desc add message
		 */
		{
			DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] { });
		}

		logger.debug("output = {}", output);
		logger.debug("============== SERVICE END ==============");

		return output;
	}

	@BxmServiceOperation("ssmp1003a003")
	@BxmCategory(logicalName = "Paging select", description = "Paging select(Next-Key)")
	public SSMP1003A003OutDto ssmp1003a003(SSMP1003A003InDto input) throws DefaultApplicationException {

		logger.debug("============== SERVICE START==============");
		logger.debug("input = {}", input);

		mSmpEmpInfMng01 = DefaultApplicationContext.getBean(mSmpEmpInfMng01, MSmpEmpInfMng01.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1003A003OutDto output = new SSMP1003A003OutDto();

		/**
		 * @BXMType BeanCall
		 * @Desc Call bean method to select employe information
		 */
		output = mSmpEmpInfMng01.getEmpInfPagzingNextKey(input, output);

		/**
		 * @BXMType LogicalArea
		 * @Desc add message
		 */
		{
			DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] { });
		}

		logger.debug("output = {}", output);
		logger.debug("============== SERVICE END ==============");

		return output;
	}
}