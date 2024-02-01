package bxm.dft.smp.online.bean;

import bxm.container.annotation.BxmBean;
import bxm.dft.app.DefaultApplicationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bxm.common.annotaion.BxmCategory;

/**
 * Employee Info Management 03
 * 
 * @author       Developer
 * @since BXM3.4, 2016.01.29
 */
@BxmBean
@BxmCategory(logicalName = "Error Log Test", description = "Error Log Test")
public class MSmpEmpInfMng04 {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void processBean(int seq, int count) throws DefaultApplicationException{
		logger.debug("Process Bean is called.");
		while(true){
			if(seq == count){
				throw new DefaultApplicationException("BXME30000", new Object[]{}
				, new Object[]{"Test Exception for error log test"});
			}
			seq++;
			this.processBean(seq, count);
		}
	}
}

