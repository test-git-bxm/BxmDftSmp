/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Thu May 02 15:20:58 KST 2019
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import org.apache.ibatis.annotations.Param;
import bxm.container.annotation.BxmDataAccess;
import bxm.das.annotation.DasLockUpdate;

/**
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/DSmpEmpTst001.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "Employee Info 01")
public interface DSmpEmpTst001
{

	/**
	 * Employee Info Multi-Select01
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory(logicalName = "Employee Info Multi-Select01")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectList01(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Multi-Select 02 - Using Service Input
	 * @TestValues 	feduEmpNm=;
	 */
	@BxmCategory(logicalName = "Employee Info Multi-Select 02")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectList02(
			bxm.dft.smp.online.service.dto.SSMP1002A002InDto sSMP1002A002InDto);

	/**
	 * Employee Info Single Select(Lock)
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@DasLockUpdate(table = "BXM400.SMP_EMP_TST")
	@BxmCategory(logicalName = "Employee Info Single Select(Lock)")
	bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto selectOneLock01(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * Employee Info Multi-Select(Lock)
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@DasLockUpdate(table = "BXM400.SMP_EMP_TST")
	@BxmCategory(logicalName = "Employee Info Multi-Select(Lock)")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectListLock01(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto);

	/**
	 * LockUpdate Query (get key) : Original ID = selectOneLock01
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory()
	bxm.context.das.LockUpdater<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectOneLock01(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto, bxm.context.das.LockUpdate lockUpdate);

	/**
	 * LockUpdate Query (get key) : Original ID = selectListLock01
	 * @TestValues 	rowId=;	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory()
	bxm.context.das.LockUpdater<java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto>> selectListLock01(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto dSmpEmpTst000Dto, bxm.context.das.LockUpdate lockUpdate);

	/**
	 * Employee Info Pagzing (Top-N)
	 * @TestValues 	input.feduEmpNo=;	input.feduEmpNm=;	input.feduOccpNm=;	input.feduMngrEmpNo=;	input.feduIpsaDt=;	input.feduPayAmt=;	input.feduDeptNo=;	pageNum=0;	pageCount=0;
	 */
	@BxmCategory(logicalName = "Employee Info Pagzing (Top-N)")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst001selectPage01OutDto> selectPage01(
			@Param("input") bxm.dft.smp.online.dbio.dto.DSmpEmpTst001selectPage01InDto input,
			@Param("pageNum") int pageNum, @Param("pageCount") int pageCount);

	/**
	 * @TestValues 	feduEmpNo=;	feduEmpNm=;	feduOccpNm=;	feduMngrEmpNo=;	feduIpsaDt=;	feduPayAmt=;	feduDeptNo=;
	 */
	@BxmCategory()
	java.lang.Long selectCount01(
			bxm.dft.smp.online.dbio.dto.DSmpEmpTst001selectPage01InDto dSmpEmpTst001selectPage01InDto);

	/**
	 * Employee Info Pagzing (Next-Key)
	 * @TestValues 	input.rowId=;	input.feduEmpNo=;	input.feduEmpNm=;	input.feduOccpNm=;	input.feduMngrEmpNo=;	input.feduIpsaDt=;	input.feduPayAmt=;	input.feduDeptNo=;	next.rowId=;	next.feduEmpNo=;	next.feduEmpNm=;	next.feduOccpNm=;	next.feduMngrEmpNo=;	next.feduIpsaDt=;	next.feduPayAmt=;	next.feduDeptNo=;	pageCount=0;
	 */
	@BxmCategory(logicalName = "Employee Info Pagzing (Next-Key)")
	java.util.List<bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto> selectPage02(
			@Param("input") bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto input,
			@Param("next") bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto next, @Param("pageCount") int pageCount);
}