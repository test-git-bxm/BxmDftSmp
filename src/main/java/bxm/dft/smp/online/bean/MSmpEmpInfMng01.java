package bxm.dft.smp.online.bean;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.dft.context.DefaultApplicationContext;
import bxm.common.annotaion.BxmCategory;
import bxm.dft.app.DefaultApplicationException;
import bxm.container.annotation.BxmBean;
import bxm.context.das.DasDuplicateKeyException;
import bxm.context.das.DasUtils;
import bxm.context.das.LockUpdate;
import bxm.context.das.LockUpdater;
import bxm.dft.smp.online.dbio.DSmpEmpTst000;
import bxm.dft.smp.online.dbio.DSmpEmpTst001;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst001selectPage01InDto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst001selectPage01OutDto;
import bxm.dft.smp.online.service.dto.SSMP1002A002InDto;
import bxm.dft.smp.online.service.dto.SSMP1003A002InDto;
import bxm.dft.smp.online.service.dto.SSMP1003A002OutDto;
import bxm.dft.smp.online.service.dto.SSMP1003A002OutDtoSubGrid01;
import bxm.dft.smp.online.service.dto.SSMP1003A003InDto;
import bxm.dft.smp.online.service.dto.SSMP1003A003OutDto;
import bxm.dft.smp.online.service.dto.SSMP1003A003OutDtoSubGrid01;

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
@BxmCategory(logicalName = "Employee Info Management 01", description = "Multi-CRUD, Pagzing ")
public class MSmpEmpInfMng01 {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	private DSmpEmpTst000 dSmpEmpTst000;
	private DSmpEmpTst001 dSmpEmpTst001;

	/**
	 * Select multi employee info
	 * 
	 * @param 	input	DSmpEmpTst000Dto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Multi-Select1", description = "Multi-Select: Using DBIO Default DTO")
	public List<DSmpEmpTst000Dto> getEmpListbyNm(DSmpEmpTst000Dto input)
			throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst001 = DefaultApplicationContext.getBean(dSmpEmpTst001, DSmpEmpTst001.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = null;

		/**
		 * @BXMType DbioCall
		 * @Desc Select multi employee info(like)
		 */
		output = dSmpEmpTst001.selectList01(input);

		logger.debug("output = {}", output);
		logger.debug("============== END ==============");

		return output;
	}

	/**
	 * Select multi employee info
	 *
	 * @param 	input	SSMP1002A002InDto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Multi-Select 2", description = "Multi-Select: Using Service Input OMM")
	public List<DSmpEmpTst000Dto> getEmpList(SSMP1002A002InDto input)
			throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst001 = DefaultApplicationContext.getBean(dSmpEmpTst001, DSmpEmpTst001.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> output = null;

		/**
		 * @BXMType DbioCall
		 * @Desc Select multi employee info(like)
		 */
		output = dSmpEmpTst001.selectList02(input);

		logger.debug("output = {}", output);
		logger.debug("============== END ==============");

		return output;
	}

	/**
	 * Insert multi employee info.
	 *
	 * @param 	input	SSMP1002A002InDto
	 * @return List<DSmpEmpTst000Dto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Multi-Insert 2", description = "Multi-Insert(List)")
	public int addEmpInfList(List<DSmpEmpTst000Dto> input) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst000 = DefaultApplicationContext.getBean(dSmpEmpTst000, DSmpEmpTst000.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		int addCnt = 0;
		
		/**
		 * @BXMType Loop
		 */
		for (DSmpEmpTst000Dto dSmpEmpTst000Dto : input)
		{
			/**
			 * @BXMType Try
			 * @Desc To catch SQL Exception
			 */
			try
			{
				/**
				 * @BXMType DbioCall
				 * @Desc Insert single employee info
				 */
				addCnt += dSmpEmpTst000.insert00(dSmpEmpTst000Dto);
			}
			catch (DasDuplicateKeyException de)
			{
				/**
				 * @BXMType ApplicationException
				 * @Desc throw application exception if employee id is already exists
				 */
				throw new DefaultApplicationException("BXME60007", new Object[] { dSmpEmpTst000Dto.getFeduEmpNo() } );
			}
		}

		logger.debug("output = {}", addCnt);
		logger.debug("============== END ==============");

		return addCnt;
	}

	/**
	 * Update multi employee info.
	 *
	 * @param	input	List<DSmpEmpTst000Dto>
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Multi-Update 2", description = "Multi-Update: Bean Loop- Single selectOneLock01")
	public int modifyEmpInfBySelectOneLock(List<DSmpEmpTst000Dto> input)
			throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst001 = DefaultApplicationContext.getBean(dSmpEmpTst001, DSmpEmpTst001.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		int modifyCnt = 0;

		/**
		 * @BXMType Loop
		 */
		for (DSmpEmpTst000Dto dSmpEmpTst000Dto : input)
		{
			/**
			 * @BXMType DbioCall
			 * @Desc Get lock for a row to update
			 */
			LockUpdater<DSmpEmpTst000Dto> lockUpdaterDSmpEmpTst = dSmpEmpTst001.selectOneLock01(dSmpEmpTst000Dto, LockUpdate.FOR_UPDATE);
			
			DSmpEmpTst000Dto lockDSmpEmpTst000Dto = lockUpdaterDSmpEmpTst.updatable();
			
			/**
			 * @BXMType LogicalArea
			 * @Desc Mapping data to update
			 */
			{
				// Generated by code generator [[
				lockDSmpEmpTst000Dto.setFeduEmpNo(dSmpEmpTst000Dto.getFeduEmpNo());
				lockDSmpEmpTst000Dto.setFeduEmpNm(dSmpEmpTst000Dto.getFeduEmpNm());
				lockDSmpEmpTst000Dto.setFeduOccpNm(dSmpEmpTst000Dto.getFeduOccpNm());
				lockDSmpEmpTst000Dto.setFeduMngrEmpNo(dSmpEmpTst000Dto.getFeduMngrEmpNo());
				lockDSmpEmpTst000Dto.setFeduIpsaDt(dSmpEmpTst000Dto.getFeduIpsaDt());
				lockDSmpEmpTst000Dto.setFeduPayAmt(dSmpEmpTst000Dto.getFeduPayAmt());
				lockDSmpEmpTst000Dto.setFeduDeptNo(dSmpEmpTst000Dto.getFeduDeptNo());
				// Generated by code generator ]]
			}

			/**
			 * @BXMType DbioCall
			 * Update single employee info
			 */
			modifyCnt = lockUpdaterDSmpEmpTst.update();
			
			/**
			 * @BXMType IF
			 * @Desc If there are no modified row
			 */
			if (modifyCnt != 1) {
				/**
				 * @BXMType ApplicationException
				 * @Desc throw application exception if there are no modified row
				 */
				throw new DefaultApplicationException("BXME60003", new Object[] { lockDSmpEmpTst000Dto.getFeduEmpNo() } );
			}
		}

		logger.debug("output = {}", modifyCnt);
		logger.debug("============== END ==============");

		return modifyCnt;
	}

	/**
	 * Update multi employee info/
	 *
	 * @param	input	List<DSmpEmpTst000Dto>
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Multi-Update 3", description = "Multi-Update: Bean Loop - selectListLock01")
	public int modifyEmpInfBySelectListLock(DSmpEmpTst000Dto input) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst001 = DefaultApplicationContext.getBean(dSmpEmpTst001, DSmpEmpTst001.class);

		/**
		 * @BXMType DbioCall
		 * @Desc Get lock for multi row to update
		 */
		LockUpdater<List<DSmpEmpTst000Dto>> lockUpdaterDSmpEmpTstList
				= dSmpEmpTst001.selectListLock01(input , LockUpdate.FOR_UPDATE );
		
		List<DSmpEmpTst000Dto> lockDSmpEmpTst000DtoList = lockUpdaterDSmpEmpTstList.updatable();

		/**
		 * @BXMType Loop
		 * @Desc Mapping input data to update
		 */
		for (DSmpEmpTst000Dto lockDSmpEmpTst000Dto : lockDSmpEmpTst000DtoList) {

			// Generated by code generator [[
			lockDSmpEmpTst000Dto.setFeduEmpNo(input.getFeduEmpNo());
			lockDSmpEmpTst000Dto.setFeduEmpNm(input.getFeduEmpNm());
			lockDSmpEmpTst000Dto.setFeduOccpNm(input.getFeduOccpNm());
			lockDSmpEmpTst000Dto.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			lockDSmpEmpTst000Dto.setFeduIpsaDt(input.getFeduIpsaDt());
			lockDSmpEmpTst000Dto.setFeduPayAmt(input.getFeduPayAmt());
			lockDSmpEmpTst000Dto.setFeduDeptNo(input.getFeduDeptNo());
			// Generated by code generator ]]
		}

		/**
		 * @BXMType DbioCall
		 * @Desc Update multi employee info
		 */
		int modifyCnt = lockUpdaterDSmpEmpTstList.update();
		
		/**
		 * @BXMType IF
		 * @Desc There are no modified row
		 */
		if (modifyCnt != 1) {
			/**
			 * @BXMType ApplicationException
			 * @Desc throw application exception if There are no modified row
			 */
			throw new DefaultApplicationException("BXME0003", new Object[]{});
		}

		logger.debug("output = {}", modifyCnt);
		logger.debug("============== END ==============");

		return modifyCnt;
	}

	/**
	 * Delete multi employee info
	 *
	 * @param	input	List<DSmpEmpTst000Dto>
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Multi-Delete 2", description = "Multi-Delete(List)")
	public int removeEmpInfList(List<DSmpEmpTst000Dto> input) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst000 = DefaultApplicationContext.getBean(dSmpEmpTst000, DSmpEmpTst000.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		int removeCnt = 0;
		
		/**
		 * @BXMType Loop
		 */
		for (DSmpEmpTst000Dto dSmpEmpTst000Dto : input)
		{
			/**
			 * @BXMType DbioCall
			 * @Desc Delete single employee info
			 */
			removeCnt += dSmpEmpTst000.delete00(dSmpEmpTst000Dto);
		}

		logger.debug("output = {}", removeCnt);
		logger.debug("============== END ==============");

		return removeCnt;
	}

	/**
	 * Get selected row count
	 *
	 * @param	input DSmpEmpTst000Dto
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Select Data Count", description = "Select Data Count(Top-N)")
	public int getEmpInfPagzingTotalCount(DSmpEmpTst000Dto input) throws DefaultApplicationException {

		dSmpEmpTst001 = DefaultApplicationContext.getBean(dSmpEmpTst001, DSmpEmpTst001.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst001selectPage01InDto dbioInput = new DSmpEmpTst001selectPage01InDto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
		}

		/**
		 * @BXMType DbioCall
		 * @Desc Get selected row count
		 */
		int totalCount = dSmpEmpTst001.selectCount01(dbioInput).intValue();

		return totalCount;
	}

	/**
	 * Select multi employee info on page sql(Top-N)
	 *
	 * @param input		 DSmpEmpTst000Dto
	 * @param pageNum	 int	Page number
	 * @param pageCount int		Row count for a page
	 * @return List<DSmpEmpTst001selectPage01OutDto>
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Select Paging", description = "Select Paging(Top-N)")
	public List<DSmpEmpTst001selectPage01OutDto> getEmpInfPagzingTopN(DSmpEmpTst000Dto input ,int pageNum, int pageCount) throws DefaultApplicationException {
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst001 = DefaultApplicationContext.getBean(dSmpEmpTst001, DSmpEmpTst001.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst001selectPage01OutDto> output = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst001selectPage01InDto dbioInput = new DSmpEmpTst001selectPage01InDto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
		}

		/**
		 * @BXMType DbioCall
		 * @Desc Select multi employee info on page sql(Top-N)
		 */
		output = dSmpEmpTst001.selectPage01(dbioInput, pageNum, pageCount);

		logger.debug("output = {}", output);
		logger.debug("============== END ==============");

		return output;
	}

	/**
	 * Select multi employee info on page sql(Top-N)
	 *
	 * @param input	  SSMP1003A002InDto
	 * @param output SSMP1003A002OutDto
	 * @return SSMP1003A002OutDto
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Select Paging", description = "Select Paging(Top-N)")
	public SSMP1003A002OutDto getEmpInfPagzingTopNWithPage(SSMP1003A002InDto input , SSMP1003A002OutDto output) throws DefaultApplicationException {
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst001 = DefaultApplicationContext.getBean(dSmpEmpTst001, DSmpEmpTst001.class);


		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst001selectPage01OutDto> dbioOut = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		int pageNum   = input.getPageNum();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		int pageCount = input.getPageCount();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst001selectPage01InDto dbioInput = new DSmpEmpTst001selectPage01InDto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
		}

		/**
		 * @BXMType DbioCall
		 * @Desc Get all employee info count
		 */
		int totalCount = dSmpEmpTst001.selectCount01(dbioInput).intValue();

		/**
		 * @BXMType DbioCall
		 * @Desc select employee info on page sql(Top-N)
		 */
		dbioOut = dSmpEmpTst001.selectPage01(dbioInput, pageNum, pageCount);

		SSMP1003A002OutDtoSubGrid01 outDtoSub01 = null;
		
		/**
		 * @BXMType Loop
		 * @Desc output data mapping
		 */
		for (DSmpEmpTst001selectPage01OutDto fetchDto : dbioOut) {
			outDtoSub01 = new SSMP1003A002OutDtoSubGrid01();
			// Generated by code generator [[
			outDtoSub01.setFeduEmpNo(fetchDto.getFeduEmpNo());
			outDtoSub01.setFeduEmpNm(fetchDto.getFeduEmpNm());
			outDtoSub01.setFeduOccpNm(fetchDto.getFeduOccpNm());
			outDtoSub01.setFeduMngrEmpNo(fetchDto.getFeduMngrEmpNo());
			outDtoSub01.setFeduIpsaDt(fetchDto.getFeduIpsaDt());
			outDtoSub01.setFeduPayAmt(fetchDto.getFeduPayAmt());
			outDtoSub01.setFeduDeptNo(fetchDto.getFeduDeptNo());
			// Generated by code generator ]]

			output.getGrid01().add(outDtoSub01);
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc output data mapping
		 */
		{
			output.setPageNum(input.getPageNum());
			output.setPageCount(input.getPageCount());
			output.setTotalCount(totalCount);
		}

		logger.debug("output = {}", output);
		logger.debug("============== END ==============");

		return output;
	}

	/**
	 * Select multi employee info on page sql(Next-Key)
	 * @param input		SSMP1003A003InDto
	 * @param output 	SSMP1003A003OutDto
	 * @return SSMP1003A003OutDto
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Select Paging", description = "Select Paging(Next-Key)")
	public SSMP1003A003OutDto getEmpInfPagzingNextKey(SSMP1003A003InDto input , SSMP1003A003OutDto output) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst001 = DefaultApplicationContext.getBean(dSmpEmpTst001, DSmpEmpTst001.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		List<DSmpEmpTst000Dto> beanOutput = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto dbioInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto nextInput = new DSmpEmpTst000Dto();
		
		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1003A003OutDtoSubGrid01 outDtoSub01 = null;

		/**
		 * @BXMType VariableDeclaration
		 */
		int pageCount;
		
		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			pageCount = input.getReqCount();
			dbioInput.setFeduEmpNm(input.getFeduEmpNm());
			nextInput.setFeduEmpNo(input.getNextFeduEmpNo());
			nextInput.setFeduEmpNm(input.getNextFeduEmpNm());
		}


		/**
		 * @BXMType DbioCall
		 * @Desc Select multi employee info on page sql(Next-Key)
		 */
		beanOutput = dSmpEmpTst001.selectPage02(dbioInput, nextInput, pageCount);

		/**
		 * @BXMType LogicalArea
		 * @Desc output data mapping
		 */
		{
			output.setReqCount(input.getReqCount());
			output.setGrid01_COUNT(beanOutput.size());
			output.setHasNext(DasUtils.existNextResult(beanOutput) ? "Y" : "N");
		}

		/**
		 * @BXMType Loop
		 * @Desc output data mapping
		 */
		for (DSmpEmpTst000Dto fetchDto : beanOutput) {

			outDtoSub01 = new SSMP1003A003OutDtoSubGrid01();

			// Generated by code generator [[
			outDtoSub01.setFeduEmpNo(fetchDto.getFeduEmpNo());
			outDtoSub01.setFeduEmpNm(fetchDto.getFeduEmpNm());
			outDtoSub01.setFeduOccpNm(fetchDto.getFeduOccpNm());
			outDtoSub01.setFeduMngrEmpNo(fetchDto.getFeduMngrEmpNo());
			outDtoSub01.setFeduIpsaDt(fetchDto.getFeduIpsaDt());
			outDtoSub01.setFeduPayAmt(fetchDto.getFeduPayAmt());
			outDtoSub01.setFeduDeptNo(fetchDto.getFeduDeptNo());
			// Generated by code generator ]]
			output.getGrid01().add(outDtoSub01);
		}

		logger.debug("output = {}", output);
		logger.debug("============== END ==============");

		return output;
	}

}

