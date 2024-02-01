package bxm.dft.smp.online.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.dft.app.DefaultApplicationException;
import bxm.common.annotaion.BxmCategory;
import bxm.dft.context.DefaultApplicationContext;
import bxm.container.annotation.BxmBean;
import bxm.context.das.DasDuplicateKeyException;
import bxm.context.das.LockUpdate;
import bxm.context.das.LockUpdater;
import bxm.dft.smp.online.dbio.DSmpEmpTst000;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;

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
@BxmCategory(logicalName = "Employee Info Management", description = "Single CRUD")
public class MSmpEmpInfMng {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	private DSmpEmpTst000 dSmpEmpTst000;
 
	/**
	 * Select a single employee info.
	 *
	 * @param 	input	DSmpEmpTst000Dto
	 * @return DSmpEmpTst000Dto
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Single Select", description = "Employee Info Single Select")
	public DSmpEmpTst000Dto getEmpInf(DSmpEmpTst000Dto input) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst000 = DefaultApplicationContext.getBean(dSmpEmpTst000, DSmpEmpTst000.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto output = null;

		/**
		 * @BXMType DbioCall
		 * Employee ID number selectOne
		 */
		output = dSmpEmpTst000.selectOne00(input);

		logger.debug("output = {}", output);
		logger.debug("============== END ==============");

		return output;
	}
	
	/**
	 * Select a single employee info for update.
	 *
	 * @param 	input	DSmpEmpTst000Dto
	 * @return DSmpEmpTst000Dto
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Single Select", description = "Employee Info Single Select")
	public DSmpEmpTst000Dto getEmpInfBeforeUpdate(DSmpEmpTst000Dto input) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		dSmpEmpTst000 = DefaultApplicationContext.getBean(dSmpEmpTst000, DSmpEmpTst000.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto output = null;

		/**
		 * @BXMType DbioCall
		 * @Desc Select a single employee info for update.
		 */
		output = dSmpEmpTst000.selectOne01(input);

		logger.debug("output = {}", output);
		logger.debug("============== END ==============");

		return output;
	}
	

	/**
	 * Insert a single employee info.
	 *
	 * @param 	input	DSmpEmpTst000Dto
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Single Insert", description = "Employee Info Single Insert")
	public int addEmpInf(DSmpEmpTst000Dto input) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		/**
		 * @BXMType VariableDeclaration
		 */
		int addCnt = 0;
		dSmpEmpTst000 = DefaultApplicationContext.getBean(dSmpEmpTst000, DSmpEmpTst000.class);

		/**
		 * @BXMType Try
		 * @Desc Check duplicate employee id
		 */
		try {
			/**
			 * @BXMType DbioCall
			 * @Desc insert a single employe info
			 */
			addCnt = dSmpEmpTst000.insert00(input);

		} catch (DasDuplicateKeyException de) {
			/**
			 * @BXMType ApplicationException
			 * @Desc throw application exception if employee id is already exists
			 */
			throw new DefaultApplicationException("BXME60007", new Object[] { input.getFeduEmpNo() } );
		}

		logger.debug("output = {}", addCnt);
		logger.debug("============== END ==============");

		return addCnt;
	}

	/**
	 * Update a single employee info.
	 *
	 * @param 	input	DSmpEmpTst000Dto
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Single Update", description = "Employee Info Single Update")
	public int modifyEmpInfAfterSelect(DSmpEmpTst000Dto input) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		/**
		 * @BXMType VariableDeclaration
		 */
		int modifyCnt = 0;
		
		dSmpEmpTst000 = DefaultApplicationContext.getBean(dSmpEmpTst000, DSmpEmpTst000.class);

		/**
		 * @BXMType DbioCall
		 * @Desc Update a single employee info
		 */
		modifyCnt = dSmpEmpTst000.update00(input);

		/**
		 * @BXMType IF
		 * @Desc There are no if modified data
		 */
		if (modifyCnt <= 0) {
			/**
			 * @BXMType ApplicationException
			 * @Desc throw application exception if there are no modified data
			 */
			throw new DefaultApplicationException("BXME60006", new Object[] { input.getFeduEmpNo() } );
		}


		logger.debug("output = {}", modifyCnt);
		logger.debug("============== END ==============");

		return modifyCnt;
	}

	/**
	 * Update a signle employee info with lock update function
	 *
	 * @param 	input	DSmpEmpTst000Dto
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Single Update", description = "Employee Info Single Update")
	public int modifyEmpInf(DSmpEmpTst000Dto input) throws DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		/**
		 * @BXMType VariableDeclaration
		 */
		int modifyCnt = 0;
		dSmpEmpTst000 = DefaultApplicationContext.getBean(DSmpEmpTst000.class);

		/**
		 * @BXMType DbioCall
		 * @Desc Lock row before update
		 */
		LockUpdater<DSmpEmpTst000Dto> lockUpdaterDEduEmp = dSmpEmpTst000.selectOneLock00(input, LockUpdate.FOR_UPDATE);

		/**
		 * @BXMType IF
		 * @Desc If there are no lock row
		 */
		if (lockUpdaterDEduEmp == null) {
			/**
			 * @BXMType ApplicationException
			 * @Desc throw application exception if there are no lock row
			 */
			throw new DefaultApplicationException("BXME0001", new Object[]{});
		}

		DSmpEmpTst000Dto lockDSmpEmpTst000Dto = lockUpdaterDEduEmp.updatable();

		/**
		 * @BXMType LogicalArea
		 * @Desc Mapping data to update
		 */
		{
			lockDSmpEmpTst000Dto.setFeduEmpNm(input.getFeduEmpNm());
			lockDSmpEmpTst000Dto.setFeduOccpNm(input.getFeduOccpNm());
			lockDSmpEmpTst000Dto.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			lockDSmpEmpTst000Dto.setFeduIpsaDt(input.getFeduIpsaDt());
			lockDSmpEmpTst000Dto.setFeduPayAmt(input.getFeduPayAmt());
			lockDSmpEmpTst000Dto.setFeduDeptNo(input.getFeduDeptNo());
		}

		/**
		 * @BXMType DbioCall
		 * @Desc Update a single employee info
		 */
		modifyCnt = lockUpdaterDEduEmp.update();

		logger.debug("output = {}", modifyCnt);
		logger.debug("============== END ==============");

		return modifyCnt;
	}

	/**
	 * Delete a single employee info
	 *
	 * @param 	input	DSmpEmpTst000Dto
	 * @return int
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Single Delete", description = "Employee Info Single Delete")
	public int removeEmpInf(DSmpEmpTst000Dto input) throws bxm.dft.app.DefaultApplicationException {

		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		/**
		 * @BXMType VariableDeclaration
		 */
		int removeCnt = 0;
		
		dSmpEmpTst000 = DefaultApplicationContext.getBean(dSmpEmpTst000, DSmpEmpTst000.class);
		
		/**
		 * @BXMType DbioCall
		 * @Desc Delete a single employee info
		 */
		removeCnt = dSmpEmpTst000.delete00(input);

		/**
		 * @BXMType IF
		 * @Desc if delete row num is not 1
		 */
		if (removeCnt != 1) {
			/**
			 * @BXMType ApplicationException
			 * @Desc throw application exception is delete row num is not 1
			 */
			throw new DefaultApplicationException("BXME60002", new Object[] { input.getFeduEmpNo() } );
		}

		logger.debug("output = {}", removeCnt);
		logger.debug("============== END ==============");

		return removeCnt;
	}
}

