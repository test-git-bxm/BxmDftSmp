/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Thu May 02 15:21:06 KST 2019
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import org.apache.ibatis.annotations.Param;
import bxm.container.annotation.BxmDataAccess;

/**
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/DSmpEmpTst002.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "Employee Info 02")
public interface DSmpEmpTst002
{

	/**
	 * Employee Info Select - if test
	 * @TestValues 	rowId=;	feduEmpNo=7841;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Select - if test")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectList01(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Select - choose(when,otherwise)
	 * @TestValues 	rowId=;	feduEmpNo=1;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=1;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Select - choose(when,otherwise)")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectList02(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Select - equalsIgnoreCase
	 * @TestValues 	rowId=;	feduEmpNo=1;	feduEmpNm=kdd;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Select - equalsIgnoreCase")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectList05(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Select - eq
	 * @TestValues 	rowId=;	feduEmpNo=1;	feduEmpNm=king;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Select - eq")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectList06(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Select - ==
	 * @TestValues 	rowId=;	feduEmpNo=2;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Select - ==")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectList07(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Update - set
	 * @TestValues 	rowId=;	feduEmpNo=1;	feduEmpNm=1;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Update - set")
	int update04(bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Update - trim
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Update - trim")
	int update03(bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Select - foreach(Using DTO)
	 * @TestValues 	master.feduEmpNo=;	master.feduEmpNm=;	master.feduOccpNm=;	master.feduMngrEmpNo=;	master.feduIpsaDt=;	master.feduPayAmt=;	master.feduDeptNo=;	master.detailCount=;
	 */
	@BxmCategory(logicalName = "Employee Info Select - foreach(Using DTO)")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList08OutDto> selectList08(
			@Param("master") bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList08InDto master);

	/**
	 * Employee Info Select - foreach(Using Array)
	 * @TestValues 	master.feduEmpNo=;	master.feduEmpNm=;	master.feduOccpNm=;	master.feduMngrEmpNo=;	master.feduIpsaDt=;	master.feduPayAmt=;	master.feduDeptNo=;	master.itemCount=;
	 */
	@BxmCategory(logicalName = "Employee Info Select - foreach(Using Array)")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList09OutDto> selectList09(
			@Param("master") bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList09InDto master);
}