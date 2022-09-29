package kr.co.eodeatzy.business;

import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;


public interface businessService {

	// 1-1) 사업자 정보 조회
	public businessUserDTO b_userInfo(String u_b_id) throws Exception;
	
	// 1-2) 사업자 정보 수정
	public int businessUpdate(Map<String, Object> buupmap) throws Exception;

	// 1-3) 사업자 탈퇴
	public int b_unregister(String u_b_id) throws Exception;
	
	// 2-1) 메뉴 정보 조회
	public List<businessMenuDTO> selectmenu() throws Exception;
	
	// 2-2) 메뉴 정보 수정
	public int updatemenu(Map<String, Object> upmap) throws Exception;
	
	// 2-3) 메뉴 삭제
	public int menudelete(Map<String, Object> deleteMenumap) throws Exception;
	
	// 2-4) 메뉴 상세 조회
	public Map menudetail(Map<String, Object> demap) throws Exception;

	// 2-5) 메뉴 추가
	public int insertmenu(Map<String, Object> inmap) throws Exception; 
	
	// 3-1) 가게 정보 조회
	public businessStoreDTO storeList(String u_b_id) throws Exception;
	
	// 3-2) 가게 정보 수정
	public int storeNameUpdate(Map<String, Object> stupmap) throws Exception;
	
	// 4-1) 주문 확인
	public List<businessOrderDTO> orderCheck() throws Exception;
	
	// 4-2) 주문 확인 상세
	public List<businessOrderDTO> orderdetail(String o_number) throws Exception;
	
	// 4-3) 메뉴 상세 조회
	public Map orderMemo(Map<String, Object> memap) throws Exception;
	
	// 4-4) 고객 메모 수정 
	public int updateMemo(Map<String, Object> upmemap) throws Exception;


}
