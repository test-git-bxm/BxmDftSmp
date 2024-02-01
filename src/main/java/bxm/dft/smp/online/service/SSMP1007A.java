package bxm.dft.smp.online.service;

import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.online.bean.MSmpEmpInfMng04;
import bxm.dft.smp.online.service.dto.SSMP1007A001OMM;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bxm.common.annotaion.BxmCategory;

/**
 * @file         bxm.dft.smp.online.service.SSMP1007A.java
 * @filetype     java source file
 * @brief
 * @author       Seungjin Chung
 * @version      0.1
 * @history
 * <pre>
 * 버전          성명                   일자              변경내용
 * -------       ----------------       -----------       -----------------
 * 0.1           Seungjin Chung       2017.06.27       신규 작성
 * </pre>
 */
@BxmService("SSMP1007A")
@BxmCategory(logicalName = "Error Log Test", description = "Error Log Test")
public class SSMP1007A {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private MSmpEmpInfMng04 mSmpEmpInfMng04;
	
	@BxmServiceOperation("ssmp1007a001")
	@BxmCategory(logicalName = "에러 로그 테스트 오퍼레이션", description = "에러 로그 테스트 오퍼레이션")
	public SSMP1007A001OMM ssmp1007a001 (SSMP1007A001OMM input) throws DefaultApplicationException{
		SSMP1007A001OMM output = new SSMP1007A001OMM();
		
		mSmpEmpInfMng04 = DefaultApplicationContext.getBean(mSmpEmpInfMng04, MSmpEmpInfMng04.class);
		
		logger.debug("Start Service.");
		mSmpEmpInfMng04.processBean(0, input.getFeduEmpNo());
		
		return output;
	}
}

