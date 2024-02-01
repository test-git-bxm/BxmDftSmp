package bxm.dft.smp.online.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.online.bean.MSmpIntrLinkCall;
import bxm.dft.smp.online.service.dto.SSMP1005A001InDto;
import bxm.dft.smp.online.service.dto.SSMP1005A001OutDto;


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
@BxmService("SSMP1005A")
@BxmCategory(logicalName = "Internal interlocking", description = "Internal interlocking")
public class SSMP1005A {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	private MSmpIntrLinkCall mSmpIntrLinkCall;
	
	@BxmServiceOperation("ssmp1005a001")
	@BxmCategory(logicalName = "Internal interlocking", description = "Internal interlocking(sync)")
	public SSMP1005A001OutDto ssmp1005a001(SSMP1005A001InDto input)
			throws DefaultApplicationException {

		logger.debug("============== SERVICE START ==============");
		logger.debug("input = {}", input);
		
		mSmpIntrLinkCall = DefaultApplicationContext.getBean(mSmpIntrLinkCall, MSmpIntrLinkCall.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1005A001OutDto output = new SSMP1005A001OutDto();

		/**
		 * @BXMType BeanCall
		 * @Desc Call bean method for Internal interlocking
		 */
		output = mSmpIntrLinkCall.callInternalLink(input);
		
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

