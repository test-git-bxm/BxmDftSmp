/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Thu May 02 15:19:21 KST 2019
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.das.annotation.DasLockUpdate;

/**
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/DSmpEmpTst000.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "Employee Information TST", table = "DbioTables", tableLogicalName = "DbioTableLogicalName", customerYn = "N", department = "DbioDepartment")
public interface DSmpEmpTst000
{

	/**
	 * Employee Info Single Select with PK
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Single Select")
	bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto selectOne00(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Single Select with PK(Lock)
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@DasLockUpdate(table = "BXM400.SMP_EMP_TST")
	@BxmCategory(logicalName = "Employee Info Single Select(Lock)")
	bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto selectOneLock00(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * LockUpdate Query (get key) : Original ID = selectOneLock00
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory()
	bxm.context.das.LockUpdater<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectOneLock00(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto, bxm.context.das.LockUpdate lockUpdate);

	/**
	 * Employee Info Update with PK
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Update")
	int update00(bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Delete Employee Info with PK
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Delete Employee Info")
	int delete00(bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Insert Employee Info with PK
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Insert Employee Info")
	int insert00(bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Select FOR UPDATE with PK
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Select FOR UPDATE")
	bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto selectOne01(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);
}