package bxm.dft.smp.online.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.dft.app.DefaultApplicationException;
import bxm.dft.smp.online.service.dto.SSMP1001A001InDto;
import bxm.dft.smp.online.service.dto.SSMP1001A001OutDto;
import bxm.dft.smp.online.service.dto.SSMP1005A001InDto;
import bxm.dft.smp.online.service.dto.SSMP1005A001OutDto;
import bxm.dft.service.DefaultServiceExecutor;
import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;

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
@BxmCategory(logicalName = "Service Execute", description = "Service Execute")
public class MSmpIntrLinkCall {
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	/**
	 * Call internal service
	 * 
	 * @param input SSMP1001A001InDto
	 * @return SSMP1001A001OutDto
	 * @throws DefaultApplicationException
	 */
	@BxmCategory(logicalName = "Service Execute API Sample", description = "Service Execute API Sample")
	public SSMP1005A001OutDto callInternalLink(SSMP1005A001InDto input) 
			throws DefaultApplicationException {
		
		logger.debug("============== START ==============");
		logger.debug("input = {}", input);

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1001A001InDto calleeInput = new SSMP1001A001InDto();
		
		/**
		 * @BXMType LogicalArea
		 * @Desc internal service input data mapping
		 */
		{
			calleeInput.setFeduEmpNo(input.getFeduEmpNo());
		}

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1001A001OutDto calleeOutput = null;
		
		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1005A001OutDto output = new SSMP1005A001OutDto();
		
		/**
		 * @BXMType Try
		 */
		try {
			/**
			 * @BXMType ServiceExecutorCall
			 * @Desc internal service call
			 */
			calleeOutput = DefaultServiceExecutor.execute("SSMP1001A001", calleeInput);

		} catch (DefaultApplicationException e) {
			/**
			 * @BXMType ApplicationException
			 * @Desc throw exception when internal service throw checked exception
			 */
			throw new DefaultApplicationException("BXME60008", null, new Object[] {},  e);
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc output data mapping
		 */
		{
			output.setFeduEmpNo(calleeOutput.getFeduEmpNo());
			output.setFeduEmpNm(calleeOutput.getFeduEmpNm());
			output.setFeduOccpNm(calleeOutput.getFeduOccpNm());
			output.setFeduMngrEmpNo(calleeOutput.getFeduMngrEmpNo());
			output.setFeduIpsaDt(calleeOutput.getFeduIpsaDt());
			output.setFeduPayAmt(calleeOutput.getFeduPayAmt());  
			output.setFeduDeptNo(calleeOutput.getFeduDeptNo());
		}
		
		logger.debug("output = {}", output);
		logger.debug("============== END ==============");
		
		return output;
	}
}

