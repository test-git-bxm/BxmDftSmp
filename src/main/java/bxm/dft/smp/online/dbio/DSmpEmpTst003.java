/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Thu May 02 15:21:14 KST 2019
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import org.apache.ibatis.annotations.Param;
import bxm.container.annotation.BxmDataAccess;

/**
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/DSmpEmpTst003.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "Sample DBIO")
public interface DSmpEmpTst003
{

	/**
	 * @TestValues 	feduEmpNo=7900;
	 */
	@BxmCategory()
	bxm.dft.smp.online.dbio.dto.DSmpEmpTst003selectList01Out selectMultiEmpList(
			@Param("feduEmpNo") java.lang.Integer feduEmpNo);
}